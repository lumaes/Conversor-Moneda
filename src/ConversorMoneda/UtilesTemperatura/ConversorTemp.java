package ConversorMoneda.UtilesTemperatura;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import ConversorMoneda.Vista.VistaContinuar;

public class ConversorTemp {
	public void AFahrenheit(double temperatura, String tipo) {
		double total = ((temperatura * 9/5) + 32);
		Resultado(total, tipo);
	}
	public void ACelsius(double temperatura, String tipo) {
		double total = ((temperatura - 32) * 5 / 9);
		Resultado(total, tipo);
	}
	public void Resultado(double resultado, String tipo) {
		DecimalFormat df = new DecimalFormat("#.##");
		JOptionPane.showMessageDialog(null, "Grados "+ tipo + ":"+ df.format(resultado));
		VistaContinuar continuar = new VistaContinuar();
		continuar.continuar();
	}
}
