package JavaTest;

import java.util.Random;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
//		[문항3]  3. 구구단 문제를 랜덤으로 생성하여 출력하고 사용자로부터 답을 입력 받으시오. (20점)
//		조건 1. 사용자로부터 몇문제를 풀지 입력 받은 후 해당 수 만큼 문제를 출력한다.
//		단, 문제 수는 최소 3, 최대 10문제로 제한한다.
//		조건 2. 모든 문제를 풀이한 후 맞은 개수가 더 많을 경우 '통과 입니다' 출력 후 종료한다.
//		조건 3. 틀린 개수가 더 많거나 맞은 개수와 동일할 경우 '재도전 하시겠습니까? 출력 후
//		'네'를 입력하면 조건 1부터 다시 시작, 그 외의 값을 입력하면 종료한다.
//		조건 4. 위에서 정의한 문구외의 다른 문구는 자유롭게 정의한다.
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		while(true) {
			int correctCount = 0;
			int wrongCount = 0;
			System.out.print("원하는 문제 수를 입력해주세요 : ");
			int question = s.nextInt();
			if(question < 3 || question > 10) {
				System.out.println("문제 수는 최소 3문제 이상, 최대 10문제까지 가능합니다.");
				continue;
			} else {
				System.out.println(question + "문제 풀이를 시작합니다.");
				for(int i=1; i<=question; i++) {
					int x = ran.nextInt(8) + 2;
					int y = ran.nextInt(9) + 1;
					System.out.print(i + "번 : " + x + " * " + y + " = ");
					int answer = s.nextInt();
					if(answer == (x*y)) {
						System.out.println("정답입니다.");
						correctCount++;
					} else {
						System.out.println("오답입니다.");
						wrongCount++;
					}
				}
			}
			if(correctCount <= wrongCount) {
				System.out.println("재도전 하시겠습니까?");
				String again = s.next();
				if(again.equals("네")) {
					continue;
				} else {
					break;
				}
			} else {
				System.out.println("통과 입니다.");
				break;
			}
		}					
	}
}
