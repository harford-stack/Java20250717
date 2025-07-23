package day6;

import java.util.Arrays;

public class ValueAndRef2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		b = b + 3;
		System.out.println(a);
		
		int arr[] = {1,2,3,4,5};
		int copyArr[] = arr; // arr의 주소를 copyArr에게 전달해준 것(주소공유)
		copyArr[2] = 10000; // 그러므로 copyArr은 arr과 주소를 공유하기에 그 주소에서 2번째 인덱스의 값을 10000으로 바꾼다
		
		// arr, copyArr은 같은 주소를 공유하고 있기 때문에
		// 한쪽에서 수정하면 다른쪽에 동일하게 영향을 받는다
		System.out.println(Arrays.toString(arr));
		
		
		int arr2[] = {3,5,2,4,1};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

	}

}
