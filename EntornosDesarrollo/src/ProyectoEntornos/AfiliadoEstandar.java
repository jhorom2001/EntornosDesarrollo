package ProyectoEntornos;

public class AfiliadoEstandar extends Cliente {
	
	private boolean zonaBoxeo;
	
	private double costePrimerPago;
	
	private double costeSegundoPago;
	
	private double costeAnual;
	
	
	public AfiliadoEstandar(String dni, String nombre, String apellido, String numTelefono, String correoElectronico, String direccion,
			double costePrimerPago, double costeSegundoPago ){
		
		super(dni, nombre, apellido, numTelefono, correoElectronico, direccion);
		
		costeAnual=400;
		
		this.costePrimerPago=costePrimerPago;
		
		this.costeSegundoPago=costeSegundoPago;
		
		zonaBoxeo=true;
		
	}

	public boolean isZonaBoxeo() {
		
		return zonaBoxeo;
		
	}

	public double getCostePrimerPago() {
		
		return costePrimerPago;
		
	}

	public double getCosteSegundoPago() {
		
		return costeSegundoPago;
		
	}

	public double getCosteAnual() {
		
		return costeAnual;
		
	}

	public void setCostePrimerPago(double costePrimerPago) {
		
		this.costePrimerPago = costePrimerPago;
		
	}

	public void setCosteSegundoPago(double costeSegundoPago) {
		
		this.costeSegundoPago = costeSegundoPago;
		
	}

	public String toString() {
		
		return super.toString() + "AfiliadoEstandar [zonaBoxeo:" + zonaBoxeo + ", costePrimerPago:" + costePrimerPago
				+ " euros, costeSegundoPago:" + costeSegundoPago + " euros, costeAnual:" + costeAnual + " euros" + "]";
	}
	
}
