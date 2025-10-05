package harford;

public class Student {
	
	int studentId;
	String name;
	String major;
	
	static int nextStudentId = 1001;
	static int totalStudentCount = 0;
	
	
	Student(String name, String major) {
		this.name = name;
		this.major = major;
		
		this.studentId = nextStudentId++;
		totalStudentCount++;
	}
	
	void displayStudentInfo() {
		System.out.println("--- 학생 정보 ---");
		System.out.println("학번 : " + studentId);
		System.out.println("이름 : " + name);
		System.out.println("전공 : " + major);
	}
	
	static int getTotalStudents() {
		return totalStudentCount;
	}
	
	static int getStartingId() {
		return nextStudentId;
	}
	
}
