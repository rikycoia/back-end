package it.epicode.dipendenti;

public class Dipendenti {

	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;

	private Livello livello;
	private Dipartimento dipartimento;

	static double stipendioBase = 1200;

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public Livello getLivello() {
		return livello;
	}

	public void setLivello(Livello livello) {
		this.livello = livello;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public Dipendenti(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello,
			Dipartimento dipartimento) {

		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
	}

	public Dipendenti(String matricola, Dipartimento dipartimento) {

		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = 30;
		livello = Livello.OPERAIO;
	}

// stampaDatiDipendente è il metodo che stampa in console i dati dei dipendenti//

	public void stampaDatiDipendente() {
		System.out.println(matricola);
		System.out.println(dipartimento);
	}

// promuovi - aggiorna il livello e lo stipendio del dipendente

	public Livello promuovi() {
		if (this.livello == Livello.OPERAIO) {
			this.livello = Livello.IMPIEGATO;
			this.stipendio = Dipendenti.stipendioBase * 1.2;

		} else if (this.livello == Livello.IMPIEGATO) {
			this.livello = Livello.QUADRO;
			this.stipendio = Dipendenti.stipendioBase * 1.5;

		} else if (this.livello == Livello.QUADRO) {
			this.livello = Livello.DIRIGENTE;
			this.stipendio = Dipendenti.stipendioBase * 2;
		}
		// return livello;
		System.out.println(Dipendenti.stipendioBase);
		return livello;

	}

}