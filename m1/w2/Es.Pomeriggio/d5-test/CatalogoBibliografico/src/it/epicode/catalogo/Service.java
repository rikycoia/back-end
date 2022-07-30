package it.epicode.catalogo;

import java.util.HashMap;
import java.util.Map;

//creazione di un service che servirà da archivio per i vari elementi che poi andremo a manipolare
//con le ricerche 
public class Service {

	public Map<String, Catalog> mainCatalog = new HashMap<>();
//generazione elementi del catalogo
	Catalog book1 = new Book("1234", "Lo hobbit", "2004", 963, "Autore 1", "Fantasy");
	Catalog book2 = new Book("1534", "L'isola misteriosa", "1874", 763, "Jules Verne", "Adventure");
	Catalog book3 = new Book("4294", "Il cacciatore di aquiloni", "2020", 523, "Hosseini", "Dramatic");
	Catalog book4 = new Book("3234", "L'isola dei pirati", "2009", 876, " Michael Crichton", "Adventure");
	Catalog book5 = new Book("7034", "Il signore degli anelli", "1978", 126, "Tolkien", "Fantasy");
	Catalog magazine1 = new Magazine("1321", "Paperinik", "2020", 23, Periodicity.MENSILE);
	Catalog magazine2 = new Magazine("2721", "Topolino", "2019", 43, Periodicity.SETTIMANALE);
	Catalog magazine3 = new Magazine("4381", "Chi", "2012", 51, Periodicity.SEMESTRALE);
	Catalog magazine4 = new Magazine("9321", "Paperinik", "2018", 22, Periodicity.MENSILE);
	Catalog magazine5 = new Magazine("4322", "Topolino", "2022", 63, Periodicity.SETTIMANALE);

	// metodo per aggiungere elementi
	public void addElement(Catalog element) {
		mainCatalog.put(element.getISBNcode(), element);
	}

	public void deleteElement(Catalog element) {
		mainCatalog.remove(element.getISBNcode());
	}

	// costruttore vuoto per accedere al service
	public Service() {
		super();
	}

	// aggiungiamo alementi alla lista
	public Map<String, Catalog> popolaLista() {

		addElement(book1);
		addElement(book2);
		addElement(book3);
		addElement(book4);
		addElement(book5);
		addElement(magazine1);
		addElement(magazine2);
		addElement(magazine3);
		addElement(magazine4);
		addElement(magazine5);

		return mainCatalog;
	};

}
