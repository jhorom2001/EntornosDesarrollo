package ProyectoEntornos;

public abstract class Empleado implements Comparable<Empleado> {
	
	protected int codigoEmpleado;
	
	protected String dni;
	
	protected String nombre;
	
	protected double sueldo;
	
	protected static int cont=1;
	
	
	public Empleado(String dni, String nombre, double sueldo) {
		
		codigoEmpleado=cont++;
		
		this.dni=dni;
		
		this.nombre=nombre;
		
		this.sueldo=sueldo;
		
	}

	public int getCodigoEmpleado() {
		
		return codigoEmpleado;
		
	}

	public String getDni() {
		
		return dni;
		
	}

	public String getNombre() {
		
		return nombre;
		
	}

	public double getSueldo() {
		
		return sueldo;
		
	}
	
	public abstract void modificarSueldo(int cantidad);
	
	public int compareTo(Empleado o) {
		
		return this.nombre.compareTo(o.nombre);
		
	}

	public String toString() {
		
		return "Empleado [codigoEmpleado:" + codigoEmpleado + ", dni:" + dni + ", nombre:" + nombre + ", sueldo:"
				+ sueldo + " euros" +  "]";
	}

}
