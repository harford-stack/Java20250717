package day3;

import java.util.Scanner;

public class Day2_Review5 {

	public static void main(String[] args) {
		// 1. 숫자를 하나 입력받아서 홀수면 '홀수' 짝수면 '짝수' 출력
		// 2. 숫자를 5번 입력받아서 해당 숫자들의 합을 출력
		// 3. 숫자를 5번 입력받아서 입력받은 수 중에서 가장 큰 수만 출력
		
		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력해 주세요 : "); // 1번 문제
//		int num = s.nextInt();
//		
//		if(num % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
		
//		System.out.print("첫번째 숫자를 입력해 주세요 : "); // 2번 문제(내가 한거)
//		int num1 = s.nextInt();
//		System.out.print("두번째 숫자를 입력해 주세요 : ");
//		int num2 = s.nextInt();
//		System.out.print("세번째 숫자를 입력해 주세요 : ");
//		int num3 = s.nextInt();
//		System.out.print("네번째 숫자를 입력해 주세요 : ");
//		int num4 = s.nextInt();
//		System.out.print("다섯번째 숫자를 입력해 주세요 : ");
//		int num5 = s.nextInt();
//		System.out.println("다섯 숫자의 합 : " + (num1 + num2 + num3 + num4 + num5));
		
//		int sum = 0; // 2번 문제(선생님 풀이)
//		for(int i=1; i<=5; i++) {
//			System.out.println(i + "번째 숫자 입력 : ");
//			int num = s.nextInt();
//			sum += num;
//		}
//		System.out.println("전체 총합 : " + sum);
		
		
		int max = 0;
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			int input = s.nextInt();
//			if(i == 1) { // 모두 음수를 입력했을 때 정상 동작시키는 조건문
//				max = input;
//			}
			if(input > max) {
				max = input;
			}
		}
		System.out.println("가장 큰 수 : " + max);
		
		}

	}


