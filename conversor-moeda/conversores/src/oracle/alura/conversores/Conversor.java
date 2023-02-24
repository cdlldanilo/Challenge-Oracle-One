package oracle.alura.conversores;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {

		String entrada = JOptionPane.showInputDialog("Digite o valor:");
		ValidaEntrada valida = new ValidaEntrada();
		while (!valida.entradaValida(entrada) && entrada != null) {
			entrada = JOptionPane.showInputDialog("Digite um valor monetário válido:");
			if (entrada == null) {
				break;
			}
		}

		double valorInserido = Double.parseDouble(entrada);

		double valorConvertido = 0;

		NumberFormat valorFormatado = new DecimalFormat("#0.00");
		String mensagemFinal = "";

		String[] opcoes = { "Dollar para Real", "Euro para Real", "Libras Esterlinas para Real",
				"Peso argentino para Real", "Peso chileno para Real", "Real para Dollar", "Real para Euro",
				"Real para Libras Esterlinas", "Real para Peso argentino", "Real para Peso chileno" };
		String escolhido = (String) JOptionPane.showInputDialog(null,
				"Escolha a moeda para a qual você deseja converter", "Moedas", -1, null, opcoes, args);

		switch (escolhido) {
		case "Dollar para Real":

			System.out.println("Opção 1: " + valorInserido);
			DollarParaReal valorDollarReal = new DollarParaReal();
			valorConvertido = valorDollarReal.getDollarReal(valorInserido);
			mensagemFinal = "Valor convertido : R$ " + valorFormatado.format(valorConvertido);

			break;

		case "Euro para Real":

			System.out.println("Opção 2: " + valorInserido);
			EuroParaReal valorEuroReal = new EuroParaReal();
			valorConvertido = valorEuroReal.getEuroReal(valorInserido);
			mensagemFinal = "Valor convertido : R$ " + valorFormatado.format(valorConvertido);

			break;

		case "Libras Esterlinas para Real":

			System.out.println("Opção 3: " + valorInserido);
			LibraParaReal valorLibraReal = new LibraParaReal();
			valorConvertido = valorLibraReal.getLibraReal(valorInserido);
			mensagemFinal = "Valor convertido : R$ " + valorFormatado.format(valorConvertido);

			break;

		case "Peso argentino para Real":

			System.out.println("Opção 4: " + valorInserido);
			PesoArgParaReal valorPesoArgReal = new PesoArgParaReal();
			valorConvertido = valorPesoArgReal.getPesoArgentinoReal(valorInserido);
			mensagemFinal = "Valor convertido : R$ " + valorFormatado.format(valorConvertido);

			break;

		case "Peso chileno para Real":

			System.out.println("Opção 5: " + valorInserido);
			PesoChileParaReal valorPesoChiReal = new PesoChileParaReal();
			valorConvertido = valorPesoChiReal.getPesoChilenoReal(valorInserido);
			mensagemFinal = "Valor convertido : R$ " + valorFormatado.format(valorConvertido);

			break;

		case "Real para Dollar":

			System.out.println("Opção 6: " + valorInserido);
			RealParaDollar valorRealDollar = new RealParaDollar();
			valorConvertido = valorRealDollar.getRealDollar(valorInserido);
			mensagemFinal = "Valor convertido : US$ " + valorFormatado.format(valorConvertido);

			break;

		case "Real para Euro":

			System.out.println("Opção 7: " + valorInserido);
			RealParaEuro valorRealEuro = new RealParaEuro();
			valorConvertido = valorRealEuro.getRealEuro(valorInserido);
			mensagemFinal = "Valor convertido : € " + valorFormatado.format(valorConvertido);

			break;

		case "Real para Libras Esterlinas":

			System.out.println("Opção 8: " + valorInserido);
			RealParaLibra valorRealLibra = new RealParaLibra();
			valorConvertido = valorRealLibra.getRealLibra(valorInserido);
			mensagemFinal = "Valor convertido : $ " + valorFormatado.format(valorConvertido);

			break;

		case "Real para Peso argentino":

			System.out.println("Opção 9: " + valorInserido);
			RealParaPesoArg valorRealPesoArg = new RealParaPesoArg();
			valorConvertido = valorRealPesoArg.getRealPesoArgentino(valorInserido);
			mensagemFinal = "Valor convertido : $ " + valorFormatado.format(valorConvertido);

			break;

		case "Real para Peso chileno":

			System.out.println("Opção 10: " + valorInserido);
			RealParaPesoChile valorRealPesoChileno = new RealParaPesoChile();
			valorConvertido = valorRealPesoChileno.getRealPesoChileno(valorInserido);
			mensagemFinal = "Valor convertido : CLP " + valorFormatado.format(valorConvertido);

			break;

		default:
			break;
		}

		JOptionPane.showMessageDialog(null, mensagemFinal);
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar, inserindo valor?");
		if (resposta == JOptionPane.YES_OPTION) {

			main(args);
		}
		
		JOptionPane.showMessageDialog(null, "Volte Sempre!");

	}

}
