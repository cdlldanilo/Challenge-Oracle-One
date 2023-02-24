package oracle.alura.conversores;

public class LibraParaReal {
	
	private double taxaDeConverso = 6.2446;
	
	public double getLibraReal(double valorInserido) {
		
		return (valorInserido * taxaDeConverso);
		
	}

}
