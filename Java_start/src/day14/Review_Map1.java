package day14;

import java.util.HashMap;

public class Review_Map1 {

	public static void main(String[] args) {
		
		// list는 출력할때 대괄호로 나옴
		// map은 출력할때 중괄호로 나옴
		// map => {name : "홍길동", age : 30, addr : "인천"} // {key : value, key : value, key : value}
		
//		HashMap<String, Integer> scoreMap = new HashMap<>();
//		scoreMap.put("java", 95);
//		scoreMap.put("oracle", 90);
//		scoreMap.put("html", 93);
//		System.out.println(scoreMap); // toString 필요 없음
		
		HashMap<String, Object> scoreMap = new HashMap<>(); // value 위치에 여러가지 데이터 타입이 들어올 수 있게 하기 위해 Object 사용
		scoreMap.put("java", 95);
		scoreMap.put("oracle", 90);
		scoreMap.put("html", 93);
		scoreMap.put("name", "홍길동");
		System.out.println(scoreMap);
		// scoreMap을 list에 넣어 관리하는게 좋음
		

	}

}
