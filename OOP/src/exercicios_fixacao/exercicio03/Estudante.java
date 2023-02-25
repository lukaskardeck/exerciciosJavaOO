package exercicios_fixacao.exercicio03;

public class Estudante {
	public String nome;
	public double[] notas = new double[3];
	public boolean aprovado = false;
	
	public double notaFinal() {	
		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		if(total >= 60.0) aprovado = true;
		return total;
	}
	
	public double notaRestante() {
		if(aprovado) return 0.0;
		else return 60.0 - notaFinal();
	}
	
	@Override
	public String toString() {
		String texto = "Nome: " + nome;
		for(int i = 0; i < 3; i++) {
			texto += String.format("\nNota %d: %.2f", (i+1), notas[i]);
		}
		
		return texto;
	}
}
