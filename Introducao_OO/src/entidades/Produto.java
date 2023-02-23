package entidades;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalEmEstoque() {
		return quantidade * preco;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	@Override
	public String toString() {
		return String.format("%s, $ %.2f, %d unidade(s), Total: $ %.2f", nome, preco, quantidade, valorTotalEmEstoque());
	}
	
}
