package day8;

public class Dog_Review extends Animal_Review{
	
	String dogBreed; // 견종
	
	Dog_Review(String name, int age, String dogBreed) {
		super(name, age);
		this.dogBreed = dogBreed;
	}
	
	void walk() { // 산책
		System.out.println(dogBreed + "가 산책한다.");
	}
	
	// 부모클래스에 있는 메소드를 자식클래스에서 다시 정의 (오버라이딩)
	@Override // speak 타자 치고 ctrl + space
	void speak() {
		System.out.println(dogBreed + "가 멍멍 짖는다.");
	}

}
