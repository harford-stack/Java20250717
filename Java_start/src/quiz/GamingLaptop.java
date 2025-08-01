package quiz;

public class GamingLaptop extends Laptop{
	
	private String model;

	public GamingLaptop(String brand, double weight, String model) {
		super(brand, weight);
		this.model = model;
	}
	
	// 오버라이딩 해야함
	public void printSpecs() {
		System.out.println(getBrand() + " 브랜드의 " + getWeight() + "kg " + model + " 게이밍 노트북");
	}
	
	

}
