package it.epicode;

import java.util.Objects;

public class Cliente {
	private String nome;
	private String cognome;
	private String codiveUnivoco;
	private String regione;

	public Cliente(String nome, String cognome, String codiveUnivoco, String regione) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiveUnivoco = codiveUnivoco;
		this.regione = regione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiveUnivoco() {
		return codiveUnivoco;
	}

	public void setCodiveUnivoco(String codiveUnivoco) {
		this.codiveUnivoco = codiveUnivoco;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	@Override
	public boolean equals(Object obj) {
		// due oggetti sono uguali quando il codice cliente è il medesimo
		if (obj instanceof Cliente) {
			Cliente c = (Cliente) obj;
			//per confrontare stringhe usare equals
			if (c.codiveUnivoco.equals(this.codiveUnivoco)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
				return Objects.hash(codiveUnivoco);
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", codiveUnivoco=" + codiveUnivoco + ", regione="
				+ regione + "]";
	}

}