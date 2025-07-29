package review_day1;

public class Operator2 {

	public static void main(String[] args) {
		
		int a = 10;
		// a+1; << 이거는 존재 불가(수학적 계산은 가능)
		// 계산 결과에 대한 행동을 지정하지 않았기 때문에
		System.out.println(a+1);
//		a++; // 독립적으로 존재 가능 // a = a+1;, a+=1;
		
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		int q = 10;
		int w = ++q;
		int e = w++;
		int r = e++;
		q = w--;
		System.out.println(q); // 12
		System.out.println(w); // 11
		System.out.println(e); // 12
		System.out.println(r); // 11

	}

}
