package oracle.alura.conversores;

public class RealParaDollar {
	
	private double taxaDeConverso = 0.1933;
	
	public double getRealDollar(double valorInserido) {
		
		return (valorInserido * taxaDeConverso);
		
	}

}
