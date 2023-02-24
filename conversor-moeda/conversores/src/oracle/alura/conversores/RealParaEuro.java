package oracle.alura.conversores;

public class RealParaEuro {
	
	private double taxaDeConverso = 0.1819;
	
	public double getRealEuro(double valorInserido) {
		
		return (valorInserido * taxaDeConverso);
		
	}

}
