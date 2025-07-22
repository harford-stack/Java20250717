package day5;

import java.util.Arrays;

public class Day4_Review2 {

	public static void main(String[] args) {
		
		int arr[] = {3,5,1,4,2};
		// 가장 작은 값의 위치 찾기(index)
		
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		System.out.println("가장 작은 값의 위치 : " + minIndex);
		
		// 최소값을 0번째 인덱스와 위치 바꾸기
		
		int temp = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex] = temp;
		
		System.out.println(Arrays.toString(arr));
		

	}

}
