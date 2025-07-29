package review_day1;

public class Loop_For2 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("(" + i + "," + j + ") ");
//			}
//			System.out.println();
//		}
		
//		for(int i=5; i>0; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("(" + i + "," + j + ") ");
//			}
//			System.out.println();
//		}
		
		int count = 0;
		for(int i=5; i>0; i--) {
			count++;
			for(int j=1; j<=count; j++) { // count 없이 j<=6-i; 로 해도 된다
				System.out.print("(" + i + "," + j + ") ");
			}
			System.out.println();
		}
		

	}

}
