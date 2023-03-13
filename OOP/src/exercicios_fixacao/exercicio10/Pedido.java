package exercicios_fixacao.exercicio10;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
	private LocalDateTime momento;
	private StatusPedido status;
	private Cliente cliente;
	private ArrayList<ItemPedido> Itens = new ArrayList<>();
	
	public Pedido() {};
	
	public Pedido(LocalDateTime momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public LocalDateTime getMomento() {				
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public ArrayList<ItemPedido> getItens() {
		return Itens;
	}

	public void addItem(ItemPedido item) {
		Itens.add(item);
	}
	
	public void removerItem(ItemPedido item) {
		Itens.remove(item);
	}
	
	public Double total() {
		double total = 0;
		for (ItemPedido item : Itens) total += item.subTotal();
		return total;
	}
}
