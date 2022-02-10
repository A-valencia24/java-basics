
public class Monitor {

	int num = 900; 
	{
		System.out.println("3. INITIALIZER CALLED");
	}
	static {
		System.out.println("1. STATIC INITIALIZER CALLED");
	}
	public Monitor() {
		System.out.println("4. MONITOR CONSTRUCTOR CALLED");
	}
	public void display() {
		System.out.println("5. DISPLAY MONITOR CALLED AND VALUE OF NUM IS " + num);
	}
	
	public static void main(String[] args) { 
		System.out.println("2.MAIN CALLED");
		Monitor m = new Monitor();
		m.display(); 
		Monitor m2 = new Monitor();
	}
}
