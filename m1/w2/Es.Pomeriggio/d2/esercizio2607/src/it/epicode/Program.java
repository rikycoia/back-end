package it.epicode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		System.out.println("quante parole vuoi inserire?");
		int parole = readInt();

		Set<String> elenco = new HashSet<>();

		// adesso l'utente deve inserire tutte le parole che vuole con il ciclo for
		for (int i = 0; i < parole; i++) {
			String parola = readString();

			if (!elenco.add(parola)) {
				System.out.println("stampiamo la parola duplicata: " + parola);

			}
		}

		System.out.println("stampiamo il numero di parole diverse: " + elenco.size());
		for(String s : elenco) {
			System.out.println(s);
			
		}
	}

	static Scanner scanner = new Scanner(System.in);

	static String readString() {
		return scanner.nextLine();
	}

	static int readInt() {
		return Integer.parseInt(readString());
	}
}
