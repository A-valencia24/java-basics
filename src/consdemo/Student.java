package consdemo;

public class Student {

	int studentId;
	String studentName; 
	int marks; 
	int grade; 
	
	public Student() { 
		studentId = 1; 
		studentName = "name"; 
		marks = -1;
		grade = -1; 
		System.out.println("Student constructor called "); 
	}

		//parameterized constructor 
	public Student(int studentId, String studentName, int marks, int grade) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.grade = grade;
	}
	
	public Student(int studentId, String studentName) {
		this(); 
		this.studentId = studentId;
		this.studentName = studentName; 
		
	}
	
	public void printStudentDetails () {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Marks : " + marks);
		System.out.println("Grade : " + grade);
	}
	
	public static void main (String[] args) { 
		 Student student1 = new Student(); 
		  System.out.println("---------- Printing the details about student");
		  student1.printStudentDetails();
		  
		  Student student2 = new Student(2, "jim", 4, 76); 
		  student2.printStudentDetails();
		
	}
	 
	
}
