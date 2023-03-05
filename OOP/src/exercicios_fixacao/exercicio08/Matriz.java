package exercicios_fixacao.exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a ordem da matriz: ");
		int n = sc.nextInt();

		int[][] matriz = new int[n][n];

		lerMatriz(matriz, n, n);

		System.out.println("MATRIZ " + n + "x" + n + ":");
		exibirMatriz(matriz, n, n);

		System.out.println("\nDiagonal da matriz:");
		exibirDiagMatriz(matriz, n);
		
		System.out.print("\nQuantidade de números negativos: " + quantNegativ(matriz, n, n));

		sc.close();
	}

	public static void lerMatriz(int[][] matriz, int m, int n) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("[%d][%d]: ", i + 1, j + 1);
				matriz[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		sc.close();
	}

	public static void exibirMatriz(int[][] matriz, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void exibirDiagMatriz(int[][] matriz, int n) {
		for (int i = 0; i < n; i++)
			System.out.print(matriz[i][i] + " ");
	}
	
	public static int quantNegativ(int[][] matriz, int m, int n) {
		int numNeg = 0;
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0)
					numNeg++;
			}
		
		return numNeg;
	}
}
