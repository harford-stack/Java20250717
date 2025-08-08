package review_final;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// % 나머지 연산 많이 쓰이니 잘 습득하기
		// and, or 역시 잘 기억하기
		int a = 10;
		int b = 3;
		String str = "홍길동";	
		System.out.println(a>b && str == "홍길동"); // 문자열 비교 시에는 == 사용 금지 // .equals 사용하기
		System.out.println(a>b && str.equals("홍길동")); // && 1개와 2개의 차이 생각하기
		String str2 = new String("홍길동");
		System.out.println(a<b || str.equals(str2));
		
		System.out.println(a/b);
		System.out.println((double) (a / b));
		System.out.println((double) a / b); // 윗 줄과의 차이 확인

	}

}
