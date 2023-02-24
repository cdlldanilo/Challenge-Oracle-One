package oracle.alura.conversores;

public class ValidaEntrada {
	
	public boolean entradaValida(String entrada) {
		try {
			Double.parseDouble(entrada);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
