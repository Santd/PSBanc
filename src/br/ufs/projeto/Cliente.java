package br.ufs.projeto;

public class Cliente {
	
	private String nome;
	private int idade;
	private Conta[] conta = new Conta[2];
	private int numIdentificador;
	private int i;
	private int j;
	private int quantContas;

	public Cliente(String nome, int idade, Conta conta, int numIdentificador) {
		this.nome = nome;
		this.idade = idade;
		this.conta[i] = conta;
		this.numIdentificador = numIdentificador;
		this.quantContas = 1;
	}
	
	public Cliente(String nome, int idade, Conta conta1, Conta conta2, int numIdentificador) {
		this.nome = nome;
		this.idade = idade;
		this.conta[i] = conta1;
		this.conta[i+1] = conta2;
		this.numIdentificador = numIdentificador;
		this.quantContas = 2;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setConta(Conta conta) {
		this.conta[j] = conta;
		j++;
	}
	
	public void setNumeroIdentificador(int numeroIdentificador ) {
		this.numIdentificador = numeroIdentificador;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public Conta[] getConta() {
		return conta;
	}
	
	public int getNumeroIdentificador() {
		return numIdentificador;
	}
	
	public int getQuantContas() {
		return quantContas;
	}
}
