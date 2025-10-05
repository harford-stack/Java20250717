package harford;

public class Coffee {
	private String name;
	private String size;
	private int price;
	private boolean isIced;
	
	Coffee() {
		name = "메뉴 없음";
		size = "Regular";
		price = 4000;
		isIced = false;
	}
	
	Coffee(String name, int price) {
		this();
		this.name = name;
		this.price = price;
	}
	
	Coffee(String name, String size, int price, boolean isIced) {
		this.name = name;
		this.price = price;
		this.size = size;
		this.isIced = isIced;
	}
	
	void displayInfo() {
		System.out.println("--- 커피 메뉴 정보 ---");
		System.out.println("메뉴 이름 : " + name);
		System.out.println("사이즈 : " + size);
		System.out.println("가격 : " + price);
		System.out.println("아이스 여부 : " + isIced);
	}
	
}
