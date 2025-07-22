package day5;

public class Calculator {
	
	void intro() {
		System.out.println("계산기 입니다!");
	}
	
	int returnNumber() {
		return 10;
	}
	
	int sum(int x, int y) {
		return x+y;
	}
	
	int max(int x, int y) {
		int maxNum = 0;
		if(x > y) {
			maxNum = x;
		} else {
			maxNum = y;
		}
		return maxNum; // if 안에 return 들어가도 된다고 하니 한 번 해보기
		// return x > y ? x : y;
	}
	
	int arrSum(int[] arr) {
		// 배열을 파라미터로 받아서 모든 값을 더한 후 리턴하는 메소드
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	void intro2(String name, int age, double height ) {
		System.out.println(name + "님의 나이는 " + age + ", 키는 " + height + " 입니다.");
	}
	
	
	

}
