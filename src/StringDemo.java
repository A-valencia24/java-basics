
public class StringDemo {

	public static void main(String[] args) {
		String name = "Adrian Valencia"; 
		
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(5));
		System.out.println(name.concat("revature"));
		System.out.println(name.compareTo("Adrian Valencia"));
		System.out.println(name.substring(3));
		System.out.println(name.substring(8));
		System.out.println(name.toUpperCase());
		System.out.println(name.endsWith("a"));
		System.out.println(name.endsWith("A"));

	}

}
