package review_day1;

public class Loop_While {

	public static void main(String[] args) {
		
		// for(int i=1; i<=10; i++)
		
		int i = 1;
		while(i<=5) {
			int j = 1;
			while(j<=5) {
				System.out.print("(" + i + "," + j + ") ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
