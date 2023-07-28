package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public static void convertirMonedas (double valor) {
		String[] opcionesMonedas = { "De Pesos a Dólares", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yenes",
			"De Pesos a Won Coreano", "De Dólares a Pesos", "De Euros a Pesos","De Libras a Pesos", "De Yenes a Pesos",
			"De Won Coreano a Pesos" };
	
		String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione moneda y a que moneda convertir",
				"Conversor de Monedas", JOptionPane.QUESTION_MESSAGE, null, opcionesMonedas, opcionesMonedas[0]);
		
		switch(opcion) {
			case "De Pesos a Dólares": 
				PesosAMoneda.pesosADolares(valor);
				break;
			case "De Pesos a Euros": 
				PesosAMoneda.pesosAEuros(valor);
				break;
			case "De Pesos a Libras": 
				PesosAMoneda.pesosALibras(valor);
				break;
			case "De Pesos a Yenes": 
				PesosAMoneda.pesosAYenes(valor);
				break;
			case "De Pesos a Won Coreano": 
				PesosAMoneda.pesosAWon(valor);
				break;
			case "De Dólares a Pesos":
				MonedaAPesos.dolaresAPesos(valor);
				break;
			case "De Euros a Pesos":
				MonedaAPesos.eurosAPesos(valor);
				break;
			case "De Libras a Pesos":
				MonedaAPesos.librasAPesos(valor);
				break;
			case "De Yenes a Pesos":
				MonedaAPesos.yenesAPesos(valor);
				break;
			case "De Won Coreano a Pesos":
				MonedaAPesos.wonAPesos(valor);
				break;
		}
	}
	
}
