package it.epicode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> l = restituisciLista(10);
		for(int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}

	static // creazione array con numeri casuali
	Random randomGenerator = new Random();


	public static List<Integer> restituisciLista(int n) {
		List<Integer> listona = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int numeriCasuali = randomGenerator.nextInt(100);
			listona.add(numeriCasuali);

		}
		return listona;
	}
	public static List<Integer> listaCapovolta(List l){
		List<Integer> listona = new ArrayList<>();
		return listona;
	
		
}
}
