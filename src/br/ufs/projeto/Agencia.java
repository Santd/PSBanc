package br.ufs.projeto;

import java.util.Random;

/**
 * 
 * @author DANIELA DOS SANTOS E TAYLAN NALIMAR CRUZ CELESTINO
 *@since 11/03/2016
 */
public class Agencia {

	private int codigo;
	private Cliente[] cliente;
	int novoCliente = 0;

	public Agencia(int codigo) {
		this.codigo = codigo;
		this.cliente = new Cliente[100];
	}

	public Agencia() {
		System.out.println("Agência criada!");
		this.cliente = new Cliente[100];
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCliente(Cliente cliente) {
		this.cliente[novoCliente] = cliente;
		novoCliente++;
	}

	public int getCodigo() {
		return codigo;
	}

	public Cliente[] getCliente() {
		return cliente;
	}
	
	
	/**CRIAÇÃO E CADASTRO DE NOVOS CLIENTES COM NÚMEROS DE IDENTIFICAÇÃO ALEATÓRIO
	 * 
	 * @param nome
	 * @param idade
	 */
	public void cadastrarCliente(String nome, int idade) {
		Random idAleatorio = new Random();
		Cliente cliente = new Cliente(nome, idade, idAleatorio.nextInt(200));
		
		setCliente(cliente);	
	}
	
	/**CÁLCULO DO MONTANTE DE DINHEIRO NA AGÊNCIA
	 * 
	 * @return somaMontanteAgencia
	 */
	public double MontanteNaAgencia() {
		double somaMontanteAgencia = 0;

		for (int i = 0; i < novoCliente; i++) {
			if (cliente[i].getQuantContas() == 1) 
				for (int j = 0; j < cliente[i].getQuantContas(); j++) {
					somaMontanteAgencia = somaMontanteAgencia + cliente[i].getConta()[j].getSaldo();
				}else
					for (int j = 0; j < cliente[i].getQuantContas(); j++) {
						somaMontanteAgencia = somaMontanteAgencia + cliente[i].getConta()[j].getSaldo();
					}
		}

		return somaMontanteAgencia;
	}

	
	/**MÉTODO QUE BUSCA UM DETERMINADO CLIENTE NA AGÊNCIA ATRAVÉS DO ID E RETORNA O SEU SALDO
	 * "USADA NA CLASSE TESTEBANCO"
	 * @param idCliente
	 * @return SALDO
	 */
	public double buscarCliente(int idCliente) {
		double saldo = 0;
		boolean achou = false;
		int j;
		int posicao = 0;

		for (j = 0; j < this.novoCliente; j++) {
			if (cliente[j].getNumeroIdentificador() == idCliente){ 
				achou = true;
				posicao = j;
			}
		}	

		if (achou == true){
			if (cliente[posicao].getQuantContas() == 1) {
				for (j = 0; j < cliente[posicao].getQuantContas(); j++) 
					System.out.println("Saldo do cliente é de R$ "+cliente[posicao].getConta()[j].getSaldo());
			}else
				for (j = 0; j < cliente[posicao].getQuantContas(); j++)
					System.out.println("Saldo do cliente na conta nº: "+cliente[posicao].getConta()[j].getCodigo()+
							" é de R$ "+cliente[posicao].getConta()[j].getSaldo());
		}

		return saldo;
	}

	
	/**MÉTODO QUE PROCURAR UM DETERMINADO CLIENTE NA AGÊNCIA ATRAVÉS DO ID E RETORNA O SEU SALDO
	 * "USADA NA CLASSE TESTEBANCO2"
	 * 
	 * @param idCliente
	 * @return SALDO
	 */
	public double procurarCliente(int idCliente) {
		double saldo = 0;
		boolean achou = false;
		int j;
		int posicao = 0;

		for (j = 0; j < this.cliente.length; j++) {
			if (cliente[j].getNumeroIdentificador() == idCliente){ 
				achou = true;
				posicao = j;
			}
		}	

		if (achou == true){
			if (cliente[posicao].getQuantContas() == 1) {
				for (j = 0; j < cliente[posicao].getQuantContas(); j++) 
					System.out.println("Saldo do cliente é de R$ "+cliente[posicao].getConta()[j].getSaldo());
			}else
				for (j = 0; j < cliente[posicao].getQuantContas(); j++)
					System.out.println("Saldo do cliente na conta nº: "+cliente[posicao].getConta()[j].getCodigo()+
							" é de R$ "+cliente[posicao].getConta()[j].getSaldo());
		}

		return saldo;
	}	
}
