package exercicios_fixacao.exercicio11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();
		
		Produto produto;
		
		int i;
		double taxa;
		String option, data;
		for (i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("\nProduto #" + (i+1) + ":");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			option = sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			switch(option.toLowerCase()) {
				case "u":
					System.out.print("Data de fabricação (DD/MM/YYYY): ");
					sc.nextLine();
					data = sc.nextLine();
					produto = new ProdutoUsado(nome, preco, LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
					break;
				case "i":
					System.out.print("Taxa de Alfandega: ");
					taxa = sc.nextDouble();
					produto = new ProdutoImportado(nome, preco, taxa);
					break;
				default:
					produto = new Produto(nome, preco);
			}
			
			produtos.add(produto);
		}
				
		System.out.println("\nEtiqueta dos produtos:");
		for (Produto p : produtos) System.out.println(p);
		
		sc.close();
	}
}
