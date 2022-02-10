import java.util.Date;
import java.util.Scanner;

public class Demo1 {

	public void printWelcomeMessage() {
	System.out.println("Hi, welcome to revature training");
	
	}
	// var args 
	public int addNumbers(int...num) {
		//enhanced for loop 
		int sum = 0;
		for(int i: num) {
			System.out.println(i);
			sum = sum+i;
		}
		return sum;
	}
		public void printProductNames(String...productName) {
			for(String p:productName) {
				System.out.println(p);
			}
		}
	
	//method with parameters
	public int addNumbers(int number1, int number2) {
	System.out.println(number1 + number2);
	return number1+number2;
	
	}
	
	public static void main(String[] args) {
		System.out.println("Hello and welcome to day 2 of training");
		Demo1 d = new Demo1();
		d.printWelcomeMessage();
		
		int result = d.addNumbers(24, 22);
		result += d.addNumbers(99, 1);
		result += d.addNumbers(81, 22);
		System.out.println(result);
		d.printProductNames("watch" , "pendrive" , "adaptor");
		System.out.println("==============");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter your age");
		int age = scan.nextInt();
		
		System.out.println("you are " + age + " years old");
		Date date = new Date(); 
		System.out.println(date);
		
		  
	}
	

}
