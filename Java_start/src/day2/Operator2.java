package day2;

public class Operator2 {

	public static void main(String[] args) {
		
		// 비교연산자
		// 크다, 작다, 같다, 다르다
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1 > 8); // true
		System.out.println(num1 < num2); // false
		System.out.println(num2 > 5); // false
		System.out.println(num2 >= 5); // true
		System.out.println(num1 <= 10); // true // 기호 붙여쓸 때 "=" 기호가 뒤에 위치해야함
		
//		System.out.println(num1 = num2); // 두 숫자가 같다 다르다를 판별하는게 아닌 num1에 num2를 대입해서 출력하겠다는 뜻
		System.out.println(num1 == num2); // 그래서 = 기호를 2번 써줌
		System.out.println(num1 == 10); // 왜 false인지 생각해보기
		
		System.out.println(num1 != num2); // true // !는 부정의 의미
		System.out.println(num1 != 10); // false
		
		System.out.println(true); // true
		System.out.println(!true); // false
		
		System.out.println(num1 == num2); //false
		System.out.println(!(num1 == num2)); // true
		
		

	}

}
