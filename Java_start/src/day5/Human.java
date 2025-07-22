package day5;

public class Human {
	
	// 구글에 피그마 툴 둘러보기
	
	String name;
	int age;
	String addr;
	
	Human(String name, int age, String addr) {          // 얘는 생성자, 클래스 이름과 동일하고, 대문자로 시작, 객체를 초기화할 때 사용
		this.name = name; // this 라는 키워드를 앞에 붙여서 구분(색깔 확인)
		this.age = age;
		this.addr = addr;
	}
	
	Human(String name, int age) {   // 오버로딩의 기능으로 중복 가능, 그리고 호출할 때 위 생성자와 달리 이름과 나이만 써도 되는 것임
		this.name = name; 
		this.age = age;
	}
	
	void eat() {
		System.out.println(name + "(이)가 밥을 먹는다!");
	}
	void study() {
		System.out.println(name + "(이)가 공부 한다!");		
	}

}
