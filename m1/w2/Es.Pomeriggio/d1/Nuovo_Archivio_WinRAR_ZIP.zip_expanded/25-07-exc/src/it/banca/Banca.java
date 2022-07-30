package it.banca;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Banca {
	private static final Logger logger = LoggerFactory.getLogger(Banca.class);

	public static void main(String args[]) {
		ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 35000.0);

		System.out.println("Saldo conto: " + conto1.restituisciSaldo());

		try {
			conto1.preleva(1750.5);

			System.out.println("Saldo conto: " + conto1.restituisciSaldo());
		} catch (BancaException e) {
			logger.error("Errore durante il prelievo" + e,e );
			e.printStackTrace();
		}

		ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

		conto2.stampaSaldo();

		try {
			conto2.preleva(5000);

			conto2.stampaSaldo();

		} catch (BancaException e) {
			logger.error("Errore durante il prelievo" + e );
			//e.printStackTrace();
		}
	}
}
