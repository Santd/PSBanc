import br.ufs.projeto.*;
import java.util.Scanner;
/**
 * 
 * @author DANIELA DOS SANTOS E TAYLAN NALIMAR CRUZ CELESTINO
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
		int idCliente;
		int codigoAgencia;
		double valorTrasferido;


		Agencia agencia1 = new Agencia(2001);
		banco.setAgencia(agencia1);
		Agencia agencia2 = new Agencia(2002);
		banco.setAgencia(agencia2);

		Conta conta1 = new Conta(9001, 1500.00);
		Conta conta2 = new Conta(9002, 100.00);
		Conta conta3 = new Conta(9003, 1000.35);

		Cliente cliente1 = new Cliente("Rute Vieira", 31, conta1, 1000);
		agencia1.setCliente(cliente1);
		Cliente cliente2 = new Cliente("José Silva", 50, conta2, 1001);
		agencia2.setCliente(cliente2);
		cliente2.setConta(conta3);
		
		
		do {

			System.out.println(banco.getNome()+"\nCódigo: "+banco.getCodigo()+"\n");
			System.out.println("Menu\n");
			System.out.println("Digite uma das seguintes opções:");
			System.out.println("1- Exibir o montante em dinheiro aplicado no banco");
			System.out.println("2- Exibir o montante em dinheiro aplicado em uma determinada agência");
			System.out.println("3- Exibir o saldo de um cliente em uma agência");
			System.out.println("4- Exibir o saldo de um cliente em várias agências ");
			System.out.println("5- Fazer transferências entre clientes");
			//System.out.println("6- Fazer pagamento de contas");
			//System.out.println("7- Exibir um extrato detalhado de um cliente");
			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Montante de dinheiro aplicado no banco é R$ "+banco.CalcularMontante());
				
				break;
				
			case 2:
				System.out.println("Digite o código correspondente a uma das agências: ");

				banco.codigosDasAgencias();

				agenciaEscolhida = input.nextInt();

				banco.procurarAgencia(agenciaEscolhida);
				
				break;
				
			case 3:
				System.out.println("Informe o código da agência:");
				codigoAgencia = input.nextInt();
				System.out.println("Informe o nº de identificação do cliente:");
				idCliente = input.nextInt();
				
				banco.exibirSaldo(idCliente, codigoAgencia);
				
				break;

			case 4:
				System.out.println("Informe o nº de identificação do cliente:");
				idCliente = input.nextInt();
				
				banco.exibirSaldoEmVariasAgencias(idCliente);

				break;

			case 5:
				System.out.println("Informe o valor a ser trasferido: ");
				valorTrasferido = input.nextDouble();
				cliente1.getConta()[0].fazerTransferencia(valorTrasferido, cliente2.getConta()[0]);
				System.out.println(cliente2.getConta()[0].getSaldo());
				System.out.println(cliente1.getConta()[0].getSaldo());
	
				break;
	
			default:
				System.out.println("Opção inválida!");
				break;

			}

			System.out.println();
			System.out.println();
			System.out.println("Para sair do sistema aperte '1' para continuar aperte '0' ");
			sairContinuar = input.nextByte();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
		} while (sairContinuar != 1);
		
		System.out.println("Fim do Programa!");
	}

}
