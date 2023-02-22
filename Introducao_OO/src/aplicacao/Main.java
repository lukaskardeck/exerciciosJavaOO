package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo(), y = new Triangulo();
		
		System.out.println("Insira os tamanhos dos lados do triangulo X: ");
		System.out.print("Lado a: ");
		x.lado_a = sc.nextDouble();
		System.out.print("Lado b: ");
		x.lado_b = sc.nextDouble();
		System.out.print("Lado c: ");
		x.lado_c = sc.nextDouble();
		
		System.out.println("\nInsira os tamanhos dos lados do triangulo Y: ");
		System.out.print("Lado a: ");
		y.lado_a = sc.nextDouble();
		System.out.print("Lado b: ");
		y.lado_b = sc.nextDouble();
		System.out.print("Lado c: ");
		y.lado_c = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("\nArea do triangulo X: %.4f", x.area());
		System.out.printf("\nArea do triangulo Y: %.4f", y.area());
		
	}

}
