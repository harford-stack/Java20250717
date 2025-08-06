package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class WordQuiz {

	public static ArrayList<HashMap<String, String>> quizList(){
		ArrayList<HashMap<String, String>> list = new ArrayList<>();
		String[] keys = {
			    "멕시코", "스페인", "프랑스", "영국", "그리스", 
			    "독일", "중국", "러시아", 
			    "일본", "대한민국", "이탈리아", "캐나다", "브라질", 
			    "인도", "이집트", "호주", "터키", "노르웨이"
		};
		String[] values = {
			    "멕시코시티", "마드리드", "파리", "런던", "아테네", 
			    "베를린", "베이징", "모스크바", 
			    "도쿄", "서울", "로마", "오타와", "브라질리아", 
			    "뉴델리", "카이로", "캔버라", "앙카라", "오슬로"
		};
		
		for(int i=0; i<keys.length; i++) {
			HashMap<String, String> map = new HashMap<>();
			map.put(keys[i], values[i]);
			list.add(map);
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		ArrayList<HashMap<String, String>> quizList = quizList();
		
		System.out.println("수도 문제 풀이 ! [-1을 입력하면 종료됩니다.]");
		System.out.println("현재 총 " + quizList.size() + "문제가 있습니다!");
		
		
//		int quizNum = ran.nextInt(quizList.size()+1);
//		HashMap<String, String> quiz = quizList.get(quizNum);
//		for(String key : quiz.keySet()) {
//			System.out.print("[" + key + "]" + "의 수도는? >> ");
//			String input = s.next();
//			if(quiz.get(key).equals(input)) {
//				System.out.println("정답!");
//			} else {
//				System.out.println("오답! 정답은: " + quiz.get(key));
//			}
//		}
//		
//		String country = "";
//		String capital = "";
//		
////		System.out.println("[" + country + "]" + "의 수도는? >> ");
//		
//		for(int i=0; i<quizList.size(); i++) {
//			int quizNum = ran.nextInt(quizList.size()+1);
//			HashMap<String, String> quiz = quizList.get(quizNum);
//			for(String key : quiz.keySet()) {
//				country = key;
//				capital = quiz.get(key);
//			}
//			System.out.print("[" + country + "]" + "의 수도는? >> ");
//			String input = s.next();
//			if(capital.equals(input)) {
//				System.out.println("정답!");
//			} else {
//				System.out.println("오답! 정답은: " + capital);
//			}
//		}
		
		// 문제는 중간에 종료하지 않으면 최대 10문제까지 출력
		// 중복은 있으면 안됨
		// 한 문제당 10점
		// 최종 몇점인지 출력(중간에 종료하지 않았을 경우)
		
		HashMap<Integer, Integer> keyTable = new HashMap<>();
		int count = 0;
		for(int i=0; i<10; i++) {
			int ranNum = ran.nextInt(quizList.size());
			if(keyTable.containsKey(ranNum)) {
				continue;
			}
			keyTable.put(ranNum, 0); // {랜덤숫자 : 0, 랜덤숫자 : 0, ~~~}
			HashMap<String, String> quiz = quizList.get(ranNum);
			String country = "";
			String capital = "";
			for(String key : quiz.keySet()) {
				country = key;
				capital = quiz.get(key);
			}
			System.out.print("[" + country + "]" + "의 수도는? >> ");
			String answer = s.next();
			if(answer.equals("-1")) {
				System.out.println("게임을 종료합니다.");
				break;
			} else if(answer.equals(capital)) {
				System.out.println("정답!");
				count++;
			} else {
				System.out.println("오답! 정답은: " + capital);
			}
		}
		System.out.println("최종 점수는 : " + (count * 10));
		
	}

}
