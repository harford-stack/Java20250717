package day5;

import java.util.Arrays;

public class SelectionSort2 {

	public static void main(String[] args) {
		
		// 앞에서 했던 선택정렬을 반복문 안에 넣어서
		// 확장성 있게 코드를 개선
		
		int arr[] = {3,4,1,5,2};
		
//		for(int i=0; i<arr.length; i++) {			
//			int minIndex = i;
//			for(int j=1; j<arr.length; j++) {
//				if(arr[minIndex] > arr[j]) {
//				minIndex = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[minIndex];
//			arr[minIndex] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		// 위에는 내가 밑에는 선생님
		
		for(int j=0; j<arr.length-1; j++) {
			int minIndex = j;
			for(int i=j+1; i<arr.length; i++) { // i를 1로 시작한다면 다시 반복할 때 또 1부터 시작하므로
				if(arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			
			int temp = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
		

	}

}
