package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Main_produto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Insira os dados do produto:");
		System.out.print("Nome: ");
		produto.nome = sc.next();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("\nDados do produto: " + produto);
		
		System.out.print("\nInsira a quantidade de produtos para adicionar no estoque: ");
		produto.addProdutos(sc.nextInt());
		
		System.out.println("\nATUALIZAÇÃO - Dados do produto: " + produto);
		
		System.out.print("\nInsira a quantidade de produtos para remover no estoque: ");
		produto.removerProdutos(sc.nextInt());
		
		System.out.println("\nATUALIZAÇÃO - Dados do produto: " + produto);
		
		sc.close();

	}

}
