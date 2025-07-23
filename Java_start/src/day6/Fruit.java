package day6;

public class Fruit {
	
	private String name;
	private int price; // 다른 클래스에서 사용불가, 접근불가, 수정불가
	// 기본적으로 private을 하고 간접접근을 허용해야하기에
	// 빈곳 오른쪽 우클릭 source => Generate getters and setters 로 설정
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void info() {
		System.out.println(name + "의 가격은 " + price + " 입니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
//	int getPrice() {
//		return price;
//	}
//	
//	void setPrice(int price) {
//		if(price <= 0 || price >= 100000) {
//			System.out.println("가격을 다시 확인해주세요.");
////		} else if (false) { // 권한체크
////			System.out.println("권한이 없는 사용자입니다.");
//		} else {			
//			this.price = price;			
//		}
//	}

}
