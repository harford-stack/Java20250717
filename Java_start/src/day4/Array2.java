package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		// 1. arr1 안에 있는 값들의 평균값 구하기
		int arr1[] = {1, 5, 4, 2, 10};
		double sum = 0;
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
			sum += arr1[i];
		}
		System.out.println("평균 값 : " + (sum / arr1.length)); // 소주점 때문에 sum 앞에 (double) 붙여줘도 된다.
		
		// 2. 사용자로부터 값을 5개 입력받아서 순서대로 arr2에 넣기
		Scanner s = new Scanner(System.in);
		System.out.println("5개 숫자 입력");
		int arr2[] = new int[5];
		for(int j=0; j<arr2.length; j++) {
			System.out.print((j+1) + "번째 숫자 입력 : ");
			arr2[j] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr2));

	}

}
