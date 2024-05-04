package mensajeria.principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mensajeria.vistas.AltaMensajeroVista;
import mensajeria.vistas.BajaMensajeroVista;
import mensajeria.vistas.ListadoMensajeroVista;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class PantallaInicio extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JMenuItem altaMensajeroMenuItem;
	private JMenuItem bajaMensajeroMenuItem;
	private JMenuItem altaEnvioMenuItem;
	private JMenuItem bajaEnvioMenuItem;
	private JMenuItem listadoMenMenuItem;
	
	/**
	 * Create the frame.
	 */
	public PantallaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 381);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mensajeroMenu = new JMenu("Mensajero");
		menuBar.add(mensajeroMenu);
		
		altaMensajeroMenuItem = new JMenuItem("Alta Mensajero");
		mensajeroMenu.add(altaMensajeroMenuItem);
		altaMensajeroMenuItem.addActionListener(this);
		
		bajaMensajeroMenuItem = new JMenuItem("Baja Mensajero");
		mensajeroMenu.add(bajaMensajeroMenuItem);
		bajaMensajeroMenuItem.addActionListener(this);
		
		JMenu envioMenu = new JMenu("Envio");
		menuBar.add(envioMenu);

		
		altaEnvioMenuItem = new JMenuItem("Alta envio");
		envioMenu.add(altaEnvioMenuItem);
		altaEnvioMenuItem.addActionListener(this);
		
		bajaEnvioMenuItem = new JMenuItem("Baja Envio");
		envioMenu.add(bajaEnvioMenuItem);
		bajaEnvioMenuItem.addActionListener(this);
		
		JMenuItem asignarEnvioMenuItem = new JMenuItem("Asignar Envio");
		envioMenu.add(asignarEnvioMenuItem);
		
		JMenuItem entregaEnvioMenuItem = new JMenuItem("Entrega Envio");
		envioMenu.add(entregaEnvioMenuItem);
		
		JMenu listadosMenu = new JMenu("Listados");
		menuBar.add(listadosMenu);
		
		listadoMenMenuItem = new JMenuItem("Listado mensajeros");
		listadosMenu.add(listadoMenMenuItem);
		listadoMenMenuItem.addActionListener(this);
		
		JMenuItem EnviosEsperasMenuItem = new JMenuItem("Envios en Espera");
		listadosMenu.add(EnviosEsperasMenuItem);
		

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==altaMensajeroMenuItem) {
			AltaMensajeroVista altaMensajeroVista=
				new AltaMensajeroVista();
			setContentPane(altaMensajeroVista);
			setVisible(true);
			
		}
		else if (e.getSource()==bajaMensajeroMenuItem) {
			BajaMensajeroVista bajaMensajeroVista=
					new BajaMensajeroVista();
				setContentPane(bajaMensajeroVista);
				setVisible(true);
		}
		else if (e.getSource()==listadoMenMenuItem) {
			System.out.println("Listados mensajeros");
			ListadoMensajeroVista listadoMensajeroVista=
					new ListadoMensajeroVista();
				setContentPane(listadoMensajeroVista);
				setVisible(true);
		}
		else {
			System.out.println("Others");
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			setVisible(true);
			
		}
		
	}

}
