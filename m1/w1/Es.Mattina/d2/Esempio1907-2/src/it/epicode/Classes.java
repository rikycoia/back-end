package it.epicode;

public class Classes {

	static class My {
		int value;

		My(int v) {
			value = v;
		}
	}

	public static void main(String[] args) {
		My m1 = new My(10);
		My m2 = new My(10);
		if (m1 == m2) 
			System.out.println("m1 ed m2 sono uguali");
		else
			System.out.println("m1 ed m2 sono diversi");
		
		m2 = m1; // m1 e m2 sono ALIAS uno dell'altro
		m2.value = 10;
		System.out.println("m1.value = " + m1.value);
		if (m1 == m2) 
			System.out.println("m1 ed m2 sono uguali");
		else
			System.out.println("m1 ed m2 sono diversi");
	}

}
