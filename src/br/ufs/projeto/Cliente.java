package br.ufs.projeto;

public class Cliente {
	
	private String nome;
	private String endereco;
	private int idade;
	private Agencia agencia;
	private Conta conta;
	private int id;

	public Cliente() {
		this.nome = null;
		this.endereco = null;
		this.idade = 0;
		this.agencia = null;
		this.conta = null;
		this.id = 0;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public int getIdade() {
		return idade;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public Conta getConta() {
		return conta;
	}
	public int getId() {
		return id;
	}

}
