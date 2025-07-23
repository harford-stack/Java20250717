package day6;

public class Human {
	
	// 생성자에서 this()의 활용
	// 생성자에서 this() 메소드는 다른 생성자를 호출하는데 사용
	// this()는 생성자의 첫줄에 있어야한다
	
	// this의 필요성
	// ◼ 객체의 멤버변수와 메소드변수의 이름이 같은 경우
	// ◼ 다른 메소드 호출시 객체 자신의 레퍼런스를 전달할때
	// ◼ 메소드가 객체자신의 레퍼런스를 반환할때
	
	// 필드 영역
	private String name;
	int age;
	double height;
	
	
	
	// 생성자 영역
	Human(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
		
	Human(String name, int age) {
		this(name, age, 0.0);
	}

	Human(String name) {
		this.name = name;
	}
		

}
