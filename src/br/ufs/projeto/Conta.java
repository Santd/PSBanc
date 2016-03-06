package br.ufs.projeto;

public class Conta {
	
	private int codigo;
	private double saldo;
	
	public Conta() {
		this.codigo = 0;
		this.saldo = 0;
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

}
