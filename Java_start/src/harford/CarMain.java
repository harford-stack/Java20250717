package harford;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("--- 1. Vehicle 객체 생성 ---");
        Vehicle myVehicle = new Vehicle("Unknown Brand", 180);
        myVehicle.displayVehicleInfo();

        System.out.println("\n--- 2. Car 객체 생성 ---");
        Car myCar = new Car("BMW", 250, "M5", 4);
        myCar.displayCarInfo();
        myCar.honk();

        System.out.println("\n--- 3. 또 다른 Car 객체 생성 ---");
        Car anotherCar = new Car("Hyundai", 200, "Sonata", 4);
        anotherCar.displayCarInfo();
		
	}

}
