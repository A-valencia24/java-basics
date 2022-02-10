package inheritance;
class Customer {
	
		@Override 
		protected void finalize() throws Throwable {
			System.out.println("FINALIZE CALLED");
		}
}
public class DemoFinalize {
	public static void main(String[] args) {
		Customer C1 = new Customer();
		Customer C2 = new Customer();
		Customer C3 = C2;
		C1 = null; 
		Customer C4 = new Customer();
		C4 = null; 
		C2 = null; 
		C3 = null;
		System.gc();
		
	}

}
