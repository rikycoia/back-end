package it.epicode;

public class Program {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.execute('+', 10);
		c.execute('-', 20);
		c.execute('*', 30);
		c.execute('/', 40);
System.out.println(c.getAccumulator());
	}

}
