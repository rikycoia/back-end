package it.epicode.calcolatrice;

public class Calcolatrice {
	
	private double accumulatore;
	
	public Calcolatrice() {
		System.out.println("Costruttore di default");
		this.accumulatore = 0;
	}
	
	public double getAccumulatore() {
		return accumulatore;
	}

	public void setAccumulatore(double accumulatore) {
		this.accumulatore = accumulatore;
	}

	public void addizione(double val) {
		accumulatore += val;		
	}
	
	public void sottrazione(double val) {
		accumulatore -= val;		
	}
	
	public void moltiplicazione(double val) {
		accumulatore *= val;		
	}
	
	public void divisione(double val) {
		accumulatore /= val;		
	}
}