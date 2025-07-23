package day6;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		
		int arr[] = {3,5,1,4,2,9,6,8,7};
		
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
