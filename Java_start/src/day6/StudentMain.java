package day6;

public class StudentMain {

	public static void main(String[] args) {
		
		Student hong = new Student(1234, "홍길동");
		Student yu = new Student(1357, "유재석", "컴퓨터학과");
		
		hong.setInfo(20, "남");
		int age = hong.getAge(); // 리턴된 데이터를 받아올 때
		System.out.println(age);
		
		yu.stuInfo();
		

	}

}
