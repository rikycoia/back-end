package it.epicode.multimedia.player;

//creazione classe per i file audio
//e implementa l'interfaccia

public class Audio extends Multimedia implements RiproduciElemento {

	private int durata;
	private int volume;

	public Audio(String title, int durata, int volume) {
		super(title);
		this.durata = durata;
		this.volume = volume;

	}

	// getter e setter

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	// metodo per alzare il volume

	public void alzaVolume(int volume) {

		this.volume = volume++;

	}

	// metodo per abbassare il volume

	public void abbassaVolume(int volume) {

		this.volume = volume--;

	}

	// Una registrazione Audio è riproducibile e ha associato anche un volume (un
	// valore positivo di tipo int) e i metodi
	// abbassaVolume() e alzaVolume() per regolarlo. Se riprodotta, ripete per (n
	// volte) pari alla (durata) la
	// stampa del titolo concatenato a una sequenza di punti esclamativi di
	// lunghezza pari al volume.

	// metodo Play

	@Override
	public void play() {
		String esclamativo = "";
		String asterisco = "";

		// L'audio è riproducibile se il volume è maggiore di 0
		if (volume > 0) {
			// stampa del titolo + (!)==> per indicare il volume

			// stampa del titolo
			System.out.println(this.title);

			// stampa n volte (!) quanto è alto il volume
			for (int i = 0; i < volume; i++) {
				esclamativo += "!";
			}
		}

	}

}
