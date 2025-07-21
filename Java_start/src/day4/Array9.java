package day4;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		
		// 배열에서 문자열을 지정할 때
		
		String arr[] = {"자바", "오라클", "html/css", "js", "jsp"};
		// 스캐너로 입력받아서 해당 과목이
		// 있으면 '있다' 출력, 없으면 '없다' 출력
		
		Scanner s = new Scanner(System.in);
		System.out.print("과목 입력 : ");
		String subject = s.next();
//		int count = 0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i].equals(subject)) { // arr[i] == subject // 문자열끼리 비교할때는 ==이 아니라 .equals() 로 한다
//				count++;
//			} else {
//			}
//		}
//		if(count>=1) {
//			System.out.println("있다");
//		} else {			
//			System.out.println("없다");
//		}
		
		// 위에는 내가 한거 밑에는 선생님
		
		//플래그 방식 설명
		boolean flg = false; // boolean은 true 또는 false 값만 가진다.
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(subject)) {
				flg = true;
				break;
			}
		}
		
		String result = flg ? "있다" : "없다";
		System.out.println(result);
		
		// 아래 if~else로 끝나는 코드를 위처럼 간단하게 할 수 있음
		
//		if(flg) { // flg == true 이게 생략된 것
//			System.out.println("있다");
//		} else {
//			System.out.println("없다");
//		}
	}

}
