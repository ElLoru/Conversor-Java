package conversorTemperaturas;

import javax.swing.JOptionPane;

public class CalculadoraTemperaturas {
	public static void celsiusAFahrenheit(double valor) {
		double valorConvertido = ((double) ((int) (((valor * 1.8) + 32) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: " + valorConvertido + " °F",
				"Conversión Celsius a Fahrenheit", JOptionPane.PLAIN_MESSAGE);
	}

	public static void celsiusAKelvin(double valor) {
		double valorConvertido = ((double) ((int) ((valor + 273.15) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: " + valorConvertido + " K",
				"Conversión Celsius a Kelvin", JOptionPane.PLAIN_MESSAGE);
	}

	public static void fahrenheitACelsius(double valor) {
		double valorConvertido = ((double) ((int) (((valor - 32) * 0.555555) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: " + valorConvertido + " °C",
				"Conversión Fahrenheit a Celsius", JOptionPane.PLAIN_MESSAGE);
	}

	public static void fahrenheitAKelvin(double valor) {
		double valorConvertido = ((double) ((int) ((((valor - 32) * 0.555555) + 273.15) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: " + valorConvertido + " K",
				"Conversión Fahrenheit a Kelvin", JOptionPane.PLAIN_MESSAGE);
	}

	public static void kelvinACelsius(double valor) {
		double valorConvertido = ((double) ((int) ((valor - 273.15) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: " + valorConvertido + " °C",
				"Conversión Kelvin a Celsius", JOptionPane.PLAIN_MESSAGE);
	}

	public static void kelvinAFahrenheit(double valor) {
		double valorConvertido = ((double) ((int) ((((valor - 273.15) * 1.8) + 32) * 100.0)) / 100.0);
		JOptionPane.showMessageDialog(null, "Valor convertido: " + valorConvertido + " °F",
				"Conversión Kelvin a Fahrenheit", JOptionPane.PLAIN_MESSAGE);
	}
}
