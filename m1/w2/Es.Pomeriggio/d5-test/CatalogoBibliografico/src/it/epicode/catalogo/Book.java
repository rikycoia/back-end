package it.epicode.catalogo;

//creazione della classe book (con estensione della classe astratta catalog per gli attributi in comune)
public class Book extends Catalog {
//parametri
	private String author;
	private String genre;

//costruttore
	public Book(String iSBNcode, String title, String publicationYear, int numOfPage, String author, String genre) {
		super(iSBNcode, title, publicationYear, numOfPage);
		this.author = author;
		this.genre = genre;
	}

//getter e setter
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

//metodo toString
	@Override
	public String toString() {
		return "Libro [ codice ISBN: " + ISBNcode + ", titolo: " + title + ", Anno di pubblicazione: " + PublicationYear
				+ ", N° di pagine: " + numOfPage + ", autore: " + author + ", genere: " + genre + " ]";
	}

}
