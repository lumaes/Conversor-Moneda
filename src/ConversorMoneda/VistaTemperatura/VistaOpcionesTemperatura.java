package ConversorMoneda.VistaTemperatura;

import javax.swing.JOptionPane;

import ConversorMoneda.UtilesTemperatura.ConversorTemp;
import ConversorMoneda.Vista.Input;

public class VistaOpcionesTemperatura {
	
	public void opcionesTemperaturas() {
		
		String opcion = (String) JOptionPane.showInputDialog(null,"Elije la temperatura a convertir",
				null, JOptionPane.PLAIN_MESSAGE,null, new Object[] {"De Celsius a Fahrenheit",
						"De Fahrenheit a Celsius"}, null).toString();
		
		if (opcion == "De Celsius a Fahrenheit") {
				Input input = new Input();
				double cantidad = input.Input();
		        ConversorTemp conversor = new ConversorTemp();
		        conversor.AFahrenheit(cantidad, "Fahrenheit");	
		}
		if (opcion == "De Fahrenheit a Celsius") {
			Input input = new Input();
			double cantidad = input.Input();
			ConversorTemp conversor = new ConversorTemp();
	        conversor.ACelsius(cantidad, "Celsius");		
	    }
	}
}
