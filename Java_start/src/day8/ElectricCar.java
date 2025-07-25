package day8;

public class ElectricCar extends Car{
	
	private int batteryCapacity;
	
	public ElectricCar(String brand, String model, int year, int batteryCapacity) {
		super(brand, model, year);
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	void startEngine() {
		System.out.println(getBrand() + " " + getModel() + "의 전기 모터를 시동합니다.");
	}

	@Override
	void showInfo() {
		super.showInfo();
		System.out.println(" (배터리 용량 : " + batteryCapacity + "kwh)");
	}
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	
	

}
