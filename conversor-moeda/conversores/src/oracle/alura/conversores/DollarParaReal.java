package oracle.alura.conversores;

public class DollarParaReal {
	
	private double taxaDeConversao = 5.1724;
	
	public double getDollarReal(double valorInserido) {
		
		return (valorInserido * taxaDeConversao);
		
	}

}
