package day8;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];
		
		// 아래와 같이 만들기
//		{
//			{1,2,3},
//			{4,5,6},
//			{7,8,9}
//		}
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = count++;
				arr[i][j] = (i*3)+(j+1);
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}

}
