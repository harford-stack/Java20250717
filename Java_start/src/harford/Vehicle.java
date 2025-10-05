package harford;

public class Vehicle {

	private String brand;
	private int maxSpeed;
	
	
	public Vehicle(String brand, int maxSpeed) {
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	
	public void displayVehicleInfo() {
		System.out.println("제조사 : " + brand);
		System.out.println("최고 속도 : " + maxSpeed + "km/h");
	}
	
}
