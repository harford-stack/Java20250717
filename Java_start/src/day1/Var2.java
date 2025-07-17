package day1;

public class Var2 {

	public static void main(String[] args) {
		
		int number = 10;
		System.out.println((double) number);
		// 데이터 타입 강제 변경 시 주의 / 더 작은 개념(int)에서 더 큰 개념(double)로 바꾸는 것은 문제 없음
		double number2 = 10.5;
		System.out.println((int) number2);
		// 데이터 타입 강제 변경 시 주의 / 더 큰 개념(double)에서 더 작은 개념(int)로 바꾸는 것은 데이터 소실이 발생
		// 10.5 -> 10 소수점 소실이 발생

	}

}
