package br.ufs.projeto;

public class Agencia {
	
	private int codigo;
	Cliente cliente;
	private double montante;
	
	public Agencia() {
		this.codigo = 0;
		this.cliente = null;
		this.montante = 0;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}

	public int getCodigo() {
		return codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getMontante() {
		return montante;
	}

}
