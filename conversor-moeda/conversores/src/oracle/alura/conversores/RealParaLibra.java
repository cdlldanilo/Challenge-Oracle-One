package oracle.alura.conversores;

public class RealParaLibra {
	
	private double taxaDeConversao = 0.1601;
	
	public double getRealLibra(double valorInserido) {
		
		return (valorInserido * taxaDeConversao);
		
	}

}
