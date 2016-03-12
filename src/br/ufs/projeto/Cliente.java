package br.ufs.projeto;

public class Cliente {
	
	private String nome;
	private int idade;
	//private Agencia agencia;
	private Conta[] conta = new Conta[2];
	private int numIdentificador;
	private int i;
	private int j;

	public Cliente(String nome, int idade, Conta conta, int numIdentificador) {
		this.nome = nome;
		this.idade = idade;
		//this.agencia = agencia;
		this.conta[i] = conta;
		this.numIdentificador = numIdentificador;
	}
	
	public Cliente(String nome, int idade, Conta conta1, Conta conta2, int numIdentificador) {
		this.nome = nome;
		this.idade = idade;
		//this.agencia = agencia;
		this.conta[i] = conta1;
		this.conta[i++] = conta2;
		this.numIdentificador = numIdentificador;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/*public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}*/
	
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
	
	/*public Agencia getAgencia() {
		return agencia;
	}*/
	
	public Conta[] getConta() {
		return conta;
	}
	
	public int getNumeroIdentificador() {
		return numIdentificador;
	}

}
