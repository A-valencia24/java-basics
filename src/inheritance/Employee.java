package inheritance;

public class Employee { 
	int employeeId; 
	String employeeName;
	int salary =9000;
	public Employee() {
		System.out.println("Employee defualt cons");
	}
	public Employee(int employeeId, String employeeName) {
		System.out.println("employee parametrized"); 
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

}
