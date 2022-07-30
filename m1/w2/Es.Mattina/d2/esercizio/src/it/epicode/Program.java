package it.epicode;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<Cliente> clienti = new HashSet<>();
		clienti.add(new Cliente(" Riccardo", " Coia", " 001", " Lombardia"));
		clienti.add(new Cliente(" Riccardo", " Gioia", " 002", " Lombardia"));
		clienti.add(new Cliente(" Ciro", " Esposito", " 003", " Campania"));
		for (Cliente cliente : clienti) {
			System.out.println(cliente);
		}
	}

}
