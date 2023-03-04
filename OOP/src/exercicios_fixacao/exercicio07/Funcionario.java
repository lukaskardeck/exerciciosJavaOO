package exercicios_fixacao.exercicio07;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario() {};	
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void aumentoSalario(Double porcentagem) {
		this.salario *= (1.0 + porcentagem/100.0);
	}
	
	@Override
	public String toString() {
		return String.format("%d, %s, $%.2f", getId(), getNome(), getSalario());
	}
	
}
