package day6;

public class Student {
	
	private int stuNo; // (학번, int)
	private String stuName; // (이름, String)
	private String stuDept; // (학과, String)
	private int age; //(나이, int)
	private String gender; // (성별, String)
	
	Student(int stuNo, String stuName) {
		this(stuNo, stuName, "");
		this.stuNo = stuNo;
		this.stuName = stuName;
	}
	
	
	Student(int stuNo, String stuName, String stuDept) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}
	
	void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	int getAge() {
		return age;
	}
	
	void stuInfo() { // 소괄호 안에 다시 받을 필요 없음, 이미 위에서 다 받음
		System.out.println(stuName + " 학생의 학번은 " + stuNo + ", 나이는 " + age + " 입니다.");
	}
	

}
