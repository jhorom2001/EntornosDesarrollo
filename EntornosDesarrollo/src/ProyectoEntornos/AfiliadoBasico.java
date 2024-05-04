package ProyectoEntornos;

public class AfiliadoBasico extends Cliente {
	
	private double costeMensual;
	
	private boolean ventajas;
	
	
	public AfiliadoBasico(String dni, String nombre, String apellido, String numTelefono, String correoElectronico, String direccion) {
		
		super(dni, nombre, apellido, numTelefono, correoElectronico, direccion);
		
		costeMensual=40;
		
		ventajas=false;
		
	}

	public double getCosteMensual() {
		
		return costeMensual;
		
	}

	public boolean isVentajas() {
		
		return ventajas;
		
	}

	public String toString() {
		
		return super.toString() + "AfiliadoBasico [costeMensual:" + costeMensual + " euros, ventajas:" + ventajas + "]";
		
	}
	

}
