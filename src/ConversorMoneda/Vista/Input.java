package ConversorMoneda.Vista;

import javax.swing.*;

public class Input {
	public double Input() {
		String cantidad = JOptionPane.showInputDialog(null,"Ingresa la cantidad de deinero que desea convertir:",
				null, JOptionPane.QUESTION_MESSAGE);
		
		try {
            double value = Double.parseDouble(cantidad);
            return value;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido");
            VistaMenu menu = new VistaMenu();
            menu.vistaMenu();
        }
		return 0;
	}
	
}
