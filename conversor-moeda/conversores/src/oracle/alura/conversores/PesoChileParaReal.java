package oracle.alura.conversores;

public class PesoChileParaReal {
	
	private double taxaDeConverso = 0.0065;
	
	public double getPesoChilenoReal(double valorInserido) {
		
		return (valorInserido * taxaDeConverso);
		
	}

}
