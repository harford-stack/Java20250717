package quiz;

import java.util.Arrays;

public class Test5_Test6 {

	public static void main(String[] args) {
		
		// [배열 공통 문제]
		// 배열 : {3, 7, 10, 6, 15, 2}
		// 5. 위 배열을 선언하고 배열 내에 있는 모든 숫자들의 합과 평균을 출력하시오.
		// 6. 위 배열을 선언하고 배열 내에서 짝수 중 가장 큰 값의 위치를 출력하시오.
		
		int arr[] = {3, 7, 10, 6, 15, 2};
		System.out.println("배열 : " + Arrays.toString(arr));
		System.out.println();
		
		// 5번
		System.out.println("<문제 5번>");
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("배열 내 모든 숫자들의 합 : " + sum);
		System.out.println("배열 내 모든 숫자들의 평균 : " + ((double) sum / arr.length));
		System.out.println();
		
		
		// 6번
		System.out.println("<문제 6번>");
		int maxIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				if(arr[i] > arr[maxIndex]) {
					maxIndex = i;
				}
			} else {
				continue;
			}
		}
		System.out.println("배열 내 짝수 중 가장 큰 값의 위치(index) : " + maxIndex);
	}

}
