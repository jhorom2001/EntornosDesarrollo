package ProyectoEntornos;

public class Monitor extends Empleado {
	
	private Zona zona;
	
	private int annosContrato;
	
	
	public Monitor(String dni, String nombre, Zona zona, int annosContrato) {
		
		super(dni, nombre, 1200);
		
		this.zona=zona;
		
		this.annosContrato=annosContrato;
		
		
	}

	public Zona getZona() {
		
		return zona;
		
	}

	public int getAnnosContrato() {
		
		return annosContrato;
		
	}
	
	public void setZona(Zona zona) {
		
		this.zona = zona;
		
	}

	public void modificarSueldo(int cantidad) {
		
		sueldo=sueldo+cantidad;
		
	}

	public String toString() {
		
		return "Monitor [codigoEmpleado: " + codigoEmpleado + ", nombre:" + nombre + " sueldo: " + sueldo + " , zona:"
		+ zona.getNombre() + ", annosContrato:" + annosContrato + "]";
	}

}
