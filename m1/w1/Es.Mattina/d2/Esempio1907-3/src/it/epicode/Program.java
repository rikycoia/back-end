package it.epicode;

public class Program {

	public static void main(String[] args) {
//		Persona paperino = new Persona();
//		paperino.setNome("Paperino");
//		paperino.setCognome("Paolino");
//		paperino.setCodiceFiscale("PPPPRN00X00X000X");
//
//		Persona archimede = new Persona();
//		archimede.setNome("Archimede");
//		archimede.setCognome("Pitagorico");
//		archimede.setCodiceFiscale("ARCPTG314....");
		Persona paperino = new Persona("Paperino", "Paolino", "CFPAPERINO");
		Persona archimede = new Persona("Archimede", "Pitagorico", "CFARCHI");
		System.out.println(paperino.getNome());
		System.out.println(archimede.getCodiceFiscale());
	}

}
