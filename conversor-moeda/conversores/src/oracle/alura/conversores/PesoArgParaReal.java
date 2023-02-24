package oracle.alura.conversores;

public class PesoArgParaReal {
	
	private double taxaDeConverso = 0.0265;
	
	public double getPesoArgentinoReal(double valorInserido) {
		
		return (valorInserido * taxaDeConverso);
		
	}

}
