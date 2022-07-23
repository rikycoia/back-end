package it.epicode;

public class Studente {
	String nome;
	String cognome;
	String matricola;
	int[] voti = new int[5];

	// esistono studenti senza nome, cognome e matricola? NO
	public Studente(String nome, String cognome, String matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}

	// è possibile ottenere il nome di uno studente?
	// SI, allora ci vuole un getter:
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getMatricola() {
		return matricola;
	}

	// è possibile cambiare il nome, il cognome o la matricola?
	// NO! allora non servono i setters!!!!

	// con i voti cosa ci faccio?
	// 1. li registro man mano che li ottengo

	// variabile di appoggio interna alla classe
	private int votiOttenutiFinora = 0;

	public void registraVoto(int nuovoVoto) {
		if (votiOttenutiFinora < 5)
			voti[votiOttenutiFinora++] = nuovoVoto;
	}

	// 2. ne faccio la media
	public double getMedia() {
		double somma = 0;
		for (int i = 0; i < votiOttenutiFinora; ++i)
			somma += voti[i];
		return somma / votiOttenutiFinora;
	}
}
