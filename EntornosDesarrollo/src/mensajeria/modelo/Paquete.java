package mensajeria.modelo;

public class Paquete extends Envio{
	
	private double precioKilo;
	private double peso;
	
	public Paquete(String fecha, 
			String direccionOrigen, 
			String direccionDestino,
			double precioKilo,
			double peso) {
		super(fecha, direccionOrigen, direccionDestino);
		// TODO Auto-generated constructor stub
		this.precioKilo=precioKilo;
		this.peso=peso;
	}
	
	
}
