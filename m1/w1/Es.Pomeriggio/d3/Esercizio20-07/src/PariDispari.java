
public class PariDispari {

	public static void main(String[] args) {
		
		int numero = 10; 
		
		System.out.println("Questo numero " + "è un numero pari? " + isThisPari(numero));
	}
	
	public static boolean isThisPari(int numero) {
		if((numero % 2 == 0)) {
			return true;
		}else {
			return false;
		}
			
 }
}
