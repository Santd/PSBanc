import java.util.Scanner;
import br.ufs.projeto.*;
/**
 * 
 * @author
 * @since
 *
 */
public class TesteBanco {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Banco banco = new Banco();
		int agenciaEscolhida;
		int opcao = 0;
		byte sairContinuar = 0;
		int i = 0;
		String nomeCliente;
		int numeroIdentificacao;
		int codigoAgencia;
		
		//Total de agências: 3
		Agencia agencia1 = new Agencia(2048);
		banco.setAgencia(agencia1);
		Agencia agencia2 = new Agencia(2068);
		banco.setAgencia(agencia2);
		Agencia agencia3 = new Agencia(2059);
		banco.setAgencia(agencia3);

		//Contas: 10
		Conta conta1 = new Conta(2563, 1500.00);
		Conta conta2 = new Conta(2573, 100.89);
		Conta conta3 = new Conta(2583, 1000.35);
		Conta conta4 = new Conta(2593, 2500.99);
		Conta conta5 = new Conta(2553, 880.20);
		Conta conta6 = new Conta(2523, 500.10);
		Conta conta7 = new Conta(2503, 8000.00);
		Conta conta8 = new Conta(2500, 1500.00);
		Conta conta9 = new Conta(2501, 1500.45);
		Conta conta10 = new Conta(2545, 400.00);

		//Clientes cadastrados: 9
		Cliente cliente1 = new Cliente("Rute Santos", 31, conta1, 1596);
		agencia1.setCliente(cliente1);
		Cliente cliente2 = new Cliente("José Santos", 50, conta2, conta3, 1597);
		agencia1.setCliente(cliente2);
		Cliente cliente3 = new Cliente("Emília Cardoso", 41, conta4, 1500);
		agencia1.setCliente(cliente3);
		Cliente cliente4 = new Cliente("Ricardo Bezerra", 30, conta5, 1599);
		agencia2.setCliente(cliente4);
		Cliente cliente5 = new Cliente("Daiana Bispo", 25, conta6, 2000);
		agencia2.setCliente(cliente5);
		Cliente cliente6 = new Cliente("Ruth Souza", 32, conta7, 1689);
		agencia2.setCliente(cliente6);
		Cliente cliente7 = new Cliente("Ray Souza", 26, conta8, 1456);
		agencia3.setCliente(cliente7);
		Cliente cliente8 = new Cliente("Paulo Teles Silva", 64, conta9, 2002);
		agencia3.setCliente(cliente8);
		Cliente cliente9 = new Cliente("Maria Souza", 45, conta10, 1050);
		agencia3.setCliente(cliente9);


		do {

			System.out.println(banco.getNome()+"\nCódigo: "+banco.getCodigo()+"\n");
			System.out.println("Menu\n");
			System.out.println("Digite uma das seguintes opções:");
			System.out.println("1- Exibir o montante em dinheiro aplicado no banco");
			System.out.println("2- Exibir o montante em dinheiro aplicado em uma determinada agência");
			System.out.println("3- Exibir o saldo de um cliente em uma agência");
			System.out.println("4- Exibir o saldo de um cliente");
			System.out.println("5- Fazer transferências entre clientes");
			System.out.println("6- Fazer pagamento de contas");
			System.out.println("7- Exibir um extrato detalhado de um cliente");
			opcao = input.nextByte();

			switch (opcao) {
			
			case 1:
				
				System.out.println("Montante de dinheiro aplicado no banco é R$ "+banco.CalcularMontante());
				break;
				
			case 2:
				
				System.out.println("Digite o código correspondente a uma das agências: ");
				System.out.println("Agência cód.: "+agencia1.getCodigo());
				System.out.println("Agência cód.: "+agencia2.getCodigo());
				System.out.println("Agência cód.: "+agencia3.getCodigo());
				agenciaEscolhida = input.nextInt();

				if(agenciaEscolhida == agencia1.getCodigo() ){
					System.out.println("Montante de dinheiro aplicado na Agência"
							+agencia1.getCodigo()+" é R$ "+agencia1.MontanteNaAgencia());	
				}

				if(agenciaEscolhida == agencia2.getCodigo() ){
					System.out.println("Montante de dinheiro aplicado na Agência"
							+agencia2.getCodigo()+" é R$ "+agencia2.MontanteNaAgencia());	
				}

				if(agenciaEscolhida == agencia3.getCodigo() ){
					System.out.println("Montante de dinheiro aplicado na Agência"
							+agencia3.getCodigo()+" é R$ "+agencia3.MontanteNaAgencia());	
				}
				break;
				
			case 3:
				
				System.out.println("Informe o código da agência:");
				codigoAgencia = input.nextInt();
				System.out.println("Informe o nome do cliente:");
				nomeCliente = input.nextLine();
				System.out.println("Saldo do cliente é de R$ "+banco.ExibirSaldoB(nomeCliente, codigoAgencia));
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
