package br.com.acn.exercicio4;

public class Funcionario {

	private String nome;
	private String depto;
	private double salario =0;
	private String dataEntrada;
	private String rg;
	private boolean estaNaEmpresa;

	public Funcionario(String nome){
		this.setNome(nome);
		this.setEstaNaEmpresa(true);
	}
	
	public Funcionario(String nome, String depto){
		this(nome);
		this.setDepto(depto);
	}
	
	// GETs & SETs
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public double getSalario() {
		return salario;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}
	// --

	// Manipulacao e Visualizacao de Salario
	void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	double calculaGanhoAnual() {
		return this.getSalario() * 12;
	}
	// --

}
