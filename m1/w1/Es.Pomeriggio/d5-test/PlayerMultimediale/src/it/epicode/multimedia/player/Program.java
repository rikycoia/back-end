package it.epicode.multimedia.player;

import java.util.Scanner;

public class Program {

	/*
	 * il codice di un lettore multimediale che memorizza 5 elementi (creati con
	 * valori letti da tastiera) in un array e poi chiede ripetutamente all'utente
	 * quale oggetto eseguire (leggendo un intero da 1 a 5 oppure 0 per finire).
	 */

	private static final int Immagine = 0;
	private static final int Video = 0;
	public static Scanner scanner = new Scanner(System.in);

	public static int readInt() {
		return Integer.parseInt(scanner.nextLine());
	}

	public static String readString() {
		return scanner.nextLine();
	}

	static void gestisciElement(Multimedia m) {
		// visualizzi il video, l'immagine o l'audio

		// se è immagine utilizzza il metodo show()
		if (m instanceof VisualizzaElemento) {
			((VisualizzaElemento) m).show();

			// se è video o audio utilizza il metodo play()
		} else if (m instanceof RiproduciElemento) {
			((RiproduciElemento) m).play();
		}

	}

	public static void main(String[] args) {

		// Creazione di un array Multimedia di 5 elementi di classe diversa (Audio,
		// Video, Immaigine)
		Multimedia[] media = new Multimedia[] { new Video("video1", 0, 10, 0), new Audio("audio1", 10, 0),
				new Immagine("img1", 0), new Video("video2", 0, 20, 0), new Audio("audio2", 20, 0) };

		System.out.println("Cosa vuoi creare=");
		int scelta = readInt();
		switch (scelta) {
		case 1: // crea immagine
			  System.out.println("Hai selezionato il file immagine");
			  break;
		case 2: // crea audio
		case 3: // crea video
		}

		// chiedi cosa vuole visualizzare
		gestisciElement(media[1]);

	}

}