package day4;

public class Array1 {

	public static void main(String[] args) {
		
		// 배열
		// 보통 int a = 10; 이렇게 하나만 저장하는데
		// 배열은 10, 20, 30 여러개 지정 가능 (단 같은 타입의 데이터)
		
//		int arr[] = new int[5]; // 저장공간 5개짜리 배열 생성 // arr에 5개의 값을 넣을 수 있음
//		arr[0] = 10; // 앞으로 위치나 순서를 시작할 때 시작은 무조건 0
//		arr[3] = 30; // 4번째 배열의 값이 30
		
//		int arr[] = new int[5]; // {0,0,0,0,0}
//		arr[1] = 5; // {0,5,0,0,0}
//		arr[4] = 10; // {0,5,0,0,10}
//		System.out.println(arr[1]); // 2번째 위치의 값인 5가 출력
		
		int arr[] = {1,3,5,2,4}; // 값을 이미 알고있다면 미리 직접 값 지정 가능
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]); // 증감되는 규칙성이 있기 때문에 반복문으로 효율적으로 코딩 가능
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
//		System.out.println(arr.length); // length는 데이터의 크기를 알려주는 역할 // 그래서 i조건에 length를 넣어준다
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
