package exercicios_fixacao.exercicio04;

public class ConversorMoeda {
	public static final double IOF = 1.06;
	
	public static double converterDolarReal(double cotacaoDolar, double pagamentoDolar) {
		return cotacaoDolar * pagamentoDolar * IOF;
	}
}
