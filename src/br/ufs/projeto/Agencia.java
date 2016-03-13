package br.ufs.projeto;

public class Agencia {

	private int codigo;
	private Cliente[] cliente;
	int i;

	public Agencia(int codigo) {
		this.codigo = codigo;
		this.cliente = new Cliente[3];
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCliente(Cliente cliente) {
		this.cliente[i] = cliente;
		i++;
	}

	public int getCodigo() {
		return codigo;
	}

	public Cliente[] getCliente() {
		return cliente;
	}

	public double MontanteNaAgencia() {
		double somaMontanteAgencia = 0;

		for (int i = 0; i < cliente.length; i++) {
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

	public double BuscarCliente(String nome) {
		double saldo = 0;
		boolean achou = false;
		int j;
		int posicao = 0;

		for (j = 0; j < this.cliente.length; j++) {
			if (cliente[j].getNome() == nome){ 
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
