package day5;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 30);
		System.out.println(hong);
		System.out.println(hong.toString()); // .toString() 은 생략 가능 // 오버라이딩에 속함

		Person kim = new Person();
	}

}
