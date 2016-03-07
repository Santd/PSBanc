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
		Agencia[] agencia = new Agencia[8];
		Cliente[] cliente = new Cliente[50];
		Banco banco = new Banco("Banese", 0, null, 0);
		byte NumeroDaAgencia;
		byte opcao = 0;
		int i;

		System.out.println("Banco "+banco.getNome()+"\n");
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
			System.out.println("Montante de dinheiro aplicado no banco é R$ "+banco.getMontante());
			break;

		case 2:
			System.out.println("Digite o número de uma das agências: ");
			NumeroDaAgencia = input.nextByte();

			for (i = 0; i < agencia.length; i++) {
				if (NumeroDaAgencia != agencia[i].getCodigo()) {		
					System.out.println("O número informado não pertence a nenhuma agência do Banco"+banco.getNome());		
				}
				System.out.println("Montante de dinheiro aplicado na Agência"+agencia[i].getCodigo()+" é R$ "+agencia[i].getMontante());	
			}
			break;
			
		default:
			break;
		}


	}


}
