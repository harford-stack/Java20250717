package review_day2;

import java.util.Arrays;

public class Array1 {
	
	static void minusArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = -arr[i];
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {5, 8, 2, 6, 10, 4};
		
		Arrays.sort(arr); // 오름차순
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -arr[i];
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			arr[i] = -arr[i];
		}
		System.out.println(Arrays.toString(arr));
		
		ArrayFunc.minusArr(arr);
		Arrays.sort(arr);
		ArrayFunc.minusArr(arr);
		
		int maxValue = ArrayFunc.max(arr); // 배열 내의 가장 큰 값을 리턴
		System.out.println(maxValue);

	}
	
	
	
	
	
	

}
