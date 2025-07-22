package day5;

public class HumanMain {

	public static void main(String[] args) {
		
		Human hong = new Human("홍길동", 25); // new 라는 것은 객체를 만들어서 hong에 넣겠다
		// 위에 Human() 부분에 ctrl키를 누르고 클릭하면 넘어감
		// Human() 여기 소괄호 안에 아무것도 없다면 오류가 뜨는데, Human 클래스에서 데이터 타입을 지정했기 때문
		hong.name = "홍길동";
		hong.eat();
		System.out.println(hong.name);
		
		Human kim = new Human("김철수", 25, "홍");
//		kim.name = "김철수";         // 이게 이제 필요가 없음
		kim.study();
		System.out.println(kim.name);
		
		Human park = new Human("박영희", 20);
		park.eat();
		

	}

}
