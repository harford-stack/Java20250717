package day3;

import java.util.Scanner;

public class Loop_For1 {

	public static void main(String[] args) {
		// 2. 숫자를 5번 입력받아서 해당 숫자들의 합을 출력
		//
		
		Scanner s = new Scanner(System.in);
		int sum = 0;
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			int input = s.nextInt();
			if(input < 0) {
				System.out.println("음수는 불가능합니다. 다시 입력해주세요.");
				i--;
				continue; // for문에서 continue를 만나면 다음 줄로 안가고 for문의 증감식으로 간다.
			} else if(input == 0) {
				System.out.println("0을 입력하셨으므로 더 이상 진행하지 않습니다.");
				break; // 조건을 만족했을 때 빠져나가는 역할
			}
			sum += input;
		}
		System.out.println("전체 총합 : " + sum);

	}

}
