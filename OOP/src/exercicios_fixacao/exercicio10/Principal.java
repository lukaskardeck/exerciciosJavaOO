package exercicios_fixacao.exercicio10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
	
	private static DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== Entre com os dados do cliente ======");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de Nascimento (dd/mm/yyyy): ");
		String dataNasc = sc.nextLine();
		
		System.out.println("\n====== Entre com os dados do pedido ======");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("Quantos itens terão no pedido? ");
		int n = sc.nextInt();
		
		Pedido pedido = new Pedido();
		pedido.setStatus(StatusPedido.valueOf(status));
		pedido.setCliente(new Cliente(nome, email, dataNasc));
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("\nEntre com o pedido #" + (i+1) + ":");
			System.out.print("Nome do produto: ");
			String nomeProd = sc.nextLine();
			System.out.print("Preço do produto: $");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			pedido.addItem(new ItemPedido(quantidade, new Produto(nomeProd, preco)));
		}
		
		pedido.setMomento(LocalDateTime.now());
		
		System.out.println("\n====== Descrição do pedido ======");
		System.out.println("Momento do pedido: " + FMT.format(pedido.getMomento()));
		System.out.println("Status do pedido: " + pedido.getStatus());
		System.out.println("Cliente: " + pedido.getCliente());
		System.out.println("Itens do Pedido");
		for(ItemPedido item : pedido.getItens()) {
			System.out.println("\t-" + item);
		}
		System.out.println("Preço total: $" + String.format("%.2f", pedido.total()));		
		sc.close();
	}
}
