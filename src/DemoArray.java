
import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		int marks[] = {87, 65, 98, 70, 65, 12}; 
		
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("printing all of the marks using enhanced for loop: "); 
		for(int i:marks) {
			System.out.println(i);
		}
		//use case: accept five numbers from the user and print the sum 
		
		int num[] = new int [5];
		Scanner scan = new Scanner(System.in);
		int sum = 0; 
		System.out.println("please enter five numbers : "); 
		for(int i = 0; i<num.length;i++) {
			num[i] = scan.nextInt();
			sum += num[i];
		}
		System.out.println("the sum of all the numbers entered are : " +sum);
	}

}
