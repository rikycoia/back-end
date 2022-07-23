package it.epicode.main;

import it.epicode.calcolatrice.*;

public class Program {

	static void usaCalcolatrice(Calcolatrice c) {
		c.addizione(10);
		c.sottrazione(20);
		c.moltiplicazione(40);
		c.divisione(50);
		
		System.out.println(c.getAccumulatore());
	}
	public static void main(String[] args) {
		Calcolatrice calc = new Calcolatrice();
		usaCalcolatrice(calc);

	}

}
