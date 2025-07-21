package day4;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		
		// {2,4,5,3,1}
		// **
		// ****
		// *****
		// ***
		// *
		
		int arr[] = {2,4,5,3,1};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
