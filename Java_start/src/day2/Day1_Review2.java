package day2;

public class Day1_Review2 {

	public static void main(String[] args) {
		
		// 연산자(1. 사칙연산)
		// 숫자 + 숫자 => 숫자
		// 문자 + 숫자 => 문자 (문자가 1개라도 있으면 결과가 문자)
		String name = "홍길동";
		int age = 30;
		System.out.println(name + age); // 홍길동30
		System.out.println(age + 5); // 35
		System.out.println(age + "5"); // 305
		System.out.println(name + age + 5); // 홍길동305
		System.out.println(name + (age + 5)); // 홍길동35
		
		
		// 정수와 정수의 계산 결과는 정수
		// 실수와 정수의 계산 결과는 실수 (실수가 1개라도 있으면 결과는 실수)
		int num1 = 10;
		int num2 = 4;
		System.out.println(num1 / num2); // 2 정수와 정수의 계산 결과는 정수이기 때문에
		System.out.println(num1 / (double) num2); // num2를 강제로 실수로 만들어 원하는 2.5를 출력
		double num3 = 4.0;
		System.out.println(num1 / num3); // 2.5
		
		
		// % -> 나머지 연산(나눴을 때 나머지 값을 리턴) // 홀짝을 출력한다던가 3의 배수를 출력한다던가에 활용
		int num4 = 10;
		System.out.println(num4 % 2); // 0
		System.out.println(num4 % 3); // 1
		System.out.println(num4 % 4); // 2
		
		
		

	} // main

}
