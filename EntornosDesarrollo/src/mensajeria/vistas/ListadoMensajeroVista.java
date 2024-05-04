package mensajeria.vistas;

import javax.swing.JPanel;

import mensajeria.controlador.ListadoMensajeroControlador;
import mensajeria.controlador.ListadoMensajeroControladorInterfaz;

import java.awt.Font;

import javax.swing.JLabel;

public class ListadoMensajeroVista extends JPanel {

	/**
	 * Create the panel.
	 */
	public ListadoMensajeroVista() {
		setLayout(null);
	
		JLabel titulo = new JLabel("LISTADO MENSAJEROS");
		titulo.setFont(new Font("Dialog", Font.BOLD, 18));
		titulo.setBounds(50, 22, 232, 34);
		add(titulo);
		
		JLabel cabecera = new JLabel("Codigo-Nombre-Max.Envios-Envios actuales");
		cabecera.setFont(new Font("Dialog", Font.BOLD, 14));
		cabecera.setBounds(50, 50, 392, 43);
		add(cabecera);
		
		
		ListadoMensajeroControladorInterfaz controlador=
				new ListadoMensajeroControlador();
		String[] mensajeros= controlador.listadoMensajeros();
		
		if (mensajeros!=null) {
			JLabel[] listaMensajeros=new JLabel[mensajeros.length];
			for (int i=0; i<mensajeros.length; i++) {
				listaMensajeros[i]=new JLabel(mensajeros[i]);
				listaMensajeros[i].setBounds(50, 80+i*20, 362, 38);
				add(listaMensajeros[i]);
			}
		}

	}

}
