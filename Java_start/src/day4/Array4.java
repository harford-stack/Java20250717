package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		// 1. 사용자로부터 숫자 5개를 입력 받아서 배열에 저장
		// 단, 0 이하의 숫자를 입력할 경우 다시 입력하도록
		// System.out.println(Arrays.toString(arr));
		
//		Scanner s = new Scanner(System.in);
//		int arr[] = new int[5];
//		int count = 0;
//		for(int i=0; i<arr.length; i++) {
//			System.out.print((i+1) + "번째 숫자 입력 : ");
//			int input = s.nextInt();
//			if(input > 0) {
//				arr[count] = input;
//				count++;
//			} else {
//				System.out.println("0보다 큰 숫자를 입력하세요.");
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		// 위에는 내가 한거, 밑에는 선생님
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			arr[i] = s.nextInt();
			if(arr[i] <= 0) {
				System.out.println("0보다 큰 숫자를 입력하세요.");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
