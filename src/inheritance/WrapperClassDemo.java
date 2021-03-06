package inheritance;


public class WrapperClassDemo {
	
	public static void main (String[] args) {
		int sum= Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println(sum);
		long salary1 = 91716;
		long salary2 = 91716;
		
		//boxing the process of converting a primitive to its wrapper class
		int marks = 100; 
		Integer newMarks = new Integer(marks);			//boxing 
		Integer newMarks2= marks;   					//auto boxing 
		
		Double budget = 19272.87;
		double budget1 = Double.valueOf(budget);  // unboxing < jdk 1.5
		double budget2 = budget;  	//auto unboxing 
	}

}
