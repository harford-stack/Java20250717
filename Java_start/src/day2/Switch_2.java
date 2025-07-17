package day2;

import java.util.Scanner;

public class Switch_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = s.nextInt();
		
		switch (score / 10) { // switch 코드 자동 완성할 때 2번째 선택
		case 10: // 100점을 입력하고 break를 걸지 않으면 아래 case를 출력
		case 9: // 99점이던 97점이던 값은 9이기 때문에
			System.out.println("A 학점");
			break;
		case 8:
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		case 6:
			System.out.println("D 학점");
			break;
		default:
			System.out.println("F 학점");
		}
		

	}

}
