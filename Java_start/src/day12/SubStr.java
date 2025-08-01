package day12;

import java.util.Scanner;

public class SubStr {

	public static void main(String[] args) {
		
		String word = "Java Programming";
		System.out.println(word.substring(3));
		System.out.println(word.substring(1, 6)); // endIndex 주의 // -1 자리까지 출력됨
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String input = s.next();
//		System.out.println(input.substring(1, 4) + input.substring(0, 1));
//		System.out.println(input.substring(2, 4) + input.substring(0, 2));
//		System.out.println(input.substring(3, 4) + input.substring(0, 3));
//		System.out.println(input.substring(4, 4) + input.substring(0, 4));
		
//		for(int i=1; i<input.length()+1; i++) {
//			System.out.println(input.substring(i, input.length()) + input.substring(0, i));
//		}
		
		for(int i=0; i<input.length(); i++) {
			String first = input.substring(0, 1);
			String last = input.substring(1);
			input = last + first;
			System.out.println(input);
		}

	}

}
