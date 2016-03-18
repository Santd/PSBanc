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


	/**M�TODO PARA CRIA��O DE NOVAS AG�NCIAS EM UM BANCO
	 * 
	 * @return void
	 */
	public void  criarAgencia() {

		Agencia agenciaNova = new Agencia();
		Random codigoAleatorio = new Random();

		agenciaNova.setCodigo(codigoAleatorio.nextInt(100));
		this.agencia[novaAgencia] = agenciaNova;
		novaAgencia++;
		System.out.println("c�digo da ag�ncia: "+agenciaNova.getCodigo());
	}


	/**M�TODO PARA CADASTRO DE NOVOS CLIENTES
	 * 
	 * @param nome
	 * @param idade
	 */
	public void cadastrarCliente(Cliente cliente) {
		int i;

		if (novaAgencia == 0) 
			System.out.println("Imposs�vel cadastrar o cliente, primeiro crie uma ag�ncia!");
		else{
			System.out.println("Escolha o n�mero referente a uma das ag�ncias abaixo para cadastrar o cliente:");

			for (i = 0; i < novaAgencia; i++) {
				System.out.println("Ag�ncia c�digo: "+agencia[i].getCodigo());
			}	

			agenciaEscolhida = input.nextInt();
			System.out.println("Cliente cadastrado na ag�ncia c�digo: "+agenciaEscolhida);

			for (int j = 0; j < novaAgencia; j++) {
				if (agencia[j].getCodigo() == agenciaEscolhida) {
					agencia[j].setCliente(cliente);;
				}				
			}
		}
	}


	/**M�TODO QUE MOSTRA PARA O USU�RIO O C�DIGO DAS AG�NCIAS QUE J� EXISTEM
	 * 
	 * @return void
	 */
	public void codigosDasAgencias() {
		for (int i = 0; i < novaAgencia; i++) {
			System.out.println("Ag�ncia c�digo: "+agencia[i].getCodigo());
		}

	}


	/**M�TODO PARA PROCURAR UMA DETERMINADA AG�NCIA ATRAV�S DO C�DIGO INFORMADO
	 *  PELO USU�RIO
	 * 
	 * @param codigo
	 * @return O MONTANTE DE UMA AG�NCIA
	 */
	public void procurarAgencia(int codigo) {
		int j;

		for (j = 0; j < novaAgencia; j++) {
			if (agencia[j].getCodigo() == codigo) {
				System.out.println("Montante de dinheiro aplicado na Ag�ncia "
						+agencia[j].getCodigo()+" � R$ "+agencia[j].MontanteNaAgencia());
			}
		}	
	}


	/**M�TODO PARA CALCULAR O MONTANTE DE DINHEIRO EM UM BANCO,
	 * CONSIDERANDO A SOMA DOS MONTANTES DE CADA AG�NCIA EXISTENTE.
	 * 
	 * @return double - SOMAT�RIO DOS MONTANTES DAS AG�NCIAS
	 */
	public double CalcularMontante(){
		double somaMontante = 0;

		for (int i = 0; i < novaAgencia; i++) {
			somaMontante = somaMontante + agencia[i].MontanteNaAgencia();
		}

		return somaMontante;
	}


	/**M�TODO QUE MOSTRA O SALDO DE UM CLIENTE EM UMA AG�NCIA,
	 * ATRAV�S DE UMA BUSCA PELO ID DO CLIENTE 
	 * 
	 * @param idCliente - N�MERO DE IDENTIFICA��O DO CLIENTE
	 * @param codigo - C�DIGO DA AG�NCIA
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


	/**M�TODO PARA EXIBIR O SALDO DE V�RIAS CONTAS AO MESMO TEMPO DE UM CLIENTE
	 * 
	 * @param idCliente
	 */
	public void exibirSaldoEmVariasAgencias(int idCliente) {

		for (int i = 0; i < novaAgencia; i++) {
			for (int j = 0; j < agencia[i].novoCliente; j++){
				if (agencia[i].getCliente()[j].getNumeroIdentificador() == idCliente) {
					for (int k = 0; k < agencia[i].getCliente()[j].getQuantContas(); k++) {
						System.out.println("Saldo do cliente na ag�ncia "+agencia[i].getCodigo()+
								" � de R$ "+agencia[i].getCliente()[j].getConta()[k].getSaldo());
					}					
				}
			}
		}

	}
}

