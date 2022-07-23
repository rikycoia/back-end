package it.epicode;

public class Persona {
	// come si crea una persona?
	// è indispensabile un nome, un cognome e un cf
	public Persona(String nome, String cognome, String cf) {
		this.nome = nome;
		this.codiceFiscale = cf;
		this.cognome = cognome;
	}

	// tutti gli attributi sono privati...
	private String nome;
	private String cognome;
	private String codiceFiscale;

	// ... salvo poi a fornire l'accesso tramite getter (in lettura) e setter (in
	// scrittura)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		// qui devo controllare che ci siano solo lettere!
		// altrimenti il nome non è valido!!!
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
}
