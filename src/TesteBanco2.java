import java.util.Scanner;
import br.ufs.projeto.*;
/**
 * 
 * @author 
 *@since 11/03/2016
 */

public class TesteBanco2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Banco banco2 = new Banco("Banco B", 230);
		byte opcao;
		byte sairContinuar;
		String nome;
		int idade;
		
	
		do {

			System.out.println(banco2.getNome()+"\nCódigo: "+banco2.getCodigo()+"\n");
			System.out.println("Menu\n");
			System.out.println("Digite uma das seguintes opções:");
			System.out.println("1- Criar Agência");
			System.out.println("2- Cadastrar cliente em uma agência");
			System.out.println("3- Criar uma conta para um cliente");
			opcao = input.nextByte();
			
			switch (opcao) {

			case 1:	
					banco2.criarAgencia();							
				break;
				
			case 2:		
				System.out.println("Cadastrando novo cliente");
				System.out.println("Digite o nome: ");
				nome = input.next();input.nextLine();
				System.out.println("Digite a idade: ");
				idade = input.nextInt();
				banco2.cadastrarCliente(nome, idade);
				

			case 3:												
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
			System.out.println("Para sair do menu aperte '1' para continuar aperte '0' ");
			sairContinuar = input.nextByte();
			System.out.println();
			System.out.println();

		} while (sairContinuar != 1);
		System.out.println("Fim do Programa!");


	}

}
