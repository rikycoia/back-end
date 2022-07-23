package it.epicode;

public class Program {

	public static void main(String[] args) {
		Studente pico = new Studente("Pico", "De' Paperis", "1234567");
		pico.registraVoto(7);
		System.out.println(pico.getMedia());
		pico.registraVoto(8);
		System.out.println(pico.getMedia());
		pico.registraVoto(5);
		System.out.println(pico.getMedia());
	}

}
