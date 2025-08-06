package day15;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		
		// 문자열을 입력 받아서
		// 문자열 빈도 찾기
		// ex) Show Me The Money
		// 결과 : s : 2, h : 2, o : 2, w : 1, ...., y : 1
		// 대소문자 구분 없이 같이 카운팅
		// 공백은 체크x
		
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		System.out.print("문자열을 입력하세요 : ");
		String str = s.nextLine(); // 그냥 s.next() 해버리면 공백 전까지만 인식됨
		for(int i=0; i<str.length(); i++) {
			String word = Character.toString(str.charAt(i)).toLowerCase();
//			word = word.toLowerCase();
			if(word.equals(" ")) {
				continue;
			}
			if(map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);				
			}
		}
		System.out.println(map);
		for(String key : map.keySet()) {
			System.out.print("[" + key + " : " + map.get(key) + "]");
		}

	}

}
