package mainDialog;

import javax.swing.JOptionPane;
import conversorMonedas.ConvertirMonedas;
import conversorTemperaturas.ConvertirTemperaturas;

public class Main {

	public static boolean validarNumero(String numero) {
		boolean validacion = false;
		try {
			double numeroDouble = Double.parseDouble(numero);
			if (numeroDouble >= 0) {
				validacion = true;
			}
		} catch (NumberFormatException e) {
			return validacion;
		}
		return validacion;
	}

	public static boolean volverAConvertir() {
		int eleccion = JOptionPane.showConfirmDialog(null, "¿Desea seguir usando el programa?", "Seguir usando",
				JOptionPane.YES_NO_OPTION);
		if (eleccion == 1) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String[] opcionesConversor = { "Conversor de Monedas", "Conversor de Temperatura" };

		String valorAConvertir;

		String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo a convertir",
				"Programa Conversor", JOptionPane.QUESTION_MESSAGE, null, opcionesConversor, opcionesConversor[0]);
		while (opcion != null) {
			switch (opcion) {
				case "Conversor de Monedas":
					valorAConvertir = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir",
							"Conversor de Monedas", JOptionPane.QUESTION_MESSAGE);
					if (valorAConvertir == null) {
						opcion = null;
						break;
					}
					if (validarNumero(valorAConvertir)) {
						ConvertirMonedas.convertirMonedas(Double.parseDouble(valorAConvertir));
						if (!volverAConvertir()) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							opcion = null;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Valor no válido", "Error", JOptionPane.ERROR_MESSAGE);
					}
					break;
				case "Conversor de Temperatura":
					valorAConvertir = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir",
							"Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE);
					if (valorAConvertir == null) {
						opcion = null;
						break;
					}
					if (validarNumero(valorAConvertir)) {
						ConvertirTemperaturas.convertirTemperaturas(Double.parseDouble(valorAConvertir));
						if (!volverAConvertir()) {
							JOptionPane.showMessageDialog(null, "Programa terminado");
							opcion = null;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Valor no válido", "Error", JOptionPane.ERROR_MESSAGE);
					}
					break;
			}
		}
	}
}
