package mensajeria.modelo;

import java.util.ArrayList;

public class Mensajeria {
	
	private final int MAXIMO_MENSAJEROS=50;
	private int numMensajeros=0;
	private final int MAXIMO_ENVIOS=1000;
	private int numEnvios=0;
	
	private Mensajero[] mensajeros;
	private Envio[] envios;
	
	public Mensajeria() {
		mensajeros=new Mensajero[MAXIMO_MENSAJEROS];
		envios=new Envio[MAXIMO_ENVIOS];		
	}
	
	public boolean altaMensajero(Mensajero mensajero) {
		if (numMensajeros<MAXIMO_MENSAJEROS) {
			mensajeros[numMensajeros]=mensajero;
			numMensajeros++;
			return true;
		}
		return false;
	}
	
	public boolean bajaMensajero(int codigo) {
		for (int i=0; i<numMensajeros; i++) {
			if (mensajeros[i].getCodigo()==codigo) {
				mensajeros[i]=mensajeros[numMensajeros-1];
				mensajeros[numMensajeros-1]=null;
				numMensajeros--;
				return true;
			}
		}
		return false;
	}
	
	public boolean altaEnvio(Envio envio) {
		if (numEnvios<MAXIMO_ENVIOS) {
			envios[numEnvios]=envio;
			numEnvios++;
			return true;
		}
		return false;
	}
	
	public boolean bajaEnvio(int codigo) {
		for (int i=0; i<numEnvios; i++) {
			if (envios[i].getCodigo()==codigo) {
				envios[i]=envios[numMensajeros-1];
				envios[numEnvios-1]=null;
				numEnvios--;
				return true;
			}
		}
		return false;
	}


	public Envio obtenerEnvio(int codigo) {
		for (int i=0; i<numEnvios; i++) {
			if (envios[i].getCodigo()==codigo) {
				return envios[i]; 
			}
		}
		return null;
	}
	
	public Mensajero obtenerMensajeroLibre() {
		for (int i=0; i<numMensajeros; i++) {
			if (mensajeros[i].isLibre()) {
				return mensajeros[i]; 
			}
		}
		return null;
	}
	
	public boolean asignarEnvio(Envio envio) {
		Mensajero mensajero=obtenerMensajeroLibre();
		if (mensajero!=null) {
			mensajero.asignarEnvio(envio);
		}
		return false;
	}
	
	public void entregaEnvio(Envio envio) {
		envio.setEstado(TipoEstadoEnvio.ENTREGADO);
		envio.getMensajero().desasignarEnvio(envio.getCodigo());
	}
	
	public Envio[] listaEnviosEspera() {
		ArrayList<Envio> enviosEnEspera=new ArrayList<Envio>();
		for (int i=0; i<numEnvios; i++) {
			if (envios[i].getEstado()==TipoEstadoEnvio.EN_ESPERA) {
				enviosEnEspera.add(envios[i]);
			}
		}
		Envio[] enviosE=new Envio[enviosEnEspera.size()];
		enviosEnEspera.toArray(enviosE);
		return enviosE;
	}
	
	public int buscarMensajero(String nombre) {
		for (int i=0; i<numMensajeros; i++) {
			if (mensajeros[i].getNombre().equals(nombre)) {
				return mensajeros[i].getCodigo(); 
			}
		}		
		return -1;
	}

	public Mensajero[] obtenerMensajeros() {
		Mensajero[] mensajeros=new Mensajero[numMensajeros];
		for (int i=0; i<numMensajeros; i++) {
			mensajeros[i]=this.mensajeros[i];
		}
		
		return mensajeros;
	}
	
	
	
}
