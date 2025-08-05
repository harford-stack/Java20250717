package day14;

import java.util.ArrayList;
import java.util.HashMap;

public class Review_ListMap {

	public static void main(String[] args) {
		
		// {java=95, oracle=90, name=홍길동, html=93}
		// map 하나만 가지고 관리를 하게 되면
		// map 하나당 사람 한명만 관리가 가능
		
//		ArrayList<String> list = new ArrayList<>(); // 꺽쇠 괄호 안은 클래스 // 클래스가 들어가면 그 클래스거만 사용 가능
		// lsit 안에 map 넣기
		ArrayList<HashMap<String, Object>> list = new ArrayList<>(); // 다운캐스팅의 번거로움을 피하기위해 직접 처음에 넣어준다
		
		HashMap<String, Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		
		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("age", 20);
		
		HashMap<String, Object> park = new HashMap<>();
		park.put("name", "박영희");
		park.put("age", 25);
		
		list.add(hong);
		list.add(kim);
		list.add(park);
		
		System.out.println(list);
		
		

	}

}
