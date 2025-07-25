package day8;

public class Carmain {

	public static void main(String[] args) {
		
		Car sonata = new Car("현대", "쏘나타", 2022); // brand(String), model(String), year(int)
		sonata.startEngine(); // 결과 : 현대 쏘나타의 엔진을 시동합니다.
		sonata.showInfo(); // 결과 : 차량 정보 : 2022년식 현대 쏘나타
		
		ElectricCar ioniq = new ElectricCar("현대", "아이오닉5", 2023, 80); // 80은 batteryCapacity(int)
		ioniq.startEngine(); // 결과 : 현대 아이오닉5의 전기 모터를 시동합니다.
		ioniq.showInfo(); // 결과 : 차량 정보 : 2023년식 현대 아이오닉5 (배터리 용량: 77kWh)
		
		int battery = ioniq.getBatteryCapacity();
		System.out.println(battery + "kWh"); // 77kwh

	}
	
	// stack
	// 하노이의 탑 원리
	// LIFO (Last In First Out)
	// 값을 넣는 것을 "push" // push(70)
	// 값을 꺼내는 것을 "pop" // 뒤에 소괄호 안에 값 없음 // 마지막에 들어간 애가 먼저 꺼내지기 때문에
	
	// queue(큐)
	// FIFO (First In First Out)
	// 들어온 곳으로 나가지 못하고 먼저 들어간 쪽에 통로가 있기 때문에 먼저 들어간 애가 먼저 나옴 // push, pop은 동일
	
	// 2진수
	// 0과 1로 이루어진 숫자
	// 자리 개수의 제곱만큼 표현이 가능하다
	// 두자리면 2의2승 = 4개 표현 // 0,1,2,3
	// 읽는 법
	// 0은 스위치 꺼진 상태
	// 뒤에서부터 1,2,4,8,16 // 1로 써있다면 왼쪽 숫자만큼 더해주기
	// 0110 => 6
	// 0111 => 7
	// 1111 => 15
	// 0000 => 0
	// 0001 => 1
	// 100101 =>
	// 1바이트 -> 8비트 // 00000000 => 2의8승 = 256개 숫자 // 범위 -128 ~ 127

}
