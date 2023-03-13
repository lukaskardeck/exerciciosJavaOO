package exercicios_fixacao.exercicio11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{
	public final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
	
	private LocalDate dataFab;
	
	public ProdutoUsado() {};

	public ProdutoUsado(String nome, Double preco, LocalDate dataFab) {
		super(nome, preco);
		this.dataFab = dataFab;
	}

	public LocalDate getDataFab() {
		return dataFab;
	}

	public void setDataFab(LocalDate dataFab) {
		this.dataFab = dataFab;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" (Usado) (Data de fabricação: %s)", fmt.format(getDataFab()));
	}
}
