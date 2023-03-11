package exercicios_fixacao.exercicio09;

import java.util.ArrayList;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	private Departamento dpto;
	private ArrayList<Contrato> contratos = new ArrayList<>();
	
	public Trabalhador(String nome, String nivel, Double salarioBase, Departamento dpto) {
		this.nome = nome;
		this.nivel = NivelTrabalhador.valueOf(nivel);
		this.salarioBase = salarioBase;
		this.dpto = dpto;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public NivelTrabalhador getNivel() {
		return nivel;
	}
	
	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}
	
	public Double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public Departamento getDpto() {
		return dpto;
	}
	
	public void setDpto(Departamento dpto) {
		this.dpto = dpto;
	}
	
	public ArrayList<Contrato> getContratos() {
		return contratos;
	}
	
	public void addContrato(Contrato c) {
		contratos.add(c);
	}
	
	public void romverContrato(Contrato c) {
		contratos.remove(c);
	}
	
	public Double totalGanho(Integer mes, Integer ano) {
		double total = getSalarioBase();
		for (Contrato c : contratos) {
			if(c.getData().getMonthValue() == mes && c.getData().getYear() == ano) {
				total += c.valorTotal();
			}
		}
		
		return total;
	}
}
