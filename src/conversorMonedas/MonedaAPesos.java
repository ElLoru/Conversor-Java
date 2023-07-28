package conversorMonedas;

import javax.swing.JOptionPane;

public class MonedaAPesos {
	public static void dolaresAPesos(double valor) {
		double valorConvertido = ((double) ((int) ((valor * 273.66) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: $" + valorConvertido + " Pesos",
				"Conversión Dólares a Pesos", JOptionPane.PLAIN_MESSAGE);
	}

	public static void eurosAPesos(double valor) {
		double valorConvertido = ((double) ((int) ((valor * 301.59) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: $" + valorConvertido + " Pesos",
				"Conversión Euros a Pesos", JOptionPane.PLAIN_MESSAGE);
	}

	public static void librasAPesos(double valor) {
		double valorConvertido = ((double) ((int) ((valor * 351.78) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: $" + valorConvertido + " Pesos",
				"Conversión Libras a Pesos", JOptionPane.PLAIN_MESSAGE);
	}

	public static void yenesAPesos(double valor) {
		double valorConvertido = ((double) ((int) ((valor * 1.94) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: $" + valorConvertido + " Pesos",
				"Conversión Yenes a Pesos", JOptionPane.PLAIN_MESSAGE);
	}

	public static void wonAPesos(double valor) {
		double valorConvertido = ((double) ((int) ((valor * 0.21) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: $" + valorConvertido + " Pesos",
				"Conversión Won Coreano a Pesos", JOptionPane.PLAIN_MESSAGE);
	}
}
