package review_final;

public class Review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int, double, char, boolean // 일반 데이터 타입 // 4가지 명확하게 기억할 것
		// String // 클래스
		// 일반 데이터 타입과 클래스로 만든 객체와의 차이는
		// a. 했을때 뭔가가 뜨냐 안뜨냐
		int a = 0;
		String b = new String("Hello"); // b는 객체
		b.charAt(a);
		b.codePoints();
		b.length();
		System.out.println(b.length());
		
		Integer c = 30;
		String strNumber = "10";
		// 문자열을 숫자 10으로 바꾸고 싶다
//		int number = (int) strNumber; // 불가
		int number = Integer.parseInt(strNumber);
		
		

	}

}
