package it.epicode.catalogo;

//creazione della classe Magazine (con estensione della classe astratta catalog per gli attributi in comune)
public class Magazine extends Catalog {
//periodicity rappresenta un elenco di valori che può assumere
	Periodicity periodicity;

	// costruttore
	public Magazine(String iSBNcode, String title, String publicationYear, int numOfPage, Periodicity periodicity) {
		super(iSBNcode, title, publicationYear, numOfPage);
		this.periodicity = periodicity;
	}

	// getter e setter
	public Periodicity getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(Periodicity periodicity) {
		this.periodicity = periodicity;
	}

	// metodo toString
	@Override
	public String toString() {
		return "Rivista [ codice ISBN: " + ISBNcode + ", titolo: " + title + ", Anno di pubblicazione: "
				+ PublicationYear + ", N° di pagine: " + numOfPage + ", Periodicità: " + periodicity + " ]";
	}

}
