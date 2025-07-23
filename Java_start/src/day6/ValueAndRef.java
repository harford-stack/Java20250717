package day6;

public class ValueAndRef {
	
	void valuetest(int x) {
		x = x + 1;
	}
	
	int valuetest2(int x) {
		return x + 1;
	}
	
	void refTest(int[] arr) {
		arr[2] = 10000;
	}

}
