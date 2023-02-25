package exercicios_fixacao.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retang = new Retangulo();
		
		System.out.println("Insira, respectivamente, a altura e largura do retangulo:");
		retang.altura = sc.nextDouble();
		retang.largura = sc.nextDouble();
		
		sc.close();
		
		System.out.println(retang);

	}

}
