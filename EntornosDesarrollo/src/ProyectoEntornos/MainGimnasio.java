package ProyectoEntornos;

import java.util.Scanner;

public class MainGimnasio {
	
	private static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		
		Gimnasio gimnasio=new Gimnasio("TerraFit", "Madrid");
		
		
		Zona zona1=new Zona("Musculacion");
		
		Zona zona2=new Zona("Piscina");
		
		Zona zona3=new Zona("Cardio");
		
		
		gimnasio.annadirZona(zona1);
		
		gimnasio.annadirZona(zona2);
		
		gimnasio.annadirZona(zona3);
		
		
		int opcion;
		
		do {
			
			System.out.println("OPCIONES: 1-DAR ALTA CLIENTE, 2-DAR BAJA CLIENTE, 3-ALTA EMPLEADO, 4-DESPIDO EMPLEADO,"
					+ " 5- CAMBIAR MONITOR DE ZONA, 6-MOSTRAR \nCLIENTES, 7-MOSTRAR EMPLEADOS ORDENADO POR SUELDO"
					+ ", 8-VER INSTALACIONES O 9-SALIR DLE PROGRAMA");
			
			opcion=entrada.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				System.out.println("HAS ELEGIDO DAR DE ALTA UN CLIENTE");
				
				AltaCliente(gimnasio);
				
				break;
				
			case 2:
				
				System.out.println("HAS ELEGIDO DAR DE BAJA UN CLIENTE");
				
				bajaCliente(gimnasio);
				
				break;
				
			case 3:
				
				System.out.println("HAS ELEGIDO DAR DE ALTA UN EMPLEADO");
				
				altaEmpleado(gimnasio);
				
				break;
				
			case 4:
				
				System.out.println("HAS ELEGIDO DAR DE BAJA UN EMPLEADO");
				
				despidoEmpleado(gimnasio);
				
				break;
				
			case 5:
				
				System.out.println("HAS ELEGIDO CAMBIAR MONITOR DE ZONA");
				
				cambiarZonaMonitor(gimnasio);
	
				break;
	
			case 6:
				
				System.out.println("HAS ELEGIDO MOSTRAR LOS CLIENTES");
				
				mostrarClientes(gimnasio);
	
				break;
	
			case 7:
				
				System.out.println("HAS ELEGIDO MOSTRAR LOS EMPLEADOS ORDENADOR POR EL SUELDO");
				
				ordenarEmpleadosNombre(gimnasio);
	
				break;
	
			case 8:
				
				System.out.println("HAS ELEGIDO VER LAS INSTALACIONES AL COMPLETO");
				
				VerInstalacionesCompleta(gimnasio);
				
				break;
				
			case 9:
				
				System.out.println("HAS ELEGIDO SALIR DEL PROGRAMA");
				
				break;
				
			default:
				
				System.out.println("ERROR, escoge una opcion entre 1-10");
				
				}
			
		
		}while(opcion!=9); 

	}
	
	public static void AltaCliente(Gimnasio gimnasio) {
		
		System.out.println("Dime que tipo de paquete tiene el cliente: 1-BASICO, 2-ESTANDAR- 3-PREMIUM");
		
		int opcion=entrada.nextInt();
		
		
		System.out.println("Dime el dni del cliente");
		
		String dni=entrada.next();
		
		System.out.println("Dime el nombre del cliente");
		
		String nombre=entrada.next();
		
		System.out.println("Dime el apellido del cliente");
		
		String apellido=entrada.next();
		
		System.out.println("Dime el numero de telefono del cliente");
		
		String tel=entrada.next();
		
		System.out.println("Dime el correo electronico del cliente");
		
		String correo=entrada.next();
		
		System.out.println("Dime la direccion del cliente");
		
		String direccion=entrada.next();
		
		Cliente cliente = null;
		
		if(opcion==1) {
			
			cliente=new AfiliadoBasico(dni, nombre, apellido, tel, correo, direccion);
			
			System.out.println("Cliente con el paquete Afiliado Basico dado de alta correctamente");
			
		}
		if(opcion==2) {
			
			System.out.println("Dime cuanto vas a pagar en el primer pago");
			
			double PP=entrada.nextDouble();
			
			System.out.println("Dime cuanto vas a pagar en el segundo pago");
			
			double SP=entrada.nextDouble();
			
			if(PP+SP==400) {
				
				cliente=new AfiliadoEstandar(dni, nombre, apellido, tel, correo, direccion, PP, SP);
				
				System.out.println("Cliente con el paquete Afiliado Estandar dado de alta correctamente");
				
			}
		
		}
		if(opcion==3){
			
			cliente=new AfiliadoPremium(dni, nombre, apellido, tel, correo, direccion);
			
			System.out.println("Cliente con el paquete Afiliado Premium dado de alta correctamente");
			
			
		}
		
		gimnasio.annadirCliente(cliente);
		
		
	}
	
	public static void bajaCliente(Gimnasio gimnasio) {
		
		System.out.println("Dime el codigo del cliente a dar de baja");
		
		int cod=entrada.nextInt();
		
		Cliente cliente=gimnasio.obtenerCliente(cod);
		
		gimnasio.borrarCliente(cliente);
		
		
	}
	
	public static void mostrarClientes(Gimnasio gimnasio) {
		
		for(Cliente c: gimnasio.getClientes()) {
			
			System.out.println(c.toString());
		}
	}
	
	public static void altaEmpleado(Gimnasio gimnasio) {
		
		System.out.println("Pulsa 1-Monitor o pulsa 2-Supervisor");
		
		int opcion=entrada.nextInt();
		
		System.out.println("Dime el dni del empleado");
		
		String dni=entrada.next();
		
		System.out.println("Dime el nombre del empleado");
		
		String nom=entrada.next();
		
		Empleado emp;
		
		if(opcion==1) {
			
			System.out.println("Dime el nombre de la zona a la que se va a asignar este Monitor");
			
			String nombreZona=entrada.next();
			
			Zona zona=gimnasio.obtenerZona(nombreZona);
			
			
			System.out.println("Dime los años de contrato que va a tener");
			
			int annos=entrada.nextInt();
			
			emp=new Monitor(dni, nom, zona, annos);
			
			zona.annadirMonitor((Monitor) emp); //ERROR>
			
			System.out.println("Monitor dado de alta correctamente");
			
		}
		else {
			
			System.out.println("Dime la productividad del supervisor");
			
			int pro=entrada.nextInt();
			
			emp=new Supervisor(dni, nom, pro);
			
			System.out.println("Supervisor dado de alta correctamente");
			
		}
		
		gimnasio.annadirEmpleado(emp);
		
	}
	
	public static void despidoEmpleado(Gimnasio gimnasio) {
		
		System.out.println("Dime el codigo del empleado a borrar");
		
		int cod=entrada.nextInt();
		
		Empleado emp=gimnasio.obtenerEmpleado(cod);
		
		gimnasio.borrarEmpleado(emp);
		
	}
	
	public static void cambiarZonaMonitor(Gimnasio gimnasio) {
		
		System.out.println("Dime el codigo del monitor a cambiar de zona");
		
		int cod=entrada.nextInt();
		
		System.out.println("Dime el nombre de la zona a la que se va a cambiar el monitor");
		
		String nomZona=entrada.next();
		
		
		Monitor monitor=gimnasio.obtenerMonitorPorZona(cod);
		
		Zona zonaNueva=gimnasio.obtenerZona(nomZona);
		
		Zona zonaActual=monitor.getZona();
		
		
		zonaNueva.annadirMonitor(monitor);
		
		zonaActual.borrarMonitor(monitor);
		
		monitor.setZona(zonaNueva);
		
	
	}
	
	public static void ordenarEmpleadosNombre(Gimnasio gimnasio) {
		
		gimnasio.ordenarEmpleadoNombre();
		
		for(Empleado e: gimnasio.getEmpleados()) {
			
			System.out.println(e.toString());
			
		}
	}
	
	public static void VerInstalacionesCompleta(Gimnasio gimnasio) {
		
		System.out.println(gimnasio.toString());
	}
	
	
}
