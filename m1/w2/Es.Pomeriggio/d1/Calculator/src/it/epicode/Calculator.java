package it.epicode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
	private double accumulator;
	//
	static final Logger log = LoggerFactory.getLogger(Calculator.class);

	public double getAccumulator() {
		return accumulator;
	}

	public void setAccumulator(double accumulator) {
		this.accumulator = accumulator;
	}

	public void execute(char operator, double operand) {
		log.debug("sto eseguendo l'operazione " + operator + "con " + operand
				+ "Attualmente l'accumulatore vale " + accumulator);
		switch (operator) {
		case '+':
			accumulator += operand;
			log.debug("Ho appena eseguito l'addizione...");
			break;
		case '-':
			accumulator -= operand;
			log.debug("Ho appena eseguito la sottrazione...");
			break;
		case '*':
			accumulator *= operand;
			log.debug("Ho appena eseguito la moltiplicazione...");
			break;
		case '/':
			accumulator /= operand;
			log.debug("Ho appena eseguito la divisione...");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
		System.out.println("Dopo l'operazione l'accumulatore vale " + accumulator);
	}

}
