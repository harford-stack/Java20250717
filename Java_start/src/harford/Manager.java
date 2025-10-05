package harford;

public class Manager extends Employee{

	private String department;
	
	
	Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}


	public String getDepartment() {
		return department;
	}
	
	@Override
	public double calculateBonus() {
		return getSalary() * 0.2;
	}
	
	@Override
	public void displayEmployeeInfo() {
		super.displayEmployeeInfo();
		System.out.println("부서 : " + department);
	}
	
}
