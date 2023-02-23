package exercicios_fixacao.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante e = new Estudante();
		System.out.print("Nome: ");
		e.nome = sc.nextLine();
		for(int i=0; i<3; i++) {
			System.out.print("Nota " + (i+1) + ": ");
			e.notas[i] = sc.nextDouble();
		}
		
		sc.close();
		
		System.out.printf("\nNota Final: %.2f\n", e.notaFinal());
		if(e.aprovado) System.out.println("Aprovado");
		else {
			System.out.println("Reprovado");
			System.out.printf("Faltaram %.2f pontos para aprovação", e.notaRestante());
		}
		
	}

}
