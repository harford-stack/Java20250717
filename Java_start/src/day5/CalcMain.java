package day5;

import java.util.Random;

public class CalcMain {

	public static void main(String[] args) {
		
		// Calculaotr 클래스를 이용해서
		// calc라는 이름의 객체를 생성
		
		Calculator calc = new Calculator();
		calc.intro();
		int number1 = calc.returnNumber();
		System.out.println(number1);
		
		int number2 = calc.sum(10, 5);
		System.out.println(number2);
		
		int max = calc.max(5, 8); // 더 큰 숫자를 리턴하는 max 함수 만들기		
		System.out.println(max); // 답이 8이 나오도록
		
		int arr[] = {3,5,1,4,2};
		int arrSum = calc.arrSum(arr);
		
		calc.intro2("홍길동", 30, 170.9);
		
		
		Random ran = new Random();
		int num = ran.nextInt(); // 얘는 빈칸인데 왜 호출이 가능한가 // 오버로딩 // 매개변수 
		System.out.println(num);
		

	}

}
