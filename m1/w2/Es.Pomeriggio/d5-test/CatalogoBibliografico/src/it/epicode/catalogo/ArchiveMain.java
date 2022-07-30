package it.epicode.catalogo;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ArchiveMain {

	public static void main(String[] args) throws IOException {

		Map<String, Catalog> mainCatalog = new Service().popolaLista();

		Search s = new SearchClass(mainCatalog);
		WriteRead wR = new WriteReadClass(mainCatalog);
//stampiamo tutto il catalogo
		System.out.println("CATALOGO INIZIALE COMPLETO:");
		mainCatalog.forEach((x, y) -> System.out.println(y));
		System.out.println("----------------------------");
		System.out.println("");

//prima ricerca: ricerca per autore--->(prendiamo come esempio Tolkien)
		System.out.println("RICERCA PER AUTORE (Tolkien):");
		Map<String, Catalog> filteredCatalog1 = s.searchForAuthor("Autore 1");

		filteredCatalog1.forEach((x, y) -> System.out.println(x + " " + y));
		System.out.println("---------------");

//seconda ricerca: ricerca per anno--->(prendiamo come esempio (2020)
		System.out.println("RICERCA PER ANNO (2020):");
		Map<String, Catalog> filteredCatalog2 = s.searchForYear("2020");

		filteredCatalog2.forEach((x, y) -> System.out.println(x + " " + y));
		System.out.println("---------------");

//terza ricerca: ricerca per isbn-->(prendiamo come esempio (9321)
		System.out.println("RICERCA PER ISBN (9321):");
		Map<String, Catalog> filteredCatalog3 = s.searchForIsbn("9321");

		filteredCatalog3.forEach((x, y) -> System.out.println(x + " " + y));
		System.out.println("---------------");

//scrittura file di testo		
		wR.write();
		System.out.println("----------------------------");

//lettura file di testo		
		List<String> txt = wR.read();
		txt.forEach(System.out::println);

		System.out.println("");

		System.out.println("Lettura del file di testo generato:");

	}
}
