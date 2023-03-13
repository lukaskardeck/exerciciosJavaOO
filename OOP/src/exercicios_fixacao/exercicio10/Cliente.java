package exercicios_fixacao.exercicio10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
	private String nome;
	private String email;
	private LocalDate dataNasc;
	
	private final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Cliente() {};
	
	public Cliente(String nome, String email, String dataNasc) {
		this.nome = nome;
		this.email = email;
		this.dataNasc = LocalDate.parse(dataNasc, FMT);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	@Override
	public String toString() {
		StringBuilder txt = new StringBuilder();
		txt.append(getNome() + " ");
		txt.append("(" + FMT.format(getDataNasc()) + ")" + " - ");
		txt.append(getEmail());
		
		return txt.toString();
	}
}
