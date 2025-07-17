package day2;

public class IF_1 {

	public static void main(String[] args) {
		
		// 조건문 (if)
		int age = 20;
		// 단순 if
//		if(age >= 19) {
//			System.out.println("성인입니다.");
//		}
		
		// if ~ else
		if(age >= 19) {
			// 괄호 안의 조건이 true일 때 실행
			System.out.println("성인입니다.");
		} else {
			// 괄호 안의 조건이 false일 때 실행
			System.out.println("청소년입니다.");
		}
		
		System.out.println("종료!");
		

	}

}
