package day3;

import java.util.Scanner;

public class Day2_Review2 {

	public static void main(String[] args) {
		// 조건문
		// 단순 if, if ~ else, if ~ else if ~ else, 중첩 if
		
//		int num1= 30;
//		if (num1 > 20) {          // if 소괄호 안에는 무조건 조건식, 즉 true 또는 false 나와야하는 식이어야함
//			System.out.println("20보다 큽니다."); // 소괄호가 true라면 중괄호의 내용일 출력됨
//		}
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		int num1 = s.nextInt();
				
		if (num1 > 20) {
			System.out.println("20보다 큽니다.");	
		} else {
			System.out.println("20 이하의 숫자입니다.");
		}

	}

}
