package day15;

import java.util.HashMap;
import java.util.Set;

public class MapKeySet {

	public static void main(String[] args) {
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("height", 170.5);
		map.put("isMarried", true);
		System.out.println(map);
		
		// 키 값을 얻어오는 방법
//		Set<String> keys = map.keySet();
		for(String key : map.keySet()) {
			System.out.println(key);
			map.get(key);
			System.out.println(map.get(key));
			
		}

	}

}
