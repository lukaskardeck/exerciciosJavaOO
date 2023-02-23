package exercicios_fixacao.exercicio02;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void incrementarSalario(double porcentagem) {
		this.salarioBruto *= (1.0 + porcentagem/100.0); 
	}
	
	@Override
	public String toString() {
		return String.format("%s, $ %.2f", nome, salarioLiquido());
	}
}
