package harford;

public class Employee {
	
	private String name;
	private double salary;
	
	
	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public double calculateBonus() {
		return salary * 0.1;
	}
	
	public void displayEmployeeInfo() {
		System.out.println("직원 이름 : " + name);
		System.out.println("기본 급여 : " + salary + "원");
		System.out.println("보너스 : " + calculateBonus() + "원");
	}
	
}
