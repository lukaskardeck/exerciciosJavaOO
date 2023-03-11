package exercicios_fixacao.exercicio09;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o nome do departamento: ");
		String dpto = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nivel: ");
		String nivel = sc.nextLine();
		System.out.print("Salario Base: ");
		double salarioBase = sc.nextDouble();
		
		Trabalhador t = new Trabalhador(nome, nivel, salarioBase, new Departamento(dpto));
		
		System.out.print("Quantos contratos terá o trabalhador? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("\nEntre com os dados do #" + (i+1) + " contrato: ");
			System.out.print("Data (DD/MM/YYYY): ");
			String data = sc.nextLine();
			System.out.print("Valor por hora: $");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração (hora): ");
			int horas = sc.nextInt();
			
			t.addContrato(new Contrato(data, valorPorHora, horas));
		}
		
		System.out.print("\nEntre com o mês e ano para calcular o total ganho (MM/YYYY): ");
		sc.nextLine();
		String data = sc.nextLine();
		int mes = Integer.parseInt(data.substring(0, 2));
		int ano = Integer.parseInt(data.substring(3));
		System.out.println("Nome: " + t.getNome());
		System.out.println("Departamento: " + t.getDpto().getNome());
		System.out.println("Nivel: " + t.getNivel());
		System.out.printf("Ganhos em %s: $%.2f", data, t.totalGanho(mes, ano));
		
		sc.close();
	}

}
