package day4;

import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		
		// 1. 배열의 있는 수를 모두 절대값(음수 -> 양수)으로 바꾸시오.
		int arr[] = {3, 5, -15, 10, -8};
		for(int i=0; i<arr.length; i++) {
			
			// 1.
//			arr[i] = arr[i] >= 0 ? arr[i] : -arr[i]; // 공식느낌으로 외우기
			
			// 2.
//			if(arr[i] < 0) {
//				arr[i] = -arr[i];
//			}
			
			// 3.
			arr[i] = Math.abs(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Math.min(3, 5));

	}

}
