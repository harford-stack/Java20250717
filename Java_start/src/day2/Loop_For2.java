package day2;

import java.util.Scanner;

public class Loop_For2 {

	public static void main(String[] args) {
		
		// 1~10까지의 더한 값을 구해보시오
//		int sum = 0; // 얘가 for문 안으로 들어간다면 sum은 계속 초기화(0)가 되기 때문에
//		for(int i=1; i<=10; i++) {
//			sum = sum + i; // sum +=i; 이 식과 같다
//		}
//		System.out.println(sum); // 이게 for문 안에 있다면 덧셈의 히스토리를 볼 수 있다
//		// 최종 결과만 보기 위해 for문 바깥에서 출력
//		
//		System.out.println("--------------------------------------");		
		
		// 숫자를 1개 입력 받아서
		// 1부터 입력받은 숫자까지 모두 더하기
		// ex) 20을 입력하면 1부터 20까지의 합 출력
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = s.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합은 " + sum + " 입니다.");
		
	}

}
