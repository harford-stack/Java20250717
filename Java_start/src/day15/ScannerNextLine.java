package day15;

import java.util.Scanner;

public class ScannerNextLine {

	public static void main(String[] args) {
		
		// 스캐너 next()와 nextLine()
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자 입력 1 : ");
		int num1 = s.nextInt(); // 10\n
		
		System.out.println("문자 입력 : ");
		String str = s.next();
		
		System.out.print("숫자 입력 2 : ");
		int num2 = s.nextInt();

	}

}
