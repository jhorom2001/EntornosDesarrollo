package ProyectoEntornos;

public class AfiliadoPremium extends Cliente {
	
	private boolean piscina;
	
	private boolean merchandisingGratis;
	
	private double costeAnual;
	
	
	public AfiliadoPremium(String dni, String nombre, String apellido, String numTelefono, String correoElectronico, String direccion) {
		
		super(dni, nombre, apellido, numTelefono, correoElectronico, direccion);
		
		piscina=true;
		
		merchandisingGratis=true;
		
		costeAnual=500;
		
	}

	public boolean isPiscina() {
		
		return piscina;
		
	}

	public boolean isMerchandisingGratis() {
		
		return merchandisingGratis;
		
	}

	public double getCosteAnual() {
		
		return costeAnual;
		
	}

	public String toString() {
		
		return super.toString() + "AfiliadoPremium [piscina=" + piscina + ", merchandisingGratis=" + merchandisingGratis + ", costeAnual="
				+ costeAnual + " euros"  + "]";
	}
	
	
	
	

}
