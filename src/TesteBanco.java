import java.util.Scanner;
import br.ufs.projeto.*;
/**
 * 
 * @author
 * @since  11/03/2016
 *
 */
public class TesteBanco {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Banco banco = new Banco("Banco A", 220);
		int agenciaEscolhida;
		int opcao = 0;
		byte sairContinuar = 0;
		int i = 0;
		int idCliente;
		int codigoAgencia;
		double valorTrasferido;
		int numContaOrigem;
		int numContaDestino;
		int agenciaOrigem;
		int agenciaDestino;
		
		//Total de ag�ncias: 3
		Agencia agencia1 = new Agencia(2001);
		banco.setAgencia(agencia1);
		Agencia agencia2 = new Agencia(2002);
		banco.setAgencia(agencia2);
		Agencia agencia3 = new Agencia(2003);
		banco.setAgencia(agencia3);

		//Contas: 10
		Conta conta1 = new Conta(9001, 1500.00);
		Conta conta2 = new Conta(9002, 100.89);
		Conta conta3 = new Conta(9003, 1000.35);
		Conta conta4 = new Conta(9004, 2500.99);
		Conta conta5 = new Conta(9005, 880.20);
		Conta conta6 = new Conta(9006, 500.10);
		Conta conta7 = new Conta(9007, 8000.00);
		Conta conta8 = new Conta(9008, 1500.00);
		Conta conta9 = new Conta(9009, 1500.45);
		Conta conta10 = new Conta(9010, 400.00);

		//Clientes cadastrados: 9
		Cliente cliente1 = new Cliente("Rute Santos", 31, conta1, 1000);
		agencia1.setCliente(cliente1);
		Cliente cliente2 = new Cliente("Jos� Santos", 50, conta2, conta3, 1001);
		agencia1.setCliente(cliente2);
		Cliente cliente3 = new Cliente("Em�lia Cardoso", 41, conta4, 1002);
		agencia1.setCliente(cliente3);
		Cliente cliente4 = new Cliente("Ricardo Bezerra", 30, conta5, 1003);
		agencia2.setCliente(cliente4);
		Cliente cliente5 = new Cliente("Daiana Bispo", 25, conta6, 1004);
		agencia2.setCliente(cliente5);
		Cliente cliente6 = new Cliente("Ruth Souza", 32, conta7, 1005);
		agencia2.setCliente(cliente6);
		Cliente cliente7 = new Cliente("Ray Souza", 26, conta8, 1006);
		agencia3.setCliente(cliente7);
		Cliente cliente8 = new Cliente("Paulo Teles Silva", 64, conta9, 1007);
		agencia3.setCliente(cliente8);
		Cliente cliente9 = new Cliente("Maria Souza", 45, conta10, 1008);
		agencia3.setCliente(cliente9);


		do {

			System.out.println(banco.getNome()+"\nC�digo: "+banco.getCodigo()+"\n");
			System.out.println("Menu\n");
			System.out.println("Digite uma das seguintes op��es:");
			System.out.println("1- Exibir o montante em dinheiro aplicado no banco");
			System.out.println("2- Exibir o montante em dinheiro aplicado em uma determinada ag�ncia");
			System.out.println("3- Exibir o saldo de um cliente em uma ag�ncia");
			System.out.println("4- Exibir o saldo de um cliente");
			System.out.println("5- Fazer transfer�ncias entre clientes");
			System.out.println("6- Fazer pagamento de contas");
			System.out.println("7- Exibir um extrato detalhado de um cliente");
			opcao = input.nextByte();

			switch (opcao) {
			
			case 1:
				
				System.out.println("Montante de dinheiro aplicado no banco � R$ "+banco.CalcularMontante());
				
				break;
				
			case 2:
				
				System.out.println("Digite o c�digo correspondente a uma das ag�ncias: ");
				System.out.println("Ag�ncia c�d.: "+agencia1.getCodigo());
				System.out.println("Ag�ncia c�d.: "+agencia2.getCodigo());
				System.out.println("Ag�ncia c�d.: "+agencia3.getCodigo());
				agenciaEscolhida = input.nextInt();

				if(agenciaEscolhida == agencia1.getCodigo() ){
					System.out.println("Montante de dinheiro aplicado na Ag�ncia"
							+agencia1.getCodigo()+" � R$ "+agencia1.MontanteNaAgencia());	
				}

				if(agenciaEscolhida == agencia2.getCodigo() ){
					System.out.println("Montante de dinheiro aplicado na Ag�ncia"
							+agencia2.getCodigo()+" � R$ "+agencia2.MontanteNaAgencia());	
				}

				if(agenciaEscolhida == agencia3.getCodigo() ){
					System.out.println("Montante de dinheiro aplicado na Ag�ncia"
							+agencia3.getCodigo()+" � R$ "+agencia3.MontanteNaAgencia());	
				}
				
				break;
				
			case 3:
				
				System.out.println("Informe o c�digo da ag�ncia:");
				codigoAgencia = input.nextInt();
				System.out.println("Informe o n� de identifica��o do cliente:");
				idCliente = input.nextInt();
				System.out.println("Saldo do cliente � de R$ "+banco.exibirSaldoB(idCliente, codigoAgencia));
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				System.out.println("Informe o valor a ser trasferido: ");
				valorTrasferido = input.nextDouble();
				System.out.println("Informe o c�digo da ag�ncia: ");
				agenciaOrigem = input.nextInt();
				System.out.println("Informe o n�mero da conta: ");
				numContaOrigem = input.nextInt();
				System.out.println("Informe o c�digo da ag�ncia: ");
				agenciaDestino = input.nextInt();
				System.out.println("Informe o n�mero da conta de destino da transfer�ncia: ");
				numContaDestino = input.nextInt();
				
				break;
			
			case 6:
				
				
				
				break;
				
			case 7:
				
				break;
				
			default:
				break;
				
			}
			
			System.out.println();
			System.out.println();
			System.out.println("Para sair do sistema aperte '1' para continuar aperte '0' ");
			sairContinuar = input.nextByte();
			System.out.println();
			System.out.println();
			
		} while (sairContinuar != 1);
		System.out.println("Fim do Programa!");
	}

}
