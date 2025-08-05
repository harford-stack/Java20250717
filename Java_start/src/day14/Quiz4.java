package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("======= 성적관리 시스템 =======");
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 점수수정 (4) 종료 ] : ");
			int input = s.nextInt();
			if(input == 1) {
				HashMap<String, Object> user = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				user.put("name", name);
				System.out.print("국어 점수 : ");
				int scoreKor = s.nextInt();
				user.put("scoreKor", scoreKor);
				System.out.print("영어 점수 : ");
				int scoreEng = s.nextInt();
				user.put("scoreEng", scoreEng);
				System.out.print("수학 점수 : ");
				int scoreMath = s.nextInt();
				user.put("scoreMath", scoreMath);
				list.add(user);
			} else if(input == 2) {
				for(int i=0; i<list.size();	i++) {
					HashMap<String, Object> user = list.get(i);
					System.out.println((i+1) + ". 이름 : " + user.get("name"));
					System.out.print("   국어 : " + user.get("scoreKor"));
					System.out.print(", 영어 : " + user.get("scoreEng"));
					System.out.print(", 수학 : " + user.get("scoreMath"));
					System.out.println(", 평균 : ");
				}
			} else if(input == 3) {
				System.out.print("점수를 수정할 학생의 이름을 입력해주세요 : ");
				String modStudentName = s.next();
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(modStudentName.equals(user.get("name"))) {
						System.out.print("수정할 과목을 선택하세요 (1. 국어 2. 영어 3. 수학) : ");
						int modSubject = s.nextInt();
						if(modSubject == 1) {
							System.out.println("새로운 점수를 입력하세요 : ");
							int modScore = s.nextInt();
							user.put("scoreKor", modScore);
						} else if(modSubject == 2) {
							System.out.println("새로운 점수를 입력하세요 : ");
							int modScore = s.nextInt();
							user.put("scoreKor", modScore);
						} else if(modSubject == 3) {
							System.out.println("새로운 점수를 입력하세요 : ");
							int modScore = s.nextInt();
							user.put("scoreMath", modScore);
						} else {
							System.out.println("잘못된 과목 번호입니다.");
							continue;
						}
					}
						System.out.println("점수가 수정되었습니다.");
				}
			} 
		}

	}

}
