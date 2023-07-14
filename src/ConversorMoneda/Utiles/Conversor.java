package ConversorMoneda.Utiles;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import ConversorMoneda.Vista.VistaContinuar;

public class Conversor {
	public void DePesoA(double monto, double cotizacion, String moneda) {
		double total = monto / cotizacion;
		Resultado(total, moneda);
	}
	public void APeso(double monto, double cotizacion, String moneda) {
		double total = monto * cotizacion;
		Resultado(total, moneda);
	}
	public void Resultado(double resultado, String moneda) {
		DecimalFormat df = new DecimalFormat("#.##");
		JOptionPane.showMessageDialog(null, "Tienes $ "+ df.format(resultado) + " "+ moneda);
		VistaContinuar continuar = new VistaContinuar();
		continuar.continuar();
	}
}
