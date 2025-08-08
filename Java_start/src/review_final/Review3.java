package review_final;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 향상된 for문
		// 삼항연산자
		
		int arr[] = {1, 5, 2, 4, 6, 8};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int num : arr) { // 배열의 크기만큼 반복하고, 배열의 첫번째 인덱스부터 순차적으로 접근하면서 num에 값을 넣어줌
			System.out.print(num + " ");
		}
		// 일반 for문과 향상된 for문 차이
		System.out.println();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		Random ran = new Random();
		for(int i=1; i<10; i++) {
			map.put(ran.nextInt(10)+1, ran.nextInt(10)+1);
		}
		System.out.println(map);
		
		for(int key : map.keySet()) {
			System.out.print(key + " ");
		}
		
		System.out.println();
		// 삼항연산자
		// 숫자 하나 입력 받아서 10보다 크면 '큰 수' 출력, 작으면 '작은 수' 출력
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
//		if(s.nextInt() > 10) {
//			System.out.println("큰 수");
//		} else {
//			System.out.println("작은 수");			
//		}
		
		// 조건 ? true일 때 리턴 : false일 때 리턴;
		String str = s.nextInt() > 10 ? "큰 수" : "작은 수";
		System.out.println(str);

	}

}
