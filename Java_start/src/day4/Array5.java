package day4;

import java.util.Arrays;
import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		
		// 6개의 공간을 가지는 배열을 만들어서
		// 랜덤한 숫자 1~45 사이의 값을 넣기
		// 중복 없음
		
//		int arr[] = new int[6];
//		Random ran = new Random();
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = ran.nextInt(45)+1; // 1~45
//			for(int j=0; j<arr.length; j++) {
//				if(arr[j] == arr[j] -1) {
//					j--;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		// 위에는 내가 한거, 밑에는 선생님
		int arr[] = new int[6];
		Random ran = new Random();
		// 1,2,1
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(45)+1;
			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
