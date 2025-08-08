package review_final;

public class Person {
	
	// 클래스 => 객체를 만드는 역할 // 필드(변수) + 메소드
	// 객체 => 클래스를 통해 구체화 된 것
	// 객체는 변수와 메소드로 이루어짐
	private String name;
	private int age;
	private double height; // private 특성으로 인해 간접적으로 값을 얻어와야 함(get, set 메소드 사용)
	
	// 위의 객체들을 초기화하는 역할 // 생성자 만들기
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void eat() {
		System.out.println("밥을 먹는다");
	}
	
	// lombok 나중에 이거 쓰면 get, set 메소드 생략이 가능
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
