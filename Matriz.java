package Arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		int [][] numeros = new int [3][3];
		int [] diagP = new int[3];
		int [] diagS = new int[3];
		int somaDiagP = 0, somaDiagS=0; 
		
		
		for (int linha = 0; linha < numeros.length; linha++) {
			
			for (int coluna = 0; coluna < numeros.length; coluna++) {
				System.out.println("\nEntre com os valores: ");
				numeros[linha][coluna] = leia.nextInt();
				
			}
		}
		
		System.out.println("\nDiagonais principais: ");
		
		for (int linha = 0; linha < numeros.length; linha++) {
			
			for (int coluna = 0; coluna < numeros.length; coluna++) {
				
				if (linha == coluna) {
					
					diagP [linha] = numeros[linha][coluna];
					somaDiagP += numeros[linha][coluna];
					
					System.out.println(diagP[linha]);
				}
				
			}
		}
		
		System.out.println("\nSoma diagonal principal: "+somaDiagP);
		
System.out.println("\nElementos da diagonal secundária: ");
		
		for (int linha = 0; linha < numeros.length; linha++) {
			for (int coluna = 0; coluna < numeros.length; coluna++) {
				
				if (linha + coluna == numeros.length - 1) {
					diagS [linha] = numeros[linha][coluna];
					somaDiagS += numeros[linha][coluna];
				}
				
			}
		
			System.out.println(diagS[linha]);

		}
		System.out.println("Soma de todos os elementos da Diagonal Secundária: "+somaDiagS);

		
		
		
		
		
		
	}

}