package conversorTemperaturas;

import javax.swing.JOptionPane;

public class ConvertirTemperaturas {
	public static void convertirTemperaturas(double valor) {
		String[] opcionesTemperaturas = { "Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius",
				"Fahrenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Fahrenheit" };

		String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione grados y a que grados convertir",
				"Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, opcionesTemperaturas,
				opcionesTemperaturas[0]);
		switch (opcion) {
			case "Celsius a Fahrenheit":
				CalculadoraTemperaturas.celsiusAFahrenheit(valor);
				break;
			case "Celsius a Kelvin":
				CalculadoraTemperaturas.celsiusAKelvin(valor);
				break;
			case "Fahrenheit a Celsius":
				CalculadoraTemperaturas.fahrenheitACelsius(valor);
				break;
			case "Fahrenheit a Kelvin":
				CalculadoraTemperaturas.fahrenheitAKelvin(valor);
				break;
			case "Kelvin a Celsius":
				CalculadoraTemperaturas.kelvinACelsius(valor);
				break;
			case "Kelvin a Fahrenheit":
				CalculadoraTemperaturas.kelvinAFahrenheit(valor);
				break;
		}
	}
}
