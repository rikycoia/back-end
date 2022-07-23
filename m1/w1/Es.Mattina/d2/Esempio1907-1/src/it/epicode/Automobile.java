package it.epicode;

public class Automobile {
	// incapsulamento

	// TUTTI GLI ATTRIBUTI SONO INACCESSIBILI
	private String marca;
	private String modello;
	private String targa;
	private int cilindrata;
	
	// costruttore
	public Automobile(String targa) {
		System.out.println("Sto immatricolando l'auto");
		this.targa = targa;
	}

	// GETTERS e SETTERS: Metodi di accesso
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int c) {
		if (c > 0)
			cilindrata = c;
		else
			System.out.println("Stai scherzando, vero?!");
	}
}
