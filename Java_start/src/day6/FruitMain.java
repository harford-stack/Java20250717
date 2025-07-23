package day6;

public class FruitMain {

	public static void main(String[] args) {
		
		Fruit banana = new Fruit("바나나", 1000);
		
//		banana.price = 2000;
		banana.setPrice(2000);
		
		int price = banana.getPrice();
		System.out.println(price);

	}

}
