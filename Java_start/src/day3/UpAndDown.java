package day3;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		
		// 업앤다운 게임
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Up & Down Game Start");
		int random = ran.nextInt(100)+1;
		int count = 0;
		while(true) {
			System.out.print("숫자 입력 : ");
			int answer = s.nextInt();
			if(!(answer >= 1 && answer <= 100)) {
				System.out.println("1부터 100사이의 값을 입력해주세요.");
				continue;
			}
			count++;
			if(random > answer) {
				System.out.println("Up");
			} else if(random < answer) {
				System.out.println("Down");
			} else {
				System.out.println("정답입니다.");
				break;				
			}
		}
		System.out.println(count + "번 만에 맞추셨습니다.");

	}

}
