package ConversorMoneda.Vista;

import javax.swing.JOptionPane;

public class VistaContinuar {
	
	public void continuar() {
	
	int opcion = JOptionPane.showConfirmDialog(null, "Desea continuar?", null, JOptionPane.YES_NO_CANCEL_OPTION);
	
		if (opcion == JOptionPane.YES_OPTION) {
			VistaMenu menu = new VistaMenu();
			menu.vistaMenu();
		} else if (opcion == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
		} else if (opcion == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa Terminado");
		}
	
	}
}
