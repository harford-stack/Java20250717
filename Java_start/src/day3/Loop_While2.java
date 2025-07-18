package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_While2 {

	public static void main(String[] args) {
		
		// 랜덤 구구단 문제 출력
		// 사용자가 5문제를 맞추면
		// "5문제를 맞추셨습니다." 출력하고 종료
		
		// 미완성 집에서 해보기
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("랜덤 구구단 문제 시작");
		int count = 0;
		while(true) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			System.out.print(x + " * " + y + " = ");
			int answer = s.nextInt();
			if((x*y) == answer) {
				System.out.println("정답");
				count++;
			} else if((x*y) != answer) {
				System.out.println("오답");
			} else if(count==5) {
				break;
			}
		}
		System.out.println("5문제를 맞추셨습니다.");

	}

}
