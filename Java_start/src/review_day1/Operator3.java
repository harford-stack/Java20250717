package review_day1;

public class Operator3 {

	public static void main(String[] args) {
		
		// 비교연산자
		// >, <, >=, <=, ==, !=
		int num1 = 10;
		int num2 = 5;
		System.out.println(num1 > num2);
		// 비교연산자의 결과는 true or false이므로
		// 조건문과 같이 사용된다
		if(num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		}
		
		System.out.println(num1 < num2);
		System.out.println(num1 > 10);
		System.out.println(num1 >= 10);
		
		System.out.println(num1 == 10);
		System.out.println(num1 != 10);
		
		System.out.println(!(num1 > num2));
		System.out.println(!true);

	}

}
