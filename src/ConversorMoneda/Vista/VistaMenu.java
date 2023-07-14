package ConversorMoneda.Vista;

import javax.swing.JOptionPane;

import ConversorMoneda.VistaTemperatura.VistaOpcionesTemperatura;

public class VistaMenu {
	  public static void main(String[] args) {
		  VistaMenu menu = new VistaMenu();
		  menu.vistaMenu();
	  }
	  public void vistaMenu(){
	        String conversor = JOptionPane.showInputDialog(null,"Selecciona una opcion de conversion",
	        				null, JOptionPane.PLAIN_MESSAGE,null, new Object[] {"Conversor de Moneda",
	        				"Conversor de Temperatura"}, null).toString();
	        
	        if (conversor == "Conversor de Moneda") {
	        	VistaOpciones seleccionado = new VistaOpciones();
	        	
	        	seleccionado.opcionesMoneda();
	        	
	        } else if (conversor == "Conversor de Temperatura") {
	        	VistaOpcionesTemperatura seleccionado = new VistaOpcionesTemperatura();
	            seleccionado.opcionesTemperaturas();
	        } 
		 
	  }
	  
}
