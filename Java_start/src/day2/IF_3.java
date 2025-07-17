package day2;

import java.util.Scanner;

public class IF_3 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("나이를 입력해 주세요 : ");
		int age = s.nextInt();
		
		if(age >= 19) {
			System.out.println("성인입니다.");
			
		} else {
			System.out.println("청소년입니다.");
		}
		
		
	}
	

}
