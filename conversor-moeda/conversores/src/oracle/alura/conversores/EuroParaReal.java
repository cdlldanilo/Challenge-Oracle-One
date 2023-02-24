package oracle.alura.conversores;

public class EuroParaReal {
	
	private double taxaDeConversao = 5.4952;
	
	public double getEuroReal(double valorInserido) {
		
		return (valorInserido * taxaDeConversao);
		
	}

}
