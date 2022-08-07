package it.epicode;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.common.util.impl.Log;
import org.hibernate.annotations.common.util.impl.LoggerFactory;

import ch.qos.logback.classic.Logger;
import it.epicode.dao.CatalogoDAO;
import it.epicode.dao.PrestitoDAO;
import it.epicode.entities.library.Elemento;
import it.epicode.entities.library.Libro;
import it.epicode.entities.prestito.Prestito;
import it.epicode.entities.prestito.Utente;

public class Program {
	public static void main(String[] args) {

		final Logger Log = LoggerFactory.getLogger(Program.class);

		Elemento elemento1 = new Libro("9876543210482", "il Libro dei libri", "2022", 126, "Autore1", "Genere1");
		var Service = new CatalogoDAO();
		var Service2 = new PrestitoDAO();

		Service.addElement(elemento1);
		Service.removeElementByIsbn(elemento1.getCodiceISBN());
		Service.addElement(elemento1);
		Elemento el = Service.searchByIsbn(elemento1.getCodiceISBN());

		// RICERCA PER ANNO
		List<Elemento> lista = Service.searchByYear("2022");
		for (Elemento e : lista) {
			Log.info(e);
		}

		// RICERCA PER AUTORE
		List<Libro> lista2 = Service.searchByAuthor("Autore1");
		for (Libro e : lista2) {
			Log.info(e);
		}
		// RICERCA PER TITOLO
		List<Elemento> lista3 = Service.searchByTitle("dei");
		for (Elemento e : lista3) {
			Log.info(e);
		}

		Utente utente = new Utente("nome", "cognome", LocalDate.of(2022, 8, 5), 3266732);
		Service2.addUser(utente);
		Prestito prestito = new Prestito(utente, elemento1, LocalDate.now());
		Prestito prestito2 = new Prestito(utente, elemento1, LocalDate.of(1998, 5, 21));
		Prestito prestito3 = new Prestito(utente, elemento1, LocalDate.of(2011, 5, 21), LocalDate.of(2011, 5, 25));

		Service2.addLoan(prestito);
		Service2.addLoan(prestito2);
		Service2.addLoan(prestito3);

		// RICERCA PRESTITO
		List<Prestito> listaP = Service2.searchLoan(utente.getNumeroDiTessera());
		for (Prestito p : listaP) {
			Log.info(p);
		}

		// RICERCA PRESTITO SCADUTO
		List<Prestito> listaP2 = Service2.searchOverdueLoan();
		for (Prestito p : listaP2) {
			Log.info(p);
		}
	}
}
