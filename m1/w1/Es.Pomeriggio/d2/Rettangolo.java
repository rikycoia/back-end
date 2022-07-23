
public class Rettangolo {
	private int larghezza;
	private int altezza;

	public Rettangolo(int larghezza, int altezza) {
		this.larghezza = larghezza;
		this.altezza = altezza;
	}
	
	public int Perimetro() {
		return (larghezza * 2) + (altezza * 2);
				
	}
	
	public int Area() {
		return larghezza * altezza;
		
	}
	
	public int areaPerimetro() {
		return Perimetro() + Area();
	}
	
	public void printPerimetro() {
		System.out.println("il perimetro del rettangolo è " + Perimetro());
	}
	
	
	public void printArea() {
		System.out.println("l'area del rettangolo è " + Area());
	}
	public void printAreaPerimetro() {
		System.out.println(areaPerimetro());
	}
}
