package exercicios_fixacao.exercicio06;

public class Pensionato {
	private Aluguel[] alugueis = new Aluguel[10];
	private int quantAlugueis;
	
	public void addAluguel(Aluguel aluguel) {
		alugueis[aluguel.getNumQuarto()] = aluguel;
		quantAlugueis++;
	}

	public Aluguel[] getAlugueis() {
		return alugueis;
	}

	public int getQuantAlugueis() {
		return quantAlugueis;
	}

}
