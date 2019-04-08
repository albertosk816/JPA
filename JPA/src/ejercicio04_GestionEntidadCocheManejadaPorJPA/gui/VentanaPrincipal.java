package ejercicio04_GestionEntidadCocheManejadaPorJPA.gui;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	public VentanaPrincipal () {
		this.setBounds(0, 0, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane jtabbedPane = new JTabbedPane();
		
		jtabbedPane.add("Gesti�n de coches", new PanelGestionCoche());
		
		this.setContentPane(jtabbedPane);
	}

}
