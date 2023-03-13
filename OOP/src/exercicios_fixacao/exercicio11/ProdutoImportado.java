package exercicios_fixacao.exercicio11;

public class ProdutoImportado extends Produto{
	private Double taxa;
	
	public ProdutoImportado() {};

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	@Override
	public Double getPreco() {
		return super.getPreco() + getTaxa();
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" (Taxa da Alfândega: $%.2f)", getTaxa());
	}
}
