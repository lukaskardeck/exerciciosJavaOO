package exercicios_fixacao.exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cota��o do d�lar atual? ");
		double valorDolar = sc.nextDouble();
		System.out.print("Quantos d�lares voc� quer comprar? ");
		double pagamentoDolar = sc.nextDouble();
		System.out.printf("Voc� ter� que pagar R$%.2f", ConversorMoeda.converterDolarReal(valorDolar, pagamentoDolar));
		
		sc.close();

	}

}
