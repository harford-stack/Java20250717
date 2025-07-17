package day2;

public class IF_2 {

	public static void main(String[] args) {
		
		// if ~ else if // 3개 이상의 조건
		// 점수 75
		int score = 75;
		if(score >= 90) {
			System.out.println("A 학점");			
		}else if(score >= 80) {
			System.out.println("B 학점");			
		}else if(score >= 70) {
			System.out.println("C 학점");
		}else if(score >= 60) {
			System.out.println("D 학점");
		} else {
			System.out.println("공부하세요");
		}
		
		System.out.println("종료");
		

	}

}
