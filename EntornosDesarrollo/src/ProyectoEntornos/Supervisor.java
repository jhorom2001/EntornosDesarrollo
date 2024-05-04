package ProyectoEntornos;

public class Supervisor extends Empleado {
	
	private double productividad;
	
	
	public Supervisor (String dni, String nombre, double productividad){
		
		super(dni, nombre, 1800+productividad);
		
		this.productividad=productividad;
		
	}

	public double getProductividad() {
		
		return productividad;
		
	}
	
	public  void modificarSueldo(int cantidad) {
		
		sueldo=sueldo+cantidad;
		
	}

	public String toString() {
		
		return  "Supervisor [codigoEmpleado: " + codigoEmpleado + ", nombre:" + nombre + " sueldo: " + sueldo + "euros "
				+ " y productividad " + productividad + "]";
	}
	

}
