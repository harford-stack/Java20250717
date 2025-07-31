package quiz;

public class Laptop extends Computer{
	
	private double weight;

	public Laptop(String brand, double weight) {
		super(brand);
		this.weight = weight;
	}

	public void printSpecs() {
		System.out.println(getBrand() + " 브랜드의 " + weight + "kg 노트북");
	}

	public double getWeight() {
		return weight;
	}
		


}
