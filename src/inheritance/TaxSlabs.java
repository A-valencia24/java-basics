package inheritance;

import java.util.Scanner;

public class TaxSlabs {

	public static void main(String[] args) {
		double tax = 0;
		String gender = null;
		Scanner gen = new Scanner(System.in);
		System.out.println("Enter gender");
		gender = gen.next();
		System.out.println("enter salary");
		double salary = gen.nextDouble();
		if (gender.equalsIgnoreCase("male")) { 

		if ((salary >= 0) && (salary <= 18000)) {
			tax = 0;
		} else if ((salary >= 18001) && (salary <= 50000)) {
			tax = salary * 0.10;
		} else if ((salary >= 50001) && (salary <= 80000)) {
			tax = salary * 0.20;
		} else if (salary > 80000)
			tax = salary * 0.3;
		}
		else if (gender.equalsIgnoreCase("female")) {
			if ((salary >= 0) && (salary <= 19000)) {
				tax = 0;
			} else if ((salary >= 18001) && (salary <= 50000)) {
				tax = salary * 0.10;
			} else if ((salary >= 50001) && (salary <= 80000)) {
				tax = salary * 0.20;
			} else if (salary > 80000)
				tax = salary * 0.3;
			
		}
		System.out.println("you owe " + tax + "in taxes");
		
		
	}

}
