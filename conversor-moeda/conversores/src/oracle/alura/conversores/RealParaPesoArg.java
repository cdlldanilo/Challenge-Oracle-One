package oracle.alura.conversores;

public class RealParaPesoArg {
	
	private double taxaDeConversao = 37.679;
	
	public double getRealPesoArgentino(double valorInserido) {
		
		return (valorInserido * taxaDeConversao);
		
	}

}
