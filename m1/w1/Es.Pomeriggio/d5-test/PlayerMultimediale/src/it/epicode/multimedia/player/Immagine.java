package it.epicode.multimedia.player;

//creazione classe per le immagini
// e implementa l'interfaccia

public class Immagine extends Multimedia implements VisualizzaElemento {

	private int luminosità;

	public Immagine(String title, int luminosità) {
		super(title);
		this.luminosità = luminosità;

	}

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}

	// metodo per alzare la luminosità

	public void alzaLuminosità(int luminosità) {
		this.luminosità = luminosità++;
	}

	// metodo per abbassare la luminosità

	public void abbassaLuminosità(int luminosità) {
		this.luminosità = luminosità--;
	}

	// Una Immagine non è riproducibile, ma ha una luminosità regolabile analoga a
	// quella dei filmati e un metodo show()
	// che stampa il titolo concatenato a una sequenza di asterischi di lunghezza
	// pari alla luminosità.

	@Override
	public void show() {
		String asterisco = "";

		// stampa del titolo
		System.out.println(this.title);

		// stampa n volte (*) quantp la luminosità
		for (int i = 0; i < luminosità; i++) {
			asterisco += "*";
		}

	}

}
