package day1;

public class Operator1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		System.out.println(num1 + num2); //해당 줄에 커서 놓고 ctrl+alt 하면 아래줄에 복사
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2); // 몫만 나옴
		System.out.println(num1 % num2); // 나머지만 나옴  // 홀수 짝수 조건문에서 많이 쓰임
		// 정수와 정수의 계산 결과는 무조건 결과가 정수
		// 수를 계산할 때 하나라도 실수(소수점)가 있다면 결과가 무조건 실수
		
		System.out.println((double) num1 / num2); // double로 강제 변환
		
		int num3 = 10;
		double num4 = 3; // 3.0
		System.out.println(num3 / num4);
		// 수를 계산할 때 하나라도 실수(소수점)가 있다면 결과가 무조건 실수
		
		
		
		
		
	}

}
