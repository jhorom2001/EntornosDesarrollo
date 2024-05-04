package ProyectoEntornos;

import java.util.ArrayList;

import java.util.Iterator;

public class Zona {
	
	private String nombre;
	
	private ArrayList<Monitor> monitores;
	
	private int capacidad;
	
	private int capacidadEmpleados;
	
	
	public Zona(String nombre) { 
		
		this.nombre=nombre;
		
		monitores=new ArrayList<Monitor>();
		
		capacidad=15;
		
		capacidadEmpleados=3;
		
	}

	public String getNombre() {
		
		return nombre;
		
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}

	public int getCapacidad() {
		
		return capacidad;
		
	}

	public void setCapacidad(int capacidad) {
		
		this.capacidad = capacidad;
		
	}

	public ArrayList<Monitor> getMonitores() {
		
		return monitores;
		
	}
	
	public void annadirMonitor(Monitor monitor) {
		
		if(monitores.size()<capacidadEmpleados) {
			
			monitores.add(monitor);
			
		}
		else {
			
			System.out.println("No se pueden añadir mas Empleados");
		}
		
		
	}
	
	public void borrarMonitor(Empleado empleado) {
		
		Iterator<Monitor> it=monitores.iterator();
		
		while(it.hasNext()) {
			
			Empleado p=it.next();
			
			if(p.getCodigoEmpleado()==empleado.getCodigoEmpleado()) {
				
				it.remove();
				
			}
		}
	}
	
	public Monitor obtenerMonitor(int cod) {
		
		for(Monitor m: monitores) {
			
			if(m.getCodigoEmpleado()==cod) {
				
				return m;
			}
		}
		
		return null;
		
	}

	public String toString() {
		
		return "Zona [nombre:" + nombre + ", monitores:" + monitores + ", capacidad:" + capacidad + " personas" +  "]";
	}

}
