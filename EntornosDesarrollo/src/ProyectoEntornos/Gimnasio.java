package ProyectoEntornos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Gimnasio {
	
	private String nombre;
	
	private String ciudad;
	
	private ArrayList<Zona> zonas;
	
	private ArrayList<Cliente> clientes;
	
	private ArrayList<Empleado> empleados;
	
	
	public Gimnasio(String nombre, String ciudad) {
		
		this.nombre=nombre;
		
		this.ciudad=ciudad;
		
		zonas=new ArrayList<Zona>();
		
		clientes=new ArrayList<Cliente>();
		
		empleados=new ArrayList<Empleado>();
		
	}

	public String getNombre() {
		
		return nombre;
		
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}

	public String getCiudad() {
		
		return ciudad;
		
	}

	public ArrayList<Zona> getZonas() {
		
		return zonas;
		
	}

	public ArrayList<Cliente> getClientes() {
		
		return clientes;
		
	}
	
	public ArrayList<Empleado> getEmpleados() {
		
		return empleados;
		
	}

	public void annadirZona(Zona zona) {
		
		zonas.add(zona);
		
	}
	
	public void annadirCliente(Cliente cliente) {
		
		clientes.add(cliente);
		
	}
	
	public void annadirEmpleado(Empleado empleado) {
		
		empleados.add(empleado);
		
	}
	
	public void borrarCliente(Cliente cliente) {
		
		Iterator<Cliente> it=clientes.iterator();
		
		while(it.hasNext()) {
			
			Cliente c=it.next();
			
			if(c.getCodigoCliente()==cliente.getCodigoCliente()) {
				
				it.remove();
			}
		}
	}
	
	public Cliente obtenerCliente(int cod) {
		
		for(Cliente c: clientes) {
			
			if(c.getCodigoCliente()==cod) {
				
				return c;
			}
		}
		
		return null;
	}
	
	public Zona obtenerZona(String nombre) {
		
		for(Zona z: zonas) {
			
			if(z.getNombre().equalsIgnoreCase(nombre)) {
				
				return z;
				
			}
		}
		
		return null;
	}
	
	public Empleado obtenerEmpleado(int numCod) {
		
		for(Empleado e: empleados) {
			
			if(e.getCodigoEmpleado()==numCod) {
				
				return e;
				
			}
		}
		
		return null;
	}
	
	public void borrarEmpleado(Empleado empleado) {
		
		Iterator<Empleado> it=empleados.iterator();
		
		while(it.hasNext()) {
			
			Empleado e=it.next();
			
			if(e.getCodigoEmpleado()==empleado.getCodigoEmpleado()) {
				
				it.remove();
			}
		}
	}
	
	public Monitor obtenerMonitorPorZona(int cod) {
		
		Monitor m;
		
		for(Zona z: zonas) {
			
			m=z.obtenerMonitor(cod);
			
			if(m!=null) {
				
				return m;
			}
		}
		
		return null;
	}
	
	public void ordenarEmpleadoNombre() {
		
		Collections.sort(empleados);
		
	}

	public String toString() {
		
		return "Gimnasio [NOMBRE:" + nombre + ", CIUDAD:" + ciudad + ", ZONAS:" + zonas + ", CLIENTES:" + clientes
				+ "]";
	}
	
	
}
