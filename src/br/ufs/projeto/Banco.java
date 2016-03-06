package br.ufs.projeto;

public class Banco {
	
	private String nome;
	private int codigo;
	Agencia agencia;
	private double montante;

	public Banco(String nome, int codigo, Agencia agencia, double montante) {
		this.nome = nome;
		this.codigo = codigo;
		this.agencia = agencia;
		this.montante = montante;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public double getMontante() {
		return montante;
	}

}
