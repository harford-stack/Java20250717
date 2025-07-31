package review_day3;

public class FruitMain {

	public static void main(String[] args) {
		
		Fruit orange = new Fruit();
//		orange.price = -1000; // 불가, private 설정
//		System.out.println(orange.price); // 불가
		System.out.println(orange.getPrice());
		
		orange.setPrice(3000);
		System.out.println(orange.getPrice());
		
		orange.setPrice(-1000); // 음수도 가능해져버리기 때문에 // 제어를 해줘야함
		
		

	}

}
