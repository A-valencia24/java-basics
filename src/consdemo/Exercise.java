package consdemo;

public class Exercise {
	public static void main(String[] args) {

		String a = "The quick brown fox jumps over the lazy dog";

		System.out.println(a.charAt(12)); // 1
		System.out.println(a.contains("is")); // 2
		String b = " and killed it "; // string to concat with original string
		String a2 = a.concat(b); // 3
		System.out.println(a2); // 3
		System.out.println(a.contains("dogs")); // 4
		System.out.println(a.equals("The quick brown Fox jumps over the lazy Dog")); // 5
		System.out.println(a.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG")); // 6
		System.out.println(a.length()); // 7
		System.out.println(a.matches("The quick brown Fox jumps over the lazy Dog")); // 8
		a = a.replace("The", "A"); // 9
		System.out.println(a); // 9 print
		
		
		System.out.println(a.toLowerCase());// 12
		System.out.println(a.toUpperCase());// 13
		System.out.println(a.indexOf('a')); // 15
		System.out.println(a.indexOf('e')); // 14
	}
}
