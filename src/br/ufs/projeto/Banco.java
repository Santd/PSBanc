package br.ufs.projeto;

import java.util.Random;
/**
 * 
 * @author 
 *@since 11/03/2016
 */
import java.util.Scanner;

public class Banco {

	Scanner input = new Scanner(System.in);
	private String nome;
	private int codigo;
	private Agencia[] agencia;
	private double montante;
	private int novaAgencia;
	private int agenciaEscolhida;

	public Banco(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
		this.agencia = new Agencia[100];
		this.montante = 0;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia[novaAgencia] = agencia;
		novaAgencia++;
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

	public Agencia[] getAgencia() {
		return agencia;
	}

	public double getMontante() {
		return montante;
	}


	/**Método para criação de novas agências em um banco
	 * 
	 * @return void
	 */

	public void  criarAgencia() {

		Agencia agenciaNova = new Agencia();
		Random codigoAleatorio = new Random();

		agenciaNova.setCodigo(codigoAleatorio.nextInt(100));
		this.agencia[novaAgencia] = agenciaNova;
		novaAgencia++;
		System.out.println("agencia "+novaAgencia);
		System.out.println(agenciaNova.getCodigo());
	}


	/**Método para cadastro de novos clientes
	 * 
	 * @param nome
	 * @param idade
	 */

	public void cadastrarCliente(String nome, int idade) {
		int i;

		if (novaAgencia == 0) 
			System.out.println("Impossível cadastrar o cliente, primeiro crie uma agência!");
		else{
			System.out.println("Escolha o número referente a uma das agências abaixo:");
			
			for (i = 0; i < novaAgencia; i++) {
				System.out.println("Agência código: "+agencia[i].getCodigo());
			}	

			agenciaEscolhida = input.nextInt();
			System.out.println("Agência escolhida: "+agenciaEscolhida);
			
			for (int j = 0; j < novaAgencia; j++) {
				if (agencia[novaAgencia].getCodigo() == agenciaEscolhida) {
					agencia[j].cadastrarCliente(nome, idade);
				}				
			}
		}
	}

	/**Método para calcular o montante de dinheiro em um banco,
	 * considerando a soma dos montantes de cada agência existente.
	 * 
	 * @return double - somatório dos montantes das agências
	 */

	public double CalcularMontante(){
		double somaMontante = 0;

		for (int i = 0; i < novaAgencia; i++) {
			somaMontante = somaMontante + agencia[i].MontanteNaAgencia();
		}

		return somaMontante;
	}


	/**Método que mostra o saldo de um cliente em uma agência, 
	 * através de uma busca pelo id do cliente
	 * 
	 * @param idCliente - número de identificação do cliente
	 * @param codigo - código da agência
	 * @return - saldo
	 */

	public double exibirSaldoB(int idCliente, int codigo) {
		double saldo = 0;

		for (int i = 0; i < novaAgencia; i++) {
			if (agencia[i].getCodigo() == codigo ) {
				agencia[i].buscarCliente(idCliente);
				break;
			}
		}

		return saldo;
	}

}
