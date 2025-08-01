package day12;

public class FoodMain {
	

	
	public static void foodBoxing(Food f) { // 상속 받은 애들이 저기 매개변수로 들어갈 수 있음 // 다만 출력문이 매개변수가 바뀔때마다 계속 바뀌어야함
		// 이때 활용하는게 instanceof 이다
		System.out.println(f.name + "를 포장했습니다.");
		int takeOutPrice = 0;
		if(f instanceof Pizza) {
			takeOutPrice = 3000;
		} else if(f instanceof Burger) {
			takeOutPrice = 2000;
		} else if(f instanceof Salad) {
			takeOutPrice = 1000;
		}
		System.out.println(f.name + "는 포장비" + takeOutPrice + "원 입니다.");
		
		// 음식 종류가 100종류라면, 아래와 같은 코드를 100개 해야함
		// 위 불편함을 해소하는게 업캐스팅
		
//		System.out.println("피자는 포장비 3000원 입니다.");
	}
	
//	public static void pizzaBoxing(Pizza p) {
//		System.out.println(p.name + "를 포장했습니다.");
//		System.out.println("피자는 포장비 3000원 입니다.");
//	}
	
//	public static void burgerBoxing(Burger b) {
//		System.out.println(b.name + "를 포장했습니다.");
//		System.out.println("햄버거는 포장비 2000원 입니다.");
//	}
//	
//	public static void saladBoxing(Salad s) {
//		System.out.println(s.name + "를 포장했습니다.");
//		System.out.println("샐러드는 포장비 1000원 입니다.");
//	}

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza("불고기 피자");
//		Food f = pizza; // pizza는 food이다 => true
//		pizzaBoxing(pizza);
		foodBoxing(pizza);
		Burger burger = new Burger("햄부기");
//		burgerBoxing(burger);
		foodBoxing(burger);
		Salad salad = new Salad("샐러드");
//		saladBoxing(salad);
		foodBoxing(salad);
		
	}

}
