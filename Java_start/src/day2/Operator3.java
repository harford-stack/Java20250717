package day2;

public class Operator3 {

	public static void main(String[] args) {
		
		// 논리연산자
		// not, or, and
		// not => !와 같음
		// or(||) => 둘 중 하나라도 만족하면 true // || : 원화표시 shift키
		// and(&&) => 둘 다 만족해야 true
		
		// or(||)
		System.out.println(true || true); // true
		System.out.println(true || false); // true // 둘 중 하나가 true라면 true를 출력하기 때문에
		System.out.println(false || false); // false		
		int num1 = 5;
		int num2 = 10;
		System.out.println(num1 > 8 || num2 > 8); // true
		
		// and(&&)
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(num1 > 8 && num2 > 8); //false
		
		

	}

}
