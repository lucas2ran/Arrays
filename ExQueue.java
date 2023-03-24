package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExQueue {

	public static void main(String[] args) {

		int op;

		Scanner leia = new Scanner(System.in);

		Queue<String> cliente = new LinkedList<String>();

		do {

			System.out.println("\n\tBem vindo ao BSF - Banco StackFull :)");
			System.out.println("*****************************************************");
			System.out.println("\n1 - Adicionar Cliente");
			System.out.println("\n2 - Listar todos os clientes");
			System.out.println("\n3 - Retirar cliente da fila");
			System.out.println("\n0 - Sair");
			System.out.println("*****************************************************");
			System.out.println("\nDigite uma opção: ");
			System.out.println();
			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o cliente que deseja adicionar: ");
				String nomes = leia.nextLine();
				cliente.add(nomes);
				System.out.println("\nNome adicionado!");
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nLista de clientes:" + cliente);
				System.out.println();
				break;

			case 3:
				System.out.println();
				if (cliente.isEmpty() == true) {
					System.out.println();
					System.out.println("\nA lista está vazia!!!");

				} else {
					System.out.println("\nPegar um cliente da lista " + cliente.poll());

				}
			
			case 0:
				System.out.println("\nPrograma finalizado! ");
				
			default:
				System.out.println();

			}
		} while (op != 0);

	}

}
