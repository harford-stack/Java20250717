package day15;

import java.util.Random;
import java.util.Scanner;

public class Test0806_03 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int correctCount = 0;
		int wrongCount = 0;
		
		while(true) {
			for(int i=0; i<5; i++) {
				int x = ran.nextInt(8) + 2;
				int y = ran.nextInt(9) + 1;
				System.out.print(x + " * " + y + " = ");
				int input = s.nextInt();
				if((x*y) == input) {
					System.out.println("정답");
					correctCount++;
				} else if((x*y) != input) {
					System.out.println("오답");
					wrongCount++;
				}			
			}
			if(correctCount >= 3) {
				System.out.println("3문제 이상 정답을 맞췄으므로 종료합니다.");
				break;
			} else if(wrongCount >= 3) {
				System.out.println("3문제 이상 틀렸으므로 다시 시작됩니다.");
			}
		}				
	}

}
