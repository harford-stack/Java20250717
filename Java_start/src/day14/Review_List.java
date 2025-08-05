package day14;

import java.util.ArrayList;
import java.util.Random;

public class Review_List {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(); // 2번째 꺽쇠 괄호 안 Integer 생략 가능 // 숫자를 관리하는 리스트
		// 배열보다 확장성이 좋음, 수정 및 삭제 용이
		
//		list.add(1); // [1]
//		list.add(30); // [1, 30] // 따로 순서(인덱스 값) 정해주지 않아도 알아서 값 들어간다
//		list.add(50); // [1, 30, 50]
//		list.add(1, 100); // 1번째 인덱스에 100을 넣겠다 // [1, 100, 30, 50]
		
		// list에 랜덤한 숫자 5개를 넣기
		// 랜덤 숫자의 범위는 1~30, 중복은 일단 상관X
		
		Random ran = new Random();
		for(int i=0; i<5; i++) {
			int ranNum = ran.nextInt(30)+1; // 1~30
			list.add(ranNum);
		}
		
		System.out.println(list);

	}

}
