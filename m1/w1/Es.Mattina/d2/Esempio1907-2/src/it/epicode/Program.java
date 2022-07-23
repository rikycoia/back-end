package it.epicode;

public class Program {

	// firma - signature: (String)
	static void print(String s) {
		System.out.println(s);
	}

	// overloading - sovraccaricamento
	// firma: (String, int)
	static void print(String s, int n) {
		for (int i = 0; i < n; ++i)
			System.out.println(s);
	}
	
	// signature: (int)
	static void print(int i) {
		System.out.println("Sto stampando il numero " + i);
	}

	public static void mainOverloading(String[] args) {
		print("Ciao");
		print("CIAO", 3);
		print(14);
	}

}
