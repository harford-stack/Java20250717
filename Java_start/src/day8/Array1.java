package day8;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		
		// 2차원 배열
		
		int arr[] = new int[3]; // {0, 0, 0}
		int arr2[][] = new int[3][2]; // {{0, 0}, {0, 0}, {0, 0}}
//		 {
//		 	{0, 0},
//			{0, 0},
//			{0, 0}
//		 }
		int arr3[][] = 
			{
			 	{1, 2},
				{3, 4},
				{5, 6}
			};
		System.out.println(arr3[0]); //1차원 배열에서는 숫자 1이 떴겠지만 얘는 주소가 뜸
		System.out.println(Arrays.toString(arr3[1]));
		System.out.println(arr3[1].length);
		System.out.println(arr3[2][1]);
		System.out.println(arr3[1][0]);
		
		

	}

}
