package harford;

public class Car extends Vehicle{
	
	private String model;
	private int numberOfDoors;
	
	public Car(String brand, int maxSpeed, String model, int numberOfDoors) {
		super(brand, maxSpeed);
		this.model = model;
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayCarInfo() {
		super.displayVehicleInfo();
		System.out.println("모델명 : " + model);
		System.out.println("문의 개수 : " + numberOfDoors + "개");
	}
	
	public void honk() {
		System.out.println("빵빵! (클락션 소리)");
	}
	
	
}
