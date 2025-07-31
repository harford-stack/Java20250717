package quiz;

public class Employee {
	
	int empId;
	String empName;
	String department;
	int salary;
	String position;
	
	public Employee(int empId, String empName) {
		this(empId, empName, "");
//		this.empId = empId;
//		this.empName = empName;
	}
	
	public Employee(int empId, String empName, String department) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}
	
	public void setDetails(int salary, String position) {
		this.salary = salary;
		this.position = position; // 2개의 값을 초기화하는 메소드
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void empInfo() {
		System.out.println(empName + " 사원 의 사번은 " + empId + ", 직급은 " + position + ", 급여는 " + salary + "원 입니다.");
	}
	
	
	

}
