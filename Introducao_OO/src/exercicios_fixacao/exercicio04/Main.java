package exercicios_fixacao.exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cotação do dólar atual? ");
		double valorDolar = sc.nextDouble();
		System.out.print("Quantos dólares você quer comprar? ");
		double pagamentoDolar = sc.nextDouble();
		System.out.printf("Você terá que pagar R$%.2f", ConversorMoeda.converterDolarReal(valorDolar, pagamentoDolar));
		
		sc.close();

	}

}
