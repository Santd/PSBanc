package br.ufs.projeto;

import java.util.Random;
import java.util.Scanner;
/**
 * 
 * @author DANIELA DOS SANTOS E TAYLAN NALIMAR CRUZ CELESTINO
 *@since 11/03/2016
 */

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


	/**MÉTODO PARA CRIAÇÃO DE NOVAS AGÊNCIAS EM UM BANCO
	 * 
	 * @return void
	 */
	public void  criarAgencia() {

		Agencia agenciaNova = new Agencia();
		Random codigoAleatorio = new Random();

		agenciaNova.setCodigo(codigoAleatorio.nextInt(100));
		this.agencia[novaAgencia] = agenciaNova;
		novaAgencia++;
		System.out.println("código da agência: "+agenciaNova.getCodigo());
	}


	/**MÉTODO PARA CADASTRO DE NOVOS CLIENTES
	 * 
	 * @param nome
	 * @param idade
	 */
	public void cadastrarCliente(Cliente cliente) {
		int i;

		if (novaAgencia == 0) 
			System.out.println("Impossível cadastrar o cliente, primeiro crie uma agência!");
		else{
			System.out.println("Escolha o número referente a uma das agências abaixo para cadastrar o cliente:");

			for (i = 0; i < novaAgencia; i++) {
				System.out.println("Agência código: "+agencia[i].getCodigo());
			}	

			agenciaEscolhida = input.nextInt();
			System.out.println("Cliente cadastrado na agência código: "+agenciaEscolhida);

			for (int j = 0; j < novaAgencia; j++) {
				if (agencia[j].getCodigo() == agenciaEscolhida) {
					agencia[j].setCliente(cliente);;
				}				
			}
		}
	}


	/**MÉTODO QUE MOSTRA PARA O USUÁRIO O CÓDIGO DAS AGÊNCIAS QUE JÁ EXISTEM
	 * 
	 * @return void
	 */
	public void codigosDasAgencias() {
		for (int i = 0; i < novaAgencia; i++) {
			System.out.println("Agência código: "+agencia[i].getCodigo());
		}

	}


	/**MÉTODO PARA PROCURAR UMA DETERMINADA AGÊNCIA ATRAVÉS DO CÓDIGO INFORMADO
	 *  PELO USUÁRIO
	 * 
	 * @param codigo
	 * @return O MONTANTE DE UMA AGÊNCIA
	 */
	public void procurarAgencia(int codigo) {
		int j;

		for (j = 0; j < novaAgencia; j++) {
			if (agencia[j].getCodigo() == codigo) {
				System.out.println("Montante de dinheiro aplicado na Agência "
						+agencia[j].getCodigo()+" é R$ "+agencia[j].MontanteNaAgencia());
			}
		}	
	}


	/**MÉTODO PARA CALCULAR O MONTANTE DE DINHEIRO EM UM BANCO,
	 * CONSIDERANDO A SOMA DOS MONTANTES DE CADA AGÊNCIA EXISTENTE.
	 * 
	 * @return double - SOMATÓRIO DOS MONTANTES DAS AGÊNCIAS
	 */
	public double CalcularMontante(){
		double somaMontante = 0;

		for (int i = 0; i < novaAgencia; i++) {
			somaMontante = somaMontante + agencia[i].MontanteNaAgencia();
		}

		return somaMontante;
	}


	/**MÉTODO QUE MOSTRA O SALDO DE UM CLIENTE EM UMA AGÊNCIA,
	 * ATRAVÉS DE UMA BUSCA PELO ID DO CLIENTE 
	 * 
	 * @param idCliente - NÚMERO DE IDENTIFICAÇÃO DO CLIENTE
	 * @param codigo - CÓDIGO DA AGÊNCIA
	 * @return saldo
	 */
	public double exibirSaldo(int idCliente, int codigo) {
		double saldo = 0;

		for (int i = 0; i < novaAgencia; i++) {
			if (agencia[i].getCodigo() == codigo ) {
				agencia[i].buscarCliente(idCliente);
				break;
			}
		}

		return saldo;
	}


	/**MÉTODO PARA EXIBIR O SALDO DE VÁRIAS CONTAS AO MESMO TEMPO DE UM CLIENTE
	 * 
	 * @param idCliente
	 */
	public void exibirSaldoEmVariasAgencias(int idCliente) {

		for (int i = 0; i < novaAgencia; i++) {
			for (int j = 0; j < agencia[i].novoCliente; j++){
				if (agencia[i].getCliente()[j].getNumeroIdentificador() == idCliente) {
					for (int k = 0; k < agencia[i].getCliente()[j].getQuantContas(); k++) {
						System.out.println("Saldo do cliente na agência "+agencia[i].getCodigo()+
								" é de R$ "+agencia[i].getCliente()[j].getConta()[k].getSaldo());
					}					
				}
			}
		}

	}
}

