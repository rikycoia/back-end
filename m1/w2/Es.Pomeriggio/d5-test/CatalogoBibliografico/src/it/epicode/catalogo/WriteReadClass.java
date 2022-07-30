package it.epicode.catalogo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class WriteReadClass implements WriteRead {
	// cerazione della lista
	public Map<String, Catalog> mainCatalog;

	// costruttore
	public WriteReadClass(Map<String, Catalog> mainCatalog) {

		this.mainCatalog = mainCatalog;
	}

	// metodo di scrittura
	@Override
	public void write() throws IOException {
		// creazione stringa vuota
		String catalogToText = "";
		// con il ciclo for per ogni valore all'interno del main catalog andremo a
		// generare una stringa
		for (Catalog cat : mainCatalog.values()) {
			catalogToText += (cat.toString() + ";");
		}
		// creazione del file di testo dove andremo a salvare le stringhe
		File catalogFile = new File("./catalog.txt");

		FileUtils.writeStringToFile(catalogFile, catalogToText, "UTF-8");

	}

	// metodo di lettura
	@Override
	public List<String> read() throws IOException {
		// creazione nuova lista
		List<String> listaRead = new ArrayList();
		// richiamiamo il file precedentemente creato
		File file = new File("./catalog.txt");
		// lettura file
		String readString = FileUtils.readFileToString(file, "UTF-8");
		String[] catalog = readString.split(";");

		for (String element : catalog) {
			listaRead.add(element);
		}
		return listaRead;
	}

}
