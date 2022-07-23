package it.epicode.fiscalcode;

import it.epicode.fiscalcode.data.Date;
import it.epicode.fiscalcode.data.Person;

public class Program {

	public static void print(Date d) {
		System.out.println(d.getDay() + "/" + d.getMonth() + "/" + d.getYear());
	}

	public static void print(Person p) {
		System.out.println(p.getFirstName() + " " + p.getLastName());
		System.out.println(" sesso: " + p.getGender());
		System.out.println(" nato a: " + p.getBirthCity());
		System.out.print(" il: ");
		print(p.getBirthday());
	}

	public static void main(String[] args) {
		Date d = new Date(2022, 2, 29);
		print(d);
		Date d1 = new Date(2022, 7, 20);
		print(d1);
		Date d2 = new Date(2020, 2, 29);
		print(d2);
		// supponiamo di voler conoscere la data tra 548 giorni
		d1.after(548);
		print(d1);
		d1.setDate(2022, 07, 20);
		d1.before(7);
		print(d1);

		Person paperino = new Person("Paperino", "Paolino", //
				'm', new Date(1970, 1, 1), "Paperopoli");
		print(paperino);
	}

}
