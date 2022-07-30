package it.epicode.catalogo;

import java.util.Map;
import java.util.stream.Collectors;

public class SearchClass implements Search {
	// creiamo un catalogo vuoto
	public Map<String, Catalog> mainCatalog;

//costruttore
	public SearchClass(Map<String, Catalog> mainCatalog) {

		this.mainCatalog = mainCatalog;
	}
	// scriviamo i metodi di ricerca che sono stati precedentemente scritti
	// nell'interfaccia, qui andremo ad
	// applicare i filtri

	// solo per la ricerca per (author) utilizziamo instanceof per filtrare i libri
	@Override
	public Map<String, Catalog> searchForAuthor(String author) {
		return mainCatalog.values().stream().filter(e -> e instanceof Book && ((Book) e).getAuthor().equals(author))
				.collect(Collectors.toMap(c -> c.getISBNcode(), c -> c));

	}

	// metodo di ricerca per (year)
	@Override
	public Map<String, Catalog> searchForYear(String year) {
		return mainCatalog.values().stream()
				.filter(e -> e instanceof Book && ((Book) e).getPublicationYear().equals(year))
				.collect(Collectors.toMap(c -> c.getISBNcode(), c -> c));
	}

	// metodo di ricerca per (isbn)
	@Override
	public Map<String, Catalog> searchForIsbn(String isbn) {
		return mainCatalog.values().stream().filter(e -> e.getISBNcode().equals(isbn))
				.collect(Collectors.toMap(c -> c.getISBNcode(), c -> c));
	}

}
