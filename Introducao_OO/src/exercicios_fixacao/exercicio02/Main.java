package exercicios_fixacao.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario f = new Funcionario();
		System.out.println("Insira dos dados do funcionario.");
		System.out.print("Nome: ");
		f.nome = sc.nextLine();
		System.out.print("Sal�rio bruto: ");
		f.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		f.imposto = sc.nextDouble();
		
		System.out.println("\nDados do funcionario: " + f);
		
		System.out.print("\nQual porcentagem incrementar no sal�rio? ");
		f.incrementarSalario(sc.nextDouble());
		
		System.out.println("\nDados do funcionario atualizado: " + f);
		
		sc.close();
	}

}
