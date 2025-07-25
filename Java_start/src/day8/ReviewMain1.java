package day8;

public class ReviewMain1 {
	
	static void varParameter(int age, String name) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	static void objParameter(Animal_Review animal) { // 부모클래스의 형태로 받는 것임
		System.out.println("이름 : " + animal.getName());
	}

	public static void main(String[] args) {
		
//		Animal_Review cat = new Animal_Review("고양이", 3);
//		cat.eat();
//		cat.speak();
//		cat.walk(); // 자식 클래스 메소드는 부모 클래스가 호출 x
//		
//		Dog_Review dog = new Dog_Review("강아지", 5, "푸들");
//		dog.eat();
//		dog.speak(); // 자식클래스에서 새로 재정의했기 때문에 출력 값이 다름
//		dog.walk();
		
//		========================================
		varParameter(3, "이순신");
		int a = 20;
		String b = "홍길동"; // b 는 객체레퍼런스 // b타자치고 . 찍어보기
//		String b = new String("홍길동"); // 윗줄과 똑같음
		varParameter(a, "홍길동");
		
		Animal_Review cat = new Animal_Review("고양이", 3);
		objParameter(cat);
		
		Dog_Review dog = new Dog_Review("강아지", 5, "푸들");
//		Animal_Review dog2 = dog;
		objParameter(dog);
		

	}

}
