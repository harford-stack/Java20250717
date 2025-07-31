package review_day3;

public class HumanMain {

	public static void main(String[] args) {
		
//		int a;
//		a = 10;
//		int a = 10;
		
//		Human hong;
//		hong = new Human();
//		Human hong = new Human(); // 객체 만들기
//		hong.name = "홍길동";
//		hong.eat();
//		hong.money = 100000;
//		
//		Human kim = new Human();
//		kim.name = "김철수";
//		System.out.println(kim.money); // Human 클래스를 통해서 객체를 만든다면 각각 독립적인 존재
		
		
		Human hong = new Human("홍길동", 30, "인천", 10000); // 객체를 만듦과 동시에 Human 클래스의 
		System.out.println(hong.name);
		
		Human kim = new Human("김철수", 25, "서울", 5000);
		System.out.println(kim.name);
		
		
		Human park = new Human("박영희", 20000); // 이름, 소유금액
		Human yu = new Human("유재석", 40, "제주도"); // 이름, 나이, 주소

	}

}
