package oracle.alura.conversores;

public class RealParaPesoChile {
	
	private double taxaDeConversao = 154.1307;
	
	public double getRealPesoChileno(double valorInserido) {
		
		return (valorInserido * taxaDeConversao);
		
	}

}
