package day2;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); // ctrl + shift + 알파벳o 그러면 3번째 줄 import 생성
		System.out.print("숫자를 입력해 주세요 : "); // println에서 "ln" 의 역할은 줄바꿈, 그래서 지워주면 바로 옆에 붙고
		int num1 = s.nextInt();
		System.out.print("이름을 입력해 주세요 : ");
		String name = s.next();
		
		System.out.println("입력한 숫자 : " + num1);
		System.out.println("입력한 이름 : " + name);
		

	}

}
