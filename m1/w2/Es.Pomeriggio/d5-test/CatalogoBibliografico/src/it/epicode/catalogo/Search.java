package it.epicode.catalogo;

import java.util.List;
import java.util.Map;


public interface Search {
	//scriviamo i metodi per la ricrca filtrando in base ad (author), (year), e (isbn)
	public Map<String, Catalog> searchForAuthor(String author);

	public Map<String, Catalog> searchForYear(String year);

	public Map<String, Catalog> searchForIsbn(String isbn);
}
