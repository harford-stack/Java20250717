package review_day1;

public class Operator5 {
	
	public static boolean oddCheck(int num) {
		if(num % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1 > num2 | num1 % 2 == 1);
		System.out.println(num1 > num2 | oddCheck(num1));

	}

}
