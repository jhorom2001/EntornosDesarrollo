package mensajeria.modelo;

public class APIMensajeria {

	private static APIMensajeria instancia=new APIMensajeria();
	
	private Mensajeria mensajeria;
	
	private APIMensajeria() {
		mensajeria=new Mensajeria();
	}
	
	public static APIMensajeria getInstance() {
		return instancia;
	}
	
	public void altaMensajero(String nombre, double sueldo, int maximoEnvios) {
		Mensajero mensajero=new Mensajero(nombre,sueldo, maximoEnvios);
		mensajeria.altaMensajero(mensajero);
	}
	
	public int buscarMensajero(String nombre) {
		return mensajeria.buscarMensajero(nombre);
	}
	
	public void eliminarMensajero(int codigo) {
		mensajeria.bajaMensajero(codigo);
	}
	
	public String[] obtenerMensajeros() {
		
		Mensajero[] mensajeros=mensajeria.obtenerMensajeros();
		String[] mensajerosString=null;
		if (mensajeros!=null) {
			mensajerosString=new String[mensajeros.length];
			for (int i=0;i<mensajeros.length; i++ ) {
				mensajerosString[i]=mensajeros[i].getCodigo()+"-";
				mensajerosString[i]+=mensajeros[i].getNombre()+"-";
				mensajerosString[i]+=mensajeros[i].getNumMax()+"-";
				mensajerosString[i]+=mensajeros[i].getNumEnvios();
			}
		}
		return mensajerosString;
	}
}
