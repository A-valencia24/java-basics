package inheritance;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer data = new StringBuffer("mohammad"); //24
		
	System.out.println("Length: " + data.length());  //8 
	System.out.println("Capacity :" + data.capacity()); //24
	
	data.append("poiuytrewqasdfgh");
	System.out.println("Length: " + data.length());  //24 
	System.out.println("Capacity :" + data.capacity()); //24
	data.append("qw");
	System.out.println("Length:" + data.length()); //26
	System.out.println("capacity :" + data.capacity()); //50 
	
	}

}
