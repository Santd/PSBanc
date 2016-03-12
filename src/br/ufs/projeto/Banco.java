package br.ufs.projeto;

public class Banco {

	private String nome;
	private int codigo;
	private Agencia[] agencia;
	private double montante;
	private int numAgencia;

	public Banco() {
		this.nome = "BancoBD";
		this.codigo = 220;
		this.agencia = new Agencia[3];
		this.montante = 0;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia[numAgencia] = agencia;
		numAgencia++;
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
	
	public double CalcularMontante(){
		double somaMontante = 0;
		
		for (int i = 0; i < agencia.length; i++) {
			somaMontante = somaMontante + agencia[i].MontanteNaAgencia();
		}
		
		return somaMontante;
	}

}
