package quiz;

import java.util.Random;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		
		// 8. 아래 이미지를 참고하여 같은 결과가 나오도록 하시오.
		// * 기본 절차 설명
		//  - 최초에는 메뉴 선택 텍스트 출력
		//  - 1을 입력할 경우 문제 풀이로 이동. 랜덤 구구단 문제 출제
		//  - 문제를 맞추거나 틀림에 따라 상황에 맞는 텍스트 출력
		//  - 정답에 0을 입력할 경우 메뉴 선택으로 이동
		//  - 2를 누를경우 그동안 풀이 했던 문제의 정답 및 오답 개수 출력 후 메뉴 선택으로 이동
		//  - 1~3외의 값을 입력할 경우 '1~3중 선택해 주세요' 텍스트 출력 후 메뉴 선택으로 이동
		//  - 3을 누르면 '종료되었습니다' 출력 후 종료
		Random ran = new Random();
		System.out.println("======== 메뉴 선택 ========");
		Scanner s = new Scanner(System.in);
		System.out.print("[  (1)문제풀이  (2)현재스코어  (3)종료  ] : ");
		int choice = s.nextInt();
		
		System.out.println("문제 풀이를 선택하셨습니다. 정답에 0을 입력하면 메뉴로 이동합니다.");
		int count = 0;
		while(true) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			System.out.print(x + " * " + y + " = ");
			int input = s.nextInt();
			if((x*y) == input) {
				System.out.println("정답");
				count++;
			} else if(input == 0) {
				break;
			} else if((x*y) != input) {
				System.out.println("오답");
			}
		}
		System.out.println("0을 입력하셨으므로 메뉴로 이동합니다.");

	}

}