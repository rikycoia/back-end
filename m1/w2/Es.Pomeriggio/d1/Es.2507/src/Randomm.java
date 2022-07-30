import java.util.Random;
import java.util.Scanner;

public class Randomm {
	public static void main(String[] args) {

		// creiamo un array di numeri interi con un metodo
		int[] array = creaArray();

		// creiamo un metodo che stampa gli array in console
		stampaArray(array); // prende in considerazione l'array che verrà creato dal metodo creaArray()

		// creiamo un metodo che legge la lunghezza dell'array
		leggiPosizione(array);// prende in considerazione l'array che verrà creato dal metodo creaArray()
	}

	// Creiamo la lettura dell'input dell'utente con Scanner per poi leggere la
	// posizione del numero random
	private static void leggiPosizione(int[] array) {
		Scanner scanner = new Scanner(System.in);
	//dichiarare gli attributi per gli elementi dell'array che serviranno per la verifica
		int i;
		int numero;
		int posizione;
		boolean continua = true;
	//utilizziamo do-while per verificare le condizioni in base all'input dell'utente	
		do {
			//nextInt da un valore (inserito dall'utente) a numero
			System.out.println("Inserire un numero seguito dal tasto Invio. Inserire 0 per uscire");
			numero = scanner.nextInt();
			if (numero != 0) {
				//nextInt da un valore (inserito dall'utente) a posizione
				System.out.println("Inserire la posizione in cui inserire il numero seguita dal tasto Invio");
				posizione = scanner.nextInt();
				try {
					//si assegna la posizione di un alemento dentro all'array
					array[posizione] = numero;
					stampaArray(array);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Posizione fuori dal limite dell'array: " + posizione);
				}
			} else {
				continua = false;
			}
		} while (continua);

	}

	private static void stampaArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Valore posizione " + i + ": " + array[i]);
		}

	}


	private static int[] creaArray() {
		int[] array = new int[5];
		// Istanzia un oggetto random che pemrette di ottenere numeri casuali
		Random randomGenerator = new Random();
		for (int i = 0; i < array.length; i++) {
			// Inserisce in posizione i-esima un valore casuale compreso tra 0 e 10
			array[i] = randomGenerator.nextInt(11);
		}
		return array;
	}
}

	
	

	
