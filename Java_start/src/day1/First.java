package day1;

public class First {

	public static void main(String[] args) {
		
		// 문자를 표현 -> String 첫글자 대문자
		// 숫자(정수-소수점x) -> int, 단 21억이 넘는 숫자는 long
		// 숫자(실수-소수점o) -> double
		// 참 or 거짓 -> boolean (값은 true 또는 false 로 표기)
		// 프로그램 언어에서 "="은 오른쪽의 값을 왼쪽의 변수에 집어넣겠다는 뜻
		// 프로그램 언어에서 ";"은 변수 종료 선언
		
		String name = "홍길동";
		int age = 30;
		double height = 170; // 실수 데이터 안에 정수 입력 가능 위는 170.0 이라는 뜻
		boolean married = false; // true or false
		
		
		System.out.println(name); // 만약에 name에 ""를 붙이면 그건 그냥 텍스트
								  // name이라는 변수를 꺼내서 보여주는 것
		System.out.println(age);
		// + 의 역할
		System.out.println(name + 5); // 소괄호 안에서 문자가 하나라도 있다면 단순 이어붙이기
		System.out.println(age + 5);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("나이 : " + age + 5); //"나이 : " + age 이걸 먼저 계산함 그래서 +5는 단순 이어붙이기
		System.out.println("나이 : " + (age + 5));
//		System.out.println("나이 : " + (age + 5)); // 커서 놓고 ctrl키 + /키 누르면 앞부분 주석으로 표시됨 (잠깐 이 명령을 안쓰고 싶을때)
		
		// 한줄 삭제 : 커서 올려놓고 ctrl + d
		
		//문제 위에서 선언한 변수를 이용하여 '홍길동의 나이는 30, 키는 170.5 입니다.' 출력하기
		System.out.println(name + "의 나이는 " + age + ", 키는 " + (height + 0.5) + " 입니다.");
		
		
		
	} // main

}
