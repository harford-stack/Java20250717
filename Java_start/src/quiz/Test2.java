package quiz;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		// 2. 스캐너를 통해 숫자를 입력받은 후 
		// 홀수일 경우 "홀수", 짝수일 경우 "짝수"를 출력하시오.
		// 단, 0이하의 숫자나 11이상의 숫자일 경우 "계산할 수 없습니다." 를 출력하시오.
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		int input = s.nextInt();
		
		if(input <= 0 || input >= 11) {
			System.out.println("계산할 수 없습니다.");
		} else {
			if(input % 2 == 1) {
				System.out.println("홀수");
			} else {			
				System.out.println("짝수");
			}
		}
		


	}

}
