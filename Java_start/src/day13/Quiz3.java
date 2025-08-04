package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz3 {
	
	public static int scoreFunc(String subject, int max) {
		Scanner s = new Scanner(System.in);
		int score = 0;
		while(true) {
			System.out.print(subject + " >> ");
			score = s.nextInt();
			if(score < 0 || score > max) {
				System.out.println(subject + "의 범위는 0부터 " + max + "까지 입니다.");
			} else {
				break;
			}
		}
		return score;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("======= 성적관리 시스템 =======");
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.print("인원 수 입력 : ");
		int input = s.nextInt();
		for(int i=0; i<input; i++) {
			HashMap<String, Object> user = new HashMap<>();
			System.out.print("이름 >> ");
			String name = s.next();
			user.put("name", name);
			
			user.put("java", scoreFunc("자바", 40));
			user.put("oracle", scoreFunc("오라클", 35));
			user.put("html", scoreFunc("html", 25));
			
//			while(true) {
//				System.out.print("자바 >> ");
//				int java = s.nextInt();
//				if(java < 0 || java > 40) {				
//					System.out.println("자바의 범위는 0부터 40까지 입니다.");
//				} else {
//					user.put("java", java);
//					break;
//				}
//			}
//			while(true) {
//				System.out.print("오라클 >> ");
//				int oracle = s.nextInt();
//				if(oracle < 0 || oracle > 35) {				
//					System.out.println("오라클의 범위는 0부터 35까지 입니다.");
//				} else {
//					user.put("oracle", oracle);
//					break;
//				}
//			}
//			while(true) {
//				System.out.print("html >> ");
//				int html = s.nextInt();
//				if(html < 0 || html > 35) {				
//					System.out.println("html의 범위는 0부터 25까지 입니다.");
//				} else {
//					user.put("html", html);
//					break;
//				}
//			}
			list.add(user);
		}
		System.out.println(list);
		
		System.out.println("----------------------------");
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			int sum = (int) user.get("java") + (int) user.get("oracle") + (int) user.get("html");
			System.out.println("이름 : " + user.get("name") + ", 총점 : " + sum);
		}

	}

}
