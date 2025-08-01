package quiz;

public class TV implements PowerControl{
	
	String name;
	public TV(String name) {
		this.name = name;
	}

	@Override
	public void turnOn() {
//		this.getClass();
		System.out.println(name + " 전원 켜짐");
	}

	@Override
	public void turnOff() {
		System.out.println(name + " 전원 꺼짐");
	}

}
