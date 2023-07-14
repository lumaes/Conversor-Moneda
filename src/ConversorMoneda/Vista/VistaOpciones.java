package ConversorMoneda.Vista;

import javax.swing.JOptionPane;

import ConversorMoneda.Utiles.Conversor;
import ConversorMoneda.Utiles.Cotizaciones;


public class VistaOpciones {

	public void opcionesMoneda() {
		
		String opcion = (String) JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero",
				null, JOptionPane.PLAIN_MESSAGE,null, new Object[] {"De Pesos a Dólar",
						"De Pesos a Euro","De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano",
						"De Dólar a Pesos","De Euro a Pesos","De Libras a Pesos","De Yen a Pesos",
						"De Won Coreano a Pesos"}, null).toString();
		
		if (opcion == "De Pesos a Dólar") {
				Input input = new Input();
				double cantidad = input.Input();
				Cotizaciones cotizaciones = new Cotizaciones();
		        Conversor conversor = new Conversor();
		        conversor.DePesoA(cantidad, cotizaciones.getDólarCompra(),"Dólares");		
		}
		if (opcion == "De Pesos a Euro") {
			Input input = new Input();
			double cantidad = input.Input();
			Cotizaciones cotizaciones = new Cotizaciones();
	        Conversor conversor = new Conversor();
	        conversor.DePesoA(cantidad, cotizaciones.getEuroCompra(), "Euros");		
	    }
		if (opcion == "De Pesos a Libras") {
			Input input = new Input();
			double cantidad = input.Input();
			Cotizaciones cotizaciones = new Cotizaciones();
	        Conversor conversor = new Conversor();
	        conversor.DePesoA(cantidad, cotizaciones.getLibrasCompra(), "Libras");		
	    }
		if (opcion == "De Pesos a Yen") {
			Input input = new Input();
			double cantidad = input.Input();
			Cotizaciones cotizaciones = new Cotizaciones();
	        Conversor conversor = new Conversor();
	        conversor.DePesoA(cantidad, cotizaciones.getYenCompra(), "Yenes");		
	    }
		if (opcion == "De Pesos a Won Coreano") {
			Input input = new Input();
			double cantidad = input.Input();
			Cotizaciones cotizaciones = new Cotizaciones();
	        Conversor conversor = new Conversor();
	        conversor.DePesoA(cantidad, cotizaciones.getWonCompra(), "Wones");		
	    }
		if (opcion == "De Dólar a Pesos") {
			Input input = new Input();
			double cantidad = input.Input();
			Cotizaciones cotizaciones = new Cotizaciones();
	        Conversor conversor = new Conversor();
	        conversor.APeso(cantidad, cotizaciones.getDólarVenta(), "Pesos");		
	}
	if (opcion == "De Euro a Pesos") {
		Input input = new Input();
		double cantidad = input.Input();
		Cotizaciones cotizaciones = new Cotizaciones();
        Conversor conversor = new Conversor();
        conversor.APeso(cantidad, cotizaciones.getEuroVenta(),"Pesos");		
    }
	if (opcion == "De Libras a Pesos") {
		Input input = new Input();
		double cantidad = input.Input();
		Cotizaciones cotizaciones = new Cotizaciones();
        Conversor conversor = new Conversor();
        conversor.APeso(cantidad, cotizaciones.getLibrasVenta(),"Pesos");		
    }
	if (opcion == "De Yen a Pesos") {
		Input input = new Input();
		double cantidad = input.Input();
		Cotizaciones cotizaciones = new Cotizaciones();
        Conversor conversor = new Conversor();
        conversor.APeso(cantidad, cotizaciones.getYenVenta(),"Pesos");		
    }
	if (opcion == "De Won Coreano a Pesos") {
		Input input = new Input();
		double cantidad = input.Input();
		Cotizaciones cotizaciones = new Cotizaciones();
        Conversor conversor = new Conversor();
        conversor.APeso(cantidad, cotizaciones.getWonVenta(),"Pesos");		
    }
	}

}
