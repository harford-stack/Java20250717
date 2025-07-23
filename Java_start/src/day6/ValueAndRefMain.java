package day6;

import java.util.Arrays;

public class ValueAndRefMain {

	public static void main(String[] args) {
		
		ValueAndRef v = new ValueAndRef();
		int x = 10;
		v.valuetest(x); // 앞에 x= 를 붙여보기
		System.out.println(x);
		
		x = v.valuetest2(x);
		System.out.println(x);
		
		int arr[] = {1,2,3,4,5};
		System.out.println(arr);
		v.refTest(arr); // 값을 공유하는게 아닌 주소를 공유
		
		System.out.println(Arrays.toString(arr));

	}

}
