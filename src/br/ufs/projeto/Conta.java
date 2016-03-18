package br.ufs.projeto;

/**
 * 
 * @author DANIELA DOS SANTOS E TAYLAN NALIMAR CRUZ CELESTINO
 * @since 11/03/2016
 *
 */

public class Conta {

	private int codigo;
	private double saldo;

	public Conta(int codigo, double saldo) {
		this.codigo = codigo;
		this.saldo = saldo;
	}
	
	public Conta() {
		
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getSaldo() {
		return saldo;
	}

	
	/**M�TODO PARA DEPOSITAR DINHEIRO EM UMA CONTA
	 * 
	 * @param valor
	 * @return 	saldo
	 */
	public double depositar( double valor){

		return saldo = saldo + valor;
	}

	
	/**M�TODO PARA SACAR DINHEIRO DE UMA CONTA
	 * 
	 * @param valor
	 */
	public void sacar( double valor){

		double novoSaldo = saldo - valor;

		if (novoSaldo > 0) {

			System.out.println( "Novo saldo: "+novoSaldo );

		}else

			System.out.println("Saldo insuficiente!");

	}
	
	
	/**M�TODO PARA FAZER TRANSFER�NCIAS ENTRE CLIENTES
	 * 
	 * @param valorTransferido
	 * @param destinatario
	 */
	public void fazerTransferencia(double valorTransferido, Conta destinatario){
		this.saldo = this.saldo - valorTransferido;
		destinatario.saldo = destinatario.saldo + valorTransferido; 
	}
	
}
