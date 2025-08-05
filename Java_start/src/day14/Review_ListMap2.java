package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review_ListMap2 {

	public static void main(String[] args) {
		
		// List + Map
		// 사용자로부터 이름, 나이를 입력받아서
		// 3명의 정보를 Map의 형태로 만든 후 List에 저장하는 코드 작성
		
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		for(int i=0; i<3; i++) {
			HashMap<String, Object> map = new HashMap<>(); // 한바퀴 돌때마다 새로운 객체를 만들어줘야하기 때문에 // 왜 for문 안에 들어가는지 이해 안되면 바깥으로 빼보기
			System.out.print("이름 : ");
			String name = s.next();
			map.put("name", name);
			System.out.print("나이 : ");
			int age = s.nextInt();
			map.put("age", age);
			
			list.add(map);
		}
		System.out.println(list);
		
		// 이름만 꺼내기
		for(int i=0; i<list.size(); i++) {
//			HashMap<String, Object> user = list.get(i);
//			System.out.println(user.get("name")); //관계가 궁금하다면 프린트 소괄호 안에 user만 넣고 실행해보기
			
			System.out.println(list.get(i).get("name"));
		}

	}

}
