package exercicios_fixacao.exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira número de linhas: ");
		int m = scan.nextInt();
		
		System.out.print("Insira número de colunas: ");
		int n = scan.nextInt();
		
		int[][] matriz = new int[m][n];
				
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("[%d][%d]: ", i + 1, j + 1);
				matriz[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		
		System.out.print("\nMATRIZ " + m + "x" + n + ":\n");
		Matriz.exibirMatriz(matriz, m, n);
		
		System.out.print("\nInforme um numero da matriz: ");
		int num = scan.nextInt();
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++) {
				
				if(matriz[i][j] == num) {
					System.out.printf("\nPosição [%d][%d]:\n", i, j);
					if ((j-1) >= 0) System.out.println("Esqueda: " + matriz[i][j-1]);
					if ((i-1) >= 0) System.out.println("Acima: " + matriz[i-1][j]);
					if ((j+1) < n) System.out.println("Direita: " + matriz[i][j+1]);
					if ((i+1) < m) System.out.println("Abaixo: " + matriz[i+1][j]);
				}
				
			}
		
		scan.close();
	}

}
