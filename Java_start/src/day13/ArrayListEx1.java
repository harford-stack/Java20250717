package day13;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();
//		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<>();
		// 이제 값을 넣고 싶다면
		list.add(3);
		list.add(100);
		list.add(30);
//		배열명[0] = 10; 실제 배열에서는 이렇게 인덱스를 정의했어야 함
		
		list.add(1, 500);
		// [3, 500, 100, 30]
		
		list.remove(0);
		// [500, 100, 30]
		
		for(int i=0; i<list.size();	i++) {
			int num = list.get(i);
			System.out.println(num);
		}
		
		ArrayList<String> strList = new ArrayList<String>();
//		strList.add(1); // 숫자 불가
		strList.add("홍길동");
		strList.add("김철수");
		strList.add("박영희");
		System.out.println(strList);
		
		ArrayList<Object> objList = new ArrayList<>();
		objList.add(1);
		objList.add("자바");
		objList.add(true);
		objList.add(list);
		objList.add(strList);
		// 위처럼 모든 타입의 수용이 가능하지만 개발자가 Integer 목적으로 설계했다면 Integer로 쓰는게 나음
		
		

	}

}
