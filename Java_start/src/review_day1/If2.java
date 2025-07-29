package review_day1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		// 랜덤한 숫자(1~10) 5개를 배열에 넣고
		// 사용자로부터 입력받은 숫자가 배열에 존재하면 "맞췄다!"
		// 없으면 "틀렸다!" 출력
		
		int arr[] = new int[5];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(arr));
		// 나중에 중복 제거 코드 입력해서 실행해보기(로또추첨)
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int input = s.nextInt();
		
		boolean flg = false; // 이것의 용도는 "입력한 값이 있으면 true로 변경"
		for(int num : arr) { // = for(int i=0; i<arr.length; i++) 와 같음
			if(input == num) {
				flg = true;
				break;
			}
		}
		
		if(flg) { // flg == true 와 같음
			System.out.println("맞췄다!");
		} else {			
			System.out.println("틀렸다!");
		}

	}

}
