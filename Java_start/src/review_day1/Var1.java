package review_day1;

public class Var1 {

	public static void main(String[] args) {
		
		int age = 30; // 정수 => long(21억 이상의 숫자)
		double height = 170.5;
		boolean isMarried = true; // true or false
//		char gender = 'M';
//		String gender2 = "M";
		
		
		String name = "홍길동"; // 첫글자가 대문자면 클래스
		// 위의 일반데이터는 데이터 하나 딱 저장
		// 홍길동은 객체, 수많은 변수(필드)와 메소드로 구성
		// name. 해보면 수많은 메소드 확인가능
		// 유용한 기능들이 미리 저장되어 있기 때문에 필요한 기능을 언제든 꺼내쓰기 가능
		// System.out.println(name); // 출력불가 // 객체는 주소를 가진다는 뜻
		// String은 == 이 안됨, 클래스이기 때문에
		
		if(name.equals("홍길동")) {
			
		}		
		
		if(age == 30) {
			System.out.println("30 맞다");
		}
		
		int a = 30;
		double b = a; // 30.0
		
		double c = 30.5; // 형 변환
		int d = (int) c; // 값의 소실(0.5가 사라짐)
		
		String f = "1";
		System.out.println(f+1); // 수학적 계산 불가
		
		// int g = (int) f; // 형 변환 불가
		
		
	}

}
