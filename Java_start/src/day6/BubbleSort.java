package day6;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {5,4,7,1,3,8,9,6,2};

		
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
