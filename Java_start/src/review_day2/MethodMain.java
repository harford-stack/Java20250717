package review_day2;

public class MethodMain {

	public static void main(String[] args) {
		
		MethodEx.testA();
		String qqq = MethodEx.testA(); // 문자열을 리턴해주고 있기 때문에 변수 선언 시에 String으로 받아야 함
		System.out.println(qqq);
		
		MethodEx.testB(); // 리턴이 없는 메소드이므로 testA() 처럼 어디 담을 수가 없음
		// 결과를 어딘가에 되돌려 받는 것이 아닌 호출하고 끝
//		String www = MethodEx.testB(); // 불가
		
		int a = 10;
//		MethodEx.testC(a); // int형 데이터를 하나 받을 수 있어야 한다
		int b = MethodEx.testC(a); // b == 20
		
		double c = MethodEx.testD(a, 1.5); // 괄호 안 두 숫자 곱합 값 리턴
		System.out.println(c);
		
		
		int testArr[] = {1, 2, 3, 4, 5};
		int d = MethodEx.testE(testArr);

	}

}
