package exercicios_fixacao.exercicio09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contrato {
	private LocalDate data;
	private Double valorPorHora;
	private Integer horas;
	
	public Contrato() {};
	
	public Contrato(String data, Double valorPorHora, Integer horas) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.data = LocalDate.parse(data, fmt);
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public Double getValorPorHora() {
		return valorPorHora;
	}
	
	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public Integer getHoras() {
		return horas;
	}
	
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public Double valorTotal() {
		return getHoras() * getValorPorHora();
	}
}
