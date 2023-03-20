package Java07;

import java.util.Scanner;

public class ExMatriz {

	public static void main(String[] args) {
		
		int[][] numeros = new int[3][3];
		int lin,colum,somaMatriz=0,somaDiagP=0,somaDiagS=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(lin=0;lin<3;lin++) {
			for(colum=0;colum<3;colum++) {
				System.out.println("\nEntre com o número: ");
				numeros[lin][colum] = leia.nextInt();
				
				if(lin == colum) {
					somaDiagP += numeros[lin][colum];
					
				if(colum == lin) {
					somaDiagS += numeros[colum][lin];
				}
				}
				
			}
		}
		System.out.println("\nA soma dos valores da diagonal principal são: "+somaDiagP);
		System.out.println("\nA soma dos valores da diagonal Secundária são: "+somaDiagS);
	}

}
