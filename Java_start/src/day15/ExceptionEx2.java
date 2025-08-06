package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		
//		System.out.println(num1/num2); // 10 과 0을 넣었을 때
		
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("숫자 입력 1 : ");
			int num1 = s.nextInt();
			System.out.print("숫자 입력 2 : ");
			int num2 = s.nextInt();
			
			System.out.println(num1/num2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage()); // e 객체에 에러정보가 담겨있음 // 모든 정보를 알려주진 않음
			System.out.println("에러가 발생했음");
		}

	}

}
