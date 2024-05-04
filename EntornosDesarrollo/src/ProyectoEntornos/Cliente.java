package ProyectoEntornos;

public class Cliente {
	
	private int codigoCliente;
	
	private String dni;
	
	private String nombre;
	
	private String apellido;
	
	private String numTelefono;
	
	private String correoElectronico;
	
	private String direccion;
	
	private static int cont=1;
	
	
	public Cliente(String dni, String nombre, String apellido, String numTelefono, String correoElectronico, String direccion) {
		
		codigoCliente=cont++;
		
		this.dni=dni;
		
		this.nombre=nombre;
		
		this.apellido=apellido;
		
		this.numTelefono=numTelefono;
		
		this.correoElectronico=correoElectronico;
		
		this.direccion=direccion;
		
	}

	public int getCodigoCliente() {
		
		return codigoCliente;
		
	}

	public String getDni() {
		
		return dni;
		
	}

	public String getNombre() {
		
		return nombre;
		
	}

	public String getApellido() {
		
		return apellido;
		
	}

	public String getNumTelefono() {
		
		return numTelefono;
		
	}

	public String getCorreoElectronico() {
		
		return correoElectronico;
		
	}

	public String getDireccion() {
		
		return direccion;
		
	}
	
	public String toString() {
		
		return "Cliente [codigoCliente:" + codigoCliente + ", dni:" + dni + ", nombre:" + nombre + ", apellido:"
				+ apellido + ", numTelefono:" + numTelefono + ", correoElectronico:" + correoElectronico
				+ ", direccion:" + direccion + "]";
	}
	
}
