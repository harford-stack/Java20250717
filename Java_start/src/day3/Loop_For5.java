package day3;

import java.util.Scanner;

public class Loop_For5 {

	public static void main(String[] args) {
		//  숫자를 하나 입력 받아서 해당 숫자만큼 늘어나는 별찍기
		// ex) 4를 입력
		// 결과
		// *
		// **
		// ***
		// ****
		
		Scanner s = new Scanner(System.in);
		System.out.print("별 개수 입력 : ");
		int input = s.nextInt();
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
