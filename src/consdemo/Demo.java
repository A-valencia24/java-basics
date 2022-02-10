package consdemo;

public class Demo {
	
	int num1 = 10; 
	static int num2 = 20; 
	int num3 = 30; 
	
	public Demo() {
		num1++; 
		num2--;
		num3++; 
		
	}
	public static void main (String[] args) {
		Demo demo1= new Demo(); 
		Demo demo2 = new Demo(); 
		
		System.out.println(demo1);
		System.out.println(demo2);
	}
}
