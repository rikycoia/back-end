package it.epicode.fiscalcode.data;

public class Date {
	// su questi campi esistono dei vincoli di validità!!!
	private int year;
	private int month;
	private int day;

	public void before(int days) {
		// i giorni dei mesi sono: 31,28/29,31,30,31,30,31,31,30,31,30,31
		int[] md = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// e se l'anno è bisestile?
		if (isLeapYear(year))
			md[1] = 29; // febbraio ha 29 giorni

		// fino a che non ho raggiunto i giorni richiesti
		while (days > 0) {
			days--;
			// decremento il valore del giorno
			day--;
			// se sono arrivato al primo del mese
			if (day < 1) {
				// decremento il mese
				month--;
				// se il mese è oltre il 12
				if (month < 1) {
					// metto a 12 il mese
					month = 12;
					// e decremento l'anno
					year--;
					// controllando che non sia bisestile
					if (isLeapYear(year))
						md[1] = 29; // febbraio ha 29 giorni
				}
				// metto il giorno al primo del mese precedente
				day = 1;
			}
		}
	}

	// a partire dalla data corrente
	// sposta la data di un determinato intervallo di giorni
	public void after(int days) {
		// i giorni dei mesi sono: 31,28/29,31,30,31,30,31,31,30,31,30,31
		int[] md = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// e se l'anno è bisestile?
		if (isLeapYear(year))
			md[1] = 29; // febbraio ha 29 giorni

		// fino a che non ho raggiunto i giorni richiesti
		for (int counter = 0; counter < days; ++counter) {
//		for (; days > 0; days--) {
			// aumento il valore del giorno
			day++;
			// se ho superato il numero di giorni del mese
			if (day > md[month - 1]) {
				// metto a 1 il giorno
				day = 1;
				// e aumento il mese
				month++;
				// se il mese è oltre il 12
				if (month > 12) {
					// metto a 1 il mese
					month = 1;
					// e aumento l'anno
					year++;
					// controllando che non sia bisestile
					if (isLeapYear(year))
						md[1] = 29; // febbraio ha 29 giorni
				}
			}
		}
	}

	// restituisce true se l'anno è bisestile
	private boolean isLeapYear(int year) {
		boolean result = false;
		// un anno è bisestile se è divisibile per 400
		if (year % 400 == 0)
			result = true;
		// oppure se è divisibile per 4 ma non per 100
		else if (year % 4 == 0 && year % 100 != 0)
			result = true;
//		else // altrimenti non è bisestile
//			return false;
		return result;
	}

	// restituisce true se la tripletta (anno, mese, giorno)
	// è in grado di rappresentare una data valida
	private boolean canBeValidDate(int year, int month, int day) {
		// il risultato dell'elaborazione
		boolean result = true;

		// devo controllare:
		// 1: il mese deve essere tra 1 e 12
		if (month < 1 || month > 12) // se il mese non è tra 1 e 12
			result = false; // la variabile result è false!
		else // se invece è tra 1 e 12
		// 2: il giorno deve essere tra 1 e il max dei gg del mese
		{
			// i giorni dei mesi sono: 31,28/29,31,30,31,30,31,31,30,31,30,31
			int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			// e se l'anno è bisestile?
			if (isLeapYear(year))
				days[1] = 29; // febbraio ha 29 giorni

			if (day < 1 || day > days[month - 1])
				result = false;
		}
		// offro il risultato del controllo
		return result;
	}

	// costruttore
	public Date(int year, int month, int day) {
		if (canBeValidDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		} else {
			this.year = 1900;
			this.day = 1;
			this.month = 1;
		}
	}

	// accesso in lettura agli attributi della classe
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	// accesso in scrittura agli attributi della classe
	// i dati anno mese e giorno dipendono gli uni dagli altri
	// quindi è preferibile non avere setters!!!
//	public void setYear(int year) {
//		this.year = year;
//	}
//
//	public void setMonth(int month) {
//		this.month = month;
//	}
//
//	public void setDay(int day) {
//		this.day = day;
//	}
	// al più ne mettiamo uno solo che cambia contemporaneamente tutti gli attributi
	public void setDate(int year, int month, int day) {
		if (canBeValidDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
	}
}
