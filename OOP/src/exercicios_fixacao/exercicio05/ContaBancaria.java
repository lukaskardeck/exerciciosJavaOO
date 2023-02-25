package exercicios_fixacao.exercicio05;

public class ContaBancaria {
	private int numConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}

	public ContaBancaria(int numConta, String titular, double depositoInicial) {
		this.numConta = numConta;
		this.titular = titular;
		depositar(depositoInicial);
	}

	public String getTitular() {
		return titular;
	}

	public void setNome(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumConta() {
		return numConta;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= (valor + 5.00);
	}
	
	@Override
	public String toString() {
		return String.format("Conta %d, Titular: %s, Saldo: $ %.2f", getNumConta(), getTitular(), getSaldo());
	}
	
}
