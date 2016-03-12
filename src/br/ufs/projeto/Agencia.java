package br.ufs.projeto;

public class Agencia {

	private int codigo;
	private Cliente[] cliente;
	//private double montante;
	int i;

	public Agencia(int codigo) {
		this.codigo = codigo;
		this.cliente = new Cliente[3];
	//	this.montante = montante;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCliente(Cliente cliente) {
		this.cliente[i] = cliente;
		i++;
	}

	/*public void setMontante(double montante) {
		this.montante = montante;
	}*/

	public int getCodigo() {
		return codigo;
	}

	public Cliente[] getCliente() {
		return cliente;
	}

	/*public double getMontante() {
		return montante;
	}*/

	public double MontanteNaAgencia() {
		double somaMontanteAgencia = 0;
		for (int i = 0; i < cliente.length; i++) {
			somaMontanteAgencia = somaMontanteAgencia + cliente[i].getConta()[i].getSaldo();
		}
		return somaMontanteAgencia;
	}

}
