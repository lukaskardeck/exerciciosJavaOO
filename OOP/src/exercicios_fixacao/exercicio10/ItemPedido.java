package exercicios_fixacao.exercicio10;

public class ItemPedido {
	private Integer quantidade;
	private Produto produto;
	
	public ItemPedido() {};
	
	public ItemPedido(Integer quantidade, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double subTotal() {
		return produto.getPreco() * getQuantidade(); 
	}
	
	@Override
	public String toString() {
		StringBuilder txt = new StringBuilder();
		txt.append(produto.getNome() + ", ");
		txt.append("$" + String.format("%.2f", produto.getPreco()) + ", ");
		txt.append("Quantidade: ");
		txt.append(getQuantidade() + ", ");
		txt.append("Subtotal: ");
		txt.append("$" + String.format("%.2f", subTotal()));
		
		return txt.toString();
	}
}
