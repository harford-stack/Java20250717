package review_day3;

public class Student extends Person{ // 
	
	private int stuNo;
	
	public Student(String name, int age, String addr, int stuNo) {
//		this.name = name; // 불가, 부모의 name이 private
//		super(); // 매개변수 없으므로 기본 생성자 호출
		super(name, age, addr);
		this.stuNo = stuNo; // 4개의 값 모두 초기화
	}

	public void study() {
		System.out.println("공부를 한다.");
	}

}
