package Collections;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayList {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		String cor;
		
		List<String> cores = new java.util.ArrayList<String>();
		
		do {
			
			System.out.println("\nInforme uma cor: ");
			cor = leia.next();
			leia.nextLine();
			cores.add(cor);
		}while (cores.size() <5);
		
		Collections.sort(cores);
		System.out.println("\nCores ordenadas");
		System.out.println(cores);
		
		cores.add(cor);
		cores.add(cor);
		cores.add(cor);
		cores.add(cor);
		cores.add(cor);
		
		
	
		

	}

}
