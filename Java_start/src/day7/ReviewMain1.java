package day7;

public class ReviewMain1 {

	public static void main(String[] args) {
		
		Fruit_Review1 apple = new Fruit_Review1("사과", 1000);
//		apple.price = 99999999999; private이라서 접근 불가능
//		System.out.println(apple.price); // 이것도 안됨 private이라서
		// private으로 막은 값들을 메소드 통해서 해결 => return을 이용한다
		System.out.println(apple.getPrice());
		
		apple.setPrice(2000);
		System.out.println(apple.getPrice());

	}

}
