package day12;

import review_day2.ArrayFunc;

public class GoodCalc extends Calculator{ // Calculator를 상속 받는 순간 오류, 클래스 앞에 abstract

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		
		return ArrayFunc.avg(a); // import 필요
	}

}
