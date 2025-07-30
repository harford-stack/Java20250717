package review_day2;

import java.util.Arrays;
import java.util.Random;

public class Array6 {

	public static void main(String[] args) {
		
		int arr[] = ArrayFunc.randomArr(10, 1, 30);
		System.out.println(Arrays.toString(arr));
		// 오름차순 => Arrays.sort(arr)
		// 내림차순 => ArrayFunc.descSort(arr)
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		ArrayFunc.descSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		// new int[3][2]
		int arr2[][] = {
						{10, 5},
						{3, 7},
						{2, 9}
					};
		// arr2[0] => {10, 5}
		// arr2[1] => {3, 7}
		// arr2[2][1] => 9
		
//		arr2[1] = {30, 50}; // 불가, 그래서 아래와 같이 변경
//		arr2[1][0] = 30;
//		arr2[1][1] = 50;
//		
//		int arr3[] = {100, 200};
//		arr[1] = arr3; // 문법적으로 배열을 안에 넣는 것은 불가 // 다만 arr[1] 이 {a, b} 이렇게 같으면 가능
		
		// arr2의 모든 값의 합
		int sum = 0;
//		for(int i=0; i<arr2.length; i++) {
//			for(int j=0; j<arr2[i].length; j++) {
//				sum += arr2[i][j];
//			}
//		}
		for(int i=0; i<arr2.length; i++) {
			sum += ArrayFunc.sum(arr2[i]);
		}
		
		
		// 4 * 5 배열에 랜덤한 숫자를 넣기
		// 랜덤한 숫자의 범위는 10~50 사이
		// ArrayFunc 클래스의 randomArr() 함수 사용하기
//		public static int[] randomArr(int size, int first, int last) {
//			int arr[] = new int[size];
//			Random ran = new Random();
//			for(int i=0; i<arr.length; i++) {
//				arr[i] = ran.nextInt(last - first + 1) + first;
//				for(int j=0; j<i; j++) {
//					if(arr[i] == arr[j]) {
//						i--;
//						break;
//					}
//				}
//			}
//			return arr;
//		}
		
		int arr3[][] = new int[4][5];
		
		for(int i=0; i<arr3.length; i++) {
			ArrayFunc.randomArr(arr3.length, 10, 50);
		}
		System.out.println(Arrays.toString(arr3));
		
		

	}

}
