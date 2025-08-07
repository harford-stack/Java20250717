package JavaTest;

import java.util.Arrays;
import java.util.Random;

public class ArrayManager {
	
	public static int max(int[] arr) {
		int maxValue = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	
	public static int min(int[] arr) {
		int minValue = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
		
//		[문항5]  5. ArrayManager 클래스를 작성하시오. (10점)
//		조건 1. int형 배열을 매개변수(인자)로 받아서 배열내에서 가장 큰 수와 가장 작은 수의 차이를 리턴하는 메소드를 작성하시오.
//		조건 2. 함수 호출 시 랜덤한 5개의 숫자를 int형 배열에 담고 해당 배열을 리턴해주는 함수를 작성하시오.
//		단, 랜덤한 숫자는 -15~15 범위의 값이어야 함.
//		조건 3. 모든 메소드는 ststic으로 선언할 것.
//		조건 4. 외부함수 사용에 대한 제약 없음.				
		
		int arr[] = new int[5];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(31)-15;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("가장 큰 값 : " + max(arr));
		System.out.println("가장 작은 값 : " + min(arr));
		System.out.println("가장 큰 수와 가장 작은 수의 차이 : " + (max(arr) - min(arr)));
	}
}
