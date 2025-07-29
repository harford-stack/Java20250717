package review_day1;

import java.util.Scanner;

public class Operator4 {

	public static void main(String[] args) {
		
		// and, or
		// and(&), or(|)
		
		// and => 둘다 true이면 결과가 true
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		int num1 = 10;
		int num2 = 5;
		System.out.println(num1 > num2 && num1 % 2 == 0);
		System.out.println(num1 > 8 && num1 % 3 == 0);
		
		// or => 둘 중 하나라도 true이면 결과가 true
		// 둘 다 false 일때만 결과가 false
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		// 입력 받은 숫자가 짝수이거나 3의 배수이면 true 출력
		// 그렇지 않으면 false 출력
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력(짝수이거나 3의 배수인지 판별) : ");
		int input = s.nextInt();
		if(input % 2 == 0 || input % 3 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		// syso 여기다 if소괄호 안의 내용을 바로 넣어도 됨

	}

}
