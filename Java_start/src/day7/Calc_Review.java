package day7;

public class Calc_Review {
	
	static final double PI = 3.141592; // 가져다 쓸순 있지만(static), 수정은 불가(fianl)
	
	private Calc_Review() {};
	
	static int sum(int x, int y) {
		return x+y;
	}
	static int multiple(int x, int y) {
		return x*y;
	}

}
