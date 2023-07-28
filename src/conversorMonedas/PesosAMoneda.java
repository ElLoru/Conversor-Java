package conversorMonedas;

import javax.swing.JOptionPane;

public class PesosAMoneda {
	public static void pesosADolares(double valor) {
		double valorConvertido = ((double) ((int) ((valor * 0.0037) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: $" + valorConvertido + " Dólares",
				"Conversión Pesos a Dólares", JOptionPane.PLAIN_MESSAGE);
	}

	public static void pesosAEuros(double valor) {
		double valorConvertido = ((double) ((int) ((valor * 0.0033) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: $" + valorConvertido + " Euros",
				"Conversión Pesos a Euros", JOptionPane.PLAIN_MESSAGE);
	}

	public static void pesosALibras(double valor) {
		double valorConvertido = ((double) ((int) ((valor * 0.0028) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: $" + valorConvertido + " Libras",
				"Conversión Pesos a Libras", JOptionPane.PLAIN_MESSAGE);
	}

	public static void pesosAYenes(double valor) {
		double valorConvertido = ((double) ((int) ((valor * 0.52) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: $" + valorConvertido + " Yenes",
				"Conversión Pesos a Yenes", JOptionPane.PLAIN_MESSAGE);
	}

	public static void pesosAWon(double valor) {
		double valorConvertido = ((double) ((int) ((valor * 4.67) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: $" + valorConvertido + " Won Coreano",
				"Conversión Pesos a Won Coreano", JOptionPane.PLAIN_MESSAGE);
	}
}
