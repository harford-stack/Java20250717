package day5;

import java.util.Arrays;

public class Day4_Review1 {

	public static void main(String[] args) {
		
//		int arr[] = new int[5]; // {0,0,0,0,0}
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		
//		int arr[] = {1,5,3,4,2};
//		arr[2] = 10;
//		System.out.println(Arrays.toString(arr));
//		
//		String arr[] = {"java", "oracle", "html", "javascript"};
		
		Object arr[] = {"java", 100, true, 100.5, 'a'}; // Object는 모든 데이터의 성질을 포괄할 수 있다.
		int num = (int) arr[1]; // 데이터 성질을 명시해줘야 함.

	}

}
