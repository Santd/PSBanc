import br.ufs.projeto.*;
import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @author DANIELA DOS SANTOS E TAYLAN NALIMAR CRUZ CELESTINO
 *@since 11/03/2016
 */

public class TesteBanco2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random idAleatorio = new Random();
		Random codigoContaAleatorio = new Random();
		Banco banco2 = new Banco("Banco B", 230);
		byte opcao;
		byte sairContinuar = 0;
		String nome;
		int idade;
		int agenciaEscolhida;
		double saldoInicial = 0;
		int idCliente;
		int codigoAgencia;
		
		

		do{
			do {
				System.out.println(banco2.getNome()+"\nCódigo: "+banco2.getCodigo()+"\n");
				System.out.println("Menu de cadastros\n");
				System.out.println("Digite uma das seguintes opções:");
				System.out.println("1- Criar Agência");
				System.out.println("2- Cadastrar cliente com conta simples");
				
				opcao = input.nextByte();

				switch (opcao) {

				case 1:	
					banco2.criarAgencia();	

					break;

				case 2:		
					do {
						System.out.println("Cadastrando novo cliente com conta simples");
						System.out.println("Digite o nome: ");
						nome = input.next();input.nextLine();
						System.out.println("Digite a idade: ");
						idade = input.nextInt();
						System.out.println("Digite o id do cliente: ");
						idCliente = input.nextInt();
						System.out.println("Digite o valor do saldo inicial");
						saldoInicial = input.nextDouble();

						Conta conta = new Conta(codigoContaAleatorio.nextInt(200), saldoInicial);
						Cliente cliente = new Cliente(nome, idade, conta, idCliente);


						banco2.cadastrarCliente(cliente);

						System.out.println();
						System.out.println("Para sair do menu aperte '1' para continuar aperte '0' ");
						sairContinuar = input.nextByte();
						System.out.println();
						System.out.println();

					} while (sairContinuar != 1);

					System.out.println("Você saiu do menu de cadastro de clientes!");
					break;

				case 3:	
					Conta conta = new Conta();
					System.out.println("Conta conjunta");
					do {
						System.out.println("Cadastrando novo cliente na conta conjunta");
						System.out.println("Digite o nome: ");
						nome = input.next();input.nextLine();
						System.out.println("Digite a idade: ");
						idade = input.nextInt();
						System.out.println("Digite o valor do saldo inicial");
						saldoInicial = input.nextDouble();

						conta.setCodigo(codigoContaAleatorio.nextInt(200));
						conta.setSaldo(saldoInicial);
						Cliente cliente = new Cliente(nome, idade, conta, idAleatorio.nextInt(200));

						banco2.cadastrarCliente(cliente);

						System.out.println();
						System.out.println("Adicionar mais um cliente aperte 0\n sair do menu aperte 1");
						sairContinuar = input.nextByte();
						System.out.println();
						System.out.println();
					} while (sairContinuar != 1);

					break;

				}

				System.out.println();
				System.out.println();
				System.out.println("Para sair do menu aperte '1' para continuar aperte '0' ");
				sairContinuar = input.nextByte();
				System.out.println();
				System.out.println();

			} while (sairContinuar != 1);
			System.out.println("Você saiu do menu!");

			do{
				System.out.println(banco2.getNome()+"\nCódigo: "+banco2.getCodigo()+"\n");
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
					System.out.println("Montante de dinheiro aplicado no banco é R$ "+banco2.CalcularMontante());

					break;

				case 2:
					System.out.println("Digite o código correspondente a uma das agências: ");

					banco2.codigosDasAgencias();

					agenciaEscolhida = input.nextInt();

					banco2.procurarAgencia(agenciaEscolhida);
					
					break;

				case 3:
					System.out.println("Informe o código da agência:");
					codigoAgencia = input.nextInt();
					System.out.println("Informe o nº de identificação do cliente:");
					idCliente = input.nextInt();
					
					banco2.exibirSaldo(idCliente, codigoAgencia);
					
					break;

				case 4:

					break;

				case 5:


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

			}while(sairContinuar != 1);

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
