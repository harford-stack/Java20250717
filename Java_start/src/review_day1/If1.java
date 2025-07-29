package review_day1;

public class If1 {

	public static void main(String[] args) {
		
		int a = 5;
		
		// if문의 중괄호는 생략 가능하다, 다만 1줄에만 해당
		// 가독성과 추후 코딩 추가를 감안하여 중괄호 항상 사용 권장
//		if(a > 10) {
//			System.out.println("a는 10보다 크다");
//		} else {
//			System.out.println("a는 10보다 작거나 같다");
//		}
		
		if(a > 10) {
			System.out.println("a는 10보다 크다");
		} else if(a >= 7) {
			System.out.println("a는 7보다 크거나 같다");
		} else if(a >= 5) {			
			System.out.println("a는 5보다 크거나 같다");
		} else {
			System.out.println("a는 5보다 작다");
		}

	}

}
