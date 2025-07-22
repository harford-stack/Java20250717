package quiz;

import java.util.Arrays;
import java.util.Random;

public class Test7 {

	public static void main(String[] args) {
		
		// 7. 5개의 공간을 가지는 배열을 선언하고,
		// Random 클래스를 이용해 구한 랜덤한 숫자 1~30 사이의 숫자 5개를 배열에 넣으시오.
		// 단, 홀수만 넣을 것.
		
		int arr[] = new int[5];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(30)+1;
			if(arr[i] % 2 != 0) {
				i--;
				continue;
			}
			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i] || arr[i] % 2 != 0) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}