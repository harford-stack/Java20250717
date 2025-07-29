package review_day1;

import java.util.Random;
import java.util.Scanner;

public class Loop_While3 {
	
	static Random ran = new Random();
	static Scanner s = new Scanner(System.in);
	
	
//	public static void randomGuGuDan() {
//		for(int i=1; i<=3; i++) {
//			int x = ran.nextInt(8)+2;
//			int y = ran.nextInt(9)+1;
//			System.out.println(x + " * " + y + " = ");
//			int answer = s.nextInt();
//			if(answer == (x*y)) {
//				System.out.println("정답입니다!");
//			} else {
//				System.out.println("오답입니다. 정답은 " + (x*y) + "입니다.");
//			}
//		}
//	}
	
	public static int[] randomGuGuDan(int num) {
		int count = 0;
		System.out.println(num + "문제 풀이를 시작합니다.");
		for(int i=1; i<=num; i++) {
			int x = ran.nextInt(8)+2;
			int y = ran.nextInt(9)+1;
			System.out.print(x + " * " + y + " = ");
			int answer = s.nextInt();
			if(answer == (x*y)) {
				System.out.println("정답입니다!");
				count++;
			} else {
				System.out.println("오답입니다. 정답은 " + (x*y) + "입니다.");
			}
		}
		int arr[] = {count, num-count, num}; // 첫번째는 정답 개수, 두번째는 오답 개수
		return arr;
	}
	
	// 1부터 30 사이의 랜덤한 숫자 생성 후
	// 값을 입력 받아서 몇번만에 맞추는지 출력해준 후 종료
	// 랜덤숫자가 입력값보다 더 클 경우 => 'UP'
	// 작을 경우 => 'DOWN' 출력
	// 정답을 맞추면 '00번 만에 맞추셨습니다.' 출력
	public static void gameUpAndDown() {
		
		int ranNum = ran.nextInt(30)+1;
		int i = 1;
		while(true) {
			System.out.print("숫자 입력 : ");
			int input = s.nextInt();
			if(input == ranNum) {
				System.out.println(i + "번 만에 맞추셨습니다.");
				break;
			} else if(input < ranNum) {
				System.out.println("UP");
			} else if(input > ranNum) {
				System.out.println("DOWN");
			}
			i++;
		}
		
	}

	public static void main(String[] args) {
		
		
		
		// 메뉴
		// 1을 선택하면 랜덤 구구단 문제 3문제 풀이
		// 2를 선택하면 업앤다운 게임
		// 1~2 외의 을 선택하면 종료
		
		int correctCount = 0;
		int inCorrectCount = 0;
		int count = 0;
		while(true) {
			System.out.println("=== 메뉴를 선택해주세요. ===");
			System.out.print("[(1) 랜덤 구구단 (2) Up&Down (3) 구구단 성적 조회 (그 외) 종료] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				System.out.print("풀이하고자 하는 문제 수를 입력해주세요 : ");
				int num = s.nextInt();
				int arr[] = randomGuGuDan(num);
				correctCount += arr[0];
				inCorrectCount += arr[1];
				count += arr[2];
			} else if(menu == 2) {
				gameUpAndDown();
			} else if(menu == 3) {
				System.out.println("총" + (correctCount+inCorrectCount) + "문제 중 " + correctCount + "문제를 맞췄습니다.");
			} else {
				break;				
			}
		}

	}

}
