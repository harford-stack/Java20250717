package day3;

public class Loop_For4 {

	public static void main(String[] args) {
		// 9단 => 2단 역순으로 출력
		// 9 * 9 = 81
		// 9 * 8 = 72
		// ...
		// 2 * 2 = 4
		// 2 * 1 = 2
		
		for(int i=9; i>1; i--) {
			System.out.println("======= " + i + "단 =======");
			for(int j=9; j>0; j--) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		System.out.println();

	}

}
