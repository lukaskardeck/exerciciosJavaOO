package exercicios_fixacao.exercicio07;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de funcionarios: ");
		int n = sc.nextInt();
		
		List<Funcionario> funcionarios = new ArrayList<>();
		Funcionario funcionario;
		
		int i;
		for(i = 0; i < n; i++) {
			System.out.println("\nFuncionario #" + (i+1) + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(existeId(funcionarios, id)) {
				System.out.println("Esse id ja existe. Insira outro: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			funcionario = new Funcionario(id, nome, salario);
			funcionarios.add(funcionario);
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios:");
		printArray(funcionarios);
		
		System.out.print("\nInsira o ID do funcionario que sera aumentado o salario: ");
		int id = sc.nextInt();
		Funcionario f = getByID(funcionarios, id);
		if(f != null) {
			System.out.print("Insira a porcentagem: ");
			f.aumentoSalario(sc.nextDouble());
		} else {
			System.out.println("Esse funcionario nao existe!");
		}		
		
		System.out.println();
		System.out.println("Lista de funcionarios:");
		printArray(funcionarios);
		
		sc.close();

	}
	
	public static void printArray(List<Funcionario> funcionarios) {
		for(Funcionario f : funcionarios) {
			System.out.println(f);
		}
	}
	
	public static boolean existeId(List<Funcionario> lista, int id) {
		Funcionario f = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return f != null;
	}
	
	public static Funcionario getByID(List<Funcionario> lista, int id) {
		return lista.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
	}
}
