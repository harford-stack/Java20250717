package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Random3 {

	public static void main(String[] args) {
		//네이버 카페 랜덤 구구단 연습 문제 (20250718)
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int count = 0;
		System.out.print("원하는 문제 수를 입력해주세요 : ");
		int question = s.nextInt();
		System.out.println(question + "문제 풀이를 시작합니다. 정답에 0을 입력하면 종료됩니다.");
		for(int i=1; i<=question; i++) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			System.out.print(i + "번 : " + x + " * " + y + " = ");
			int answer = s.nextInt();
			if(answer == (x*y)) {
				System.out.println("정답입니다.");
				count++;
			} else if(answer == 0) {
				System.out.println("0을 입력하여 종료됩니다..");
				question = i-1; // 이게 있고 없고 차이 확인하기
				break;
			} else {
				System.out.println("오답입니다.");
			}
		}
		System.out.println("총 " + question + "문제 중 " + count + "문제를 맞추셨습니다.");


	}

}
