package Java07;

import java.util.Scanner;

public class ExVetor {

	public static void main(String[] args) {
		
		int[] posiç = new int[10];
		int x;
		int[] numero = new int[10];
		int num,cont=0;
		
		Scanner leia = new Scanner(System.in);
			
			for(x=0;x<10;x++) {
				System.out.println("\nENTRE COM O NÚMERO DO ARRAY: ");
				posiç[x] = leia.nextInt();
				
			}
			
			System.out.println("\nDIGITE UM NÚMERO: ");
			num = leia.nextInt();
			
			for(x=0;x<10;x++) {
				
				if(posiç[x] == num) {
					System.out.println("\nA POSIÇÃO DO NÚMERO DIGITADO É: "+x);
					cont++;
				}
			}
			
			if(cont == 0) {
				System.out.println("\nNÃO FOI ENCONTRADO!");
			}
			
		}

	}


