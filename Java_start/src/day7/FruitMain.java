package day7;

public class FruitMain {
	
	public static void fruitBoxing(Fruit f, int num) {
		System.out.println(f.name + "를 " + num + "개 포장했습니다.");		
	}
	
//	public static void appleBoxing(Apple apple, int num) {
//		System.out.println(apple.name + "를 " + num + "개 포장했습니다."); 
//	}
//	public static void orangeBoxing(Orange orange, int num) {
//		System.out.println(orange.name + "를 " + num + "개 포장했습니다.");
//	}
//	public static void bananaBoxing(Banana banana, int num) {
//		System.out.println(banana.name + "를 " + num + "개 포장했습니다.");
//	}

	public static void main(String[] args) {
		
		Apple apple = new Apple("사과", 1000);
		fruitBoxing(apple,3); // 꼭 apple이 아니어도 됨
		
		Orange orange = new Orange("오렌지", 1500);
		fruitBoxing(orange, 5);
		
		Banana banana = new Banana("바나나", 500);
		fruitBoxing(banana, 10);
		
		// 업캐스팅
		Fruit goldApple = new Apple("황금사과", 20000); // 맨 앞에 꼭 Apple이 아니어도 됨 사과는 과일이라 볼 수 있으므로
		Fruit jejuOrange = new Orange("제주오렌지", 5000);
		Fruit goldBanana = banana;

	}

}
