package it.me;

import java.util.Random;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;



public class index {

	static final Logger log = LoggerFactory.getLogger(index.class);

	static final Random rnd = new Random();

	static int random(int n) {
		return rnd.nextInt(n) + 1;
	}

	static void riassegna(int n, int x) throws Exception {
		if (n == 0) {
			throw new Exception("esecuzione terminata");
		}

		try {
			arr[n - 1] = x;
			log.debug("hai inserito alla posizione" + (n) + " il numero " + x);

		}

		catch (Exception e) {

			log.error("seleziona numeri da 1 a 5");
			
		}

	
	}

	static int[] arr = { random(10), random(10), random(10), random(10), random(10) };

	public static void main(String[] args) throws Exception {
		System.out.println();
		

		try {
			riassegna(1,1);riassegna(10,1);riassegna(0,1);riassegna(10,1);
		} catch (Exception e) {

			log.info(e.getMessage());
		}

		
	}

}
