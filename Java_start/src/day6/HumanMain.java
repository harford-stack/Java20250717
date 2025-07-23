package day6;

public class HumanMain {

	public static void main(String[] args) {
		
		Human hong = new Human("홍길동", 30, 170.1);
//		hong.name = "길동이"; name이 private이여서 접근 불가능
		hong.age = 31;
		Human kim = new Human("김철수", 25);
		Human park = new Human("박영희");

	}

}
