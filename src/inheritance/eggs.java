package inheritance;
import java.util.*;
public class eggs {

	public static void main(String[] args) {
		
		int dozens=0; 
		int extras=0; 
		int gross=0;
		int egross=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of eggs you have");
		int egg =  scan.nextInt();
		
		gross = egg /144; 
		egross = egg%144;
		dozens = egross/12; 
		extras = egross%12;
		System.out.println("your number of eggs is " +gross+ ": gross, "   + dozens+ ": dozens, " + extras + " extra eggs ");
		
		

	}

}
