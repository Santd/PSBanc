package br.ufs.projeto;
/**
 * 
 * @author DANIELA DOS SANTOS E TAYLAN NALIMAR CRUZ CELESTINO
 *@since 11/03/2016
 */

public class Cliente {
	
	private String nome;
	private int idade;
	private Conta[] conta = new Conta[10];
	private int numIdentificador;
	private int i;
	private int quantContas = 0;

	public Cliente(String nome, int idade, Conta conta, int numIdentificador) {
		this.nome = nome;
		this.idade = idade;
		this.conta[i] = conta;
		this.numIdentificador = numIdentificador;
		this.quantContas = 1;
	}
	
	public Cliente(String nome, int idade, int numIdentificador) {
		this.nome = nome;
		this.idade = idade;
		this.numIdentificador = numIdentificador; 
		System.out.println("Cliente cadastrado com sucesso!");
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
		i++;
		this.conta[i] = conta;
		this.quantContas++;
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
