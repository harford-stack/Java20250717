package day5;

public class MethodEx2 {
	
	int sum(int x, int y) {
		return x+y;
	}
	double sum(double x, double y) {
		return x+y;
	}
	double sum(double x, int y) {
		return x+y;
	}
	int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	// 동일한 이름의 메소드를 여러개 만드는 것이 가능(오버로딩)
	// 이름이 동일할 때 위에서 sum이 여러 개인데 이중 어떤 것이 호출될 것인가
	// MethodEx2Main 에서 작성한 매개변수(위에서는 정수냐 실수냐)에 따라 맞춰서 호출됨

}
