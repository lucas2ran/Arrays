package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArraySet {

	public static void main(String[] args) {
		
		List<Integer> myLista = new ArrayList<Integer>();
		
		
		myLista.add(2);
		myLista.add(5);
		myLista.add(1);//remover o 1
		myLista.add(3);
		myLista.add(4);
		myLista.add(9);//remover o 9
		myLista.add(7);//remover o 7
		myLista.add(8);//remover o 8
		myLista.add(10);
		myLista.add(6);//remover o 6

		for(Integer ListaElementos:myLista) {
			System.out.println(ListaElementos);
		}
		Collections.sort(myLista);
		System.out.println("\nLista dos dados ordenados ");
		System.out.println(myLista);
		
		for(Integer ListaElementos:myLista) {
			System.out.println(ListaElementos);
			
		}
		
		Collections.sort(myLista);
		System.out.println("\nElementos ordenados da lista ");
		System.out.println(myLista);
		
		System.out.println();
		
		Set<Integer> myListOrder = new HashSet<Integer>();
		
		myListOrder.add(2);
		myListOrder.add(5);
		myListOrder.add(10);
		myListOrder.add(3);
		myListOrder.add(4);
		myListOrder.add(2);
		myListOrder.add(2);
		myListOrder.add(3);
		myListOrder.add(10);
		myListOrder.add(5);
		
		Iterator<Integer> iMeuSet = myListOrder.iterator();
		
		while(iMeuSet.hasNext()) {
			
			System.out.println(iMeuSet.next());
		
		}
		
	}

}
