package exercicios_fixacao.exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número da conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Insira o nome do titular da conta: ");
		String titular = sc.nextLine();
		
		ContaBancaria conta;
		
		System.out.print("Deseja fazer um depósito inicial? (y/n)? ");
		String temp = sc.next();
		
		if(temp.equals("y")) {
			System.out.print("Insira o valor: $");
			conta = new ContaBancaria(numConta, titular, sc.nextDouble());
		} else {
			conta = new ContaBancaria(numConta, titular);
		}
		
		System.out.println("\nDados da conta:");
		System.out.println(conta);
		
		System.out.print("\nInsira um valor para depositar: $");
		conta.depositar(sc.nextDouble());
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		System.out.print("\nInsira um valor para sacar: $");
		conta.sacar(sc.nextDouble());
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		sc.close();
	}

}
