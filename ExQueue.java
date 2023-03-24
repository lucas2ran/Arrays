package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExQueue {

	public static void main(String[] args) {

		int op;

		Scanner leia = new Scanner(System.in);

		Queue<String> pilha = new LinkedList<String>();

		do {

			System.out.println("\n\tBem vindo ao BSF - Banco StackFull :)");
			System.out.println("*****************************************************");
			System.out.println("\n1 - Adicionar livro na pilha");
			System.out.println("\n2 - Listar todos os livros");
			System.out.println("\n3 - Retirar livro da pilha");
			System.out.println("\n0 - Sair");
			System.out.println("*****************************************************");
			System.out.println("\nDigite uma ação: ");
			System.out.println();
			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o livro que deseja adicionar: ");
				String livros = leia.nextLine();
				pilha.add(livros);
				System.out.println("\nNome adicionado!");
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nLista de livros:" +pilha);
				System.out.println();
				break;

			case 3:
				System.out.println();
				if (pilha.isEmpty() == true) {
					System.out.println();
					System.out.println("\nA pilha está vazia!!!");

				} else {
					System.out.println("\nPegar um livro da pilha " +pilha.poll());

				}
			
			case 0:
				System.out.println("\nPrograma finalizado! ");
				
				default:
					System.out.println();

			}
		} while (op != 0);

	}

}
