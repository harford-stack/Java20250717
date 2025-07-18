package day3;

import java.util.Scanner;

public class Loop_While1 {

	public static void main(String[] args) {
		// while문은 for문과 달리 소괄호 안에는 조건식, while 위에 변수 지정, 중괄호 안에 증감식 들어감
		
//		int i=0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
		
		// 1. 1부터 사용자가 입력한 숫자까지 합을 구하기
		// while문 사용하기
		
		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력해 주세요 : ");
//		int input = s.nextInt();
//		int sum = 0;
//		int i = 1;
//		while(i<=input) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		
		// 2. 구구단 짜기
		// while문 사용하기
		
		int i=2;
		while(i<=9) {
			System.out.println("======= " + i + "단 =======");
			int j=1;
			while(j<=9) {
				System.out.println(i + " * " + j + " = " + (i*j));
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
