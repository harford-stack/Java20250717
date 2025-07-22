package quiz;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		// 3. 스캐너를 통해 숫자를 하나 입력받고, 해당 숫자의 구구단을 역순으로 출력하시오.
		// (ex, 2입력시 2*9=18, 2*8=16, 2*7=14 ... 2*1=2 출력)
		
		Scanner s = new Scanner(System.in);
		System.out.print("구구단 단수를 입력해 주세요 : ");
		int input = s.nextInt();
		
		for(int i=9; i>0; i--) {
			System.out.println(input + " * " + i + " = " + (input * i));
		}

	}

}