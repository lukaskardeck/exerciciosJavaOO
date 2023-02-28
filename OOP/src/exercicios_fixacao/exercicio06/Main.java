package exercicios_fixacao.exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Pensionato pensionato = new Pensionato();

		System.out.print("Quantos estudantes irão alugar um quarto? ");
		int n;
		while (true) {
			n = sc.nextInt();
			if (n >= 1 && n <= 10)
				break;
			System.out.print("Insira um valor de 1 à 10: ");
		}
		System.out.println();

		Aluguel aluguel;
		int i;
		for (i = 0; i < n; i++) {
			System.out.println("Aluguel #" + (i + 1) + ":");
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("E-Mail: ");
			String email = sc.nextLine();

			System.out.print("Quarto: ");
			int q = sc.nextInt();
			
			while (q < 1 && q > 10) {
				System.out.print("Insira um valor de 1 à 10: ");
				q = sc.nextInt();
			}
			aluguel = new Aluguel(nome, email, q);
			pensionato.addAluguel(aluguel);
			System.out.println();
		}
		
		sc.close();

		System.out.println("Quartos alugados:");
		for (i = 0; i < 10; i++) {
			if (pensionato.getAlugueis()[i] != null) {
				System.out.println(pensionato.getAlugueis()[i]);
			}
		}
	}
}
