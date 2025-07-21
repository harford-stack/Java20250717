package day4;

public class Array3 {

	public static void main(String[] args) {
		
		// 1. arr 배열에서 가장 큰 값 찾기
//		int arr[] = {1,5,10,25,3};
//		int max = 0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("가장 큰 수 : " + max);
		
		// 위의 코드에서 배열의 값이 모두 음수이거나 할때
		// 아래처럼 처음에 max를 첫번째 배열의 값으로 지정해주고
		// for문에서 i를 1로 지정해준다
//		int arr[] = {1,5,10,25,3};
//		int max = arr[0];
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("가장 큰 수 : " + max);
		
		
		// 2. arr 배열에서 가장 큰 값의 위치(index) 찾기
//		int arr[] = {20,5,10,25,3};
//		int max = arr[0];
//		int count = 0;
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//				count++;
//			}
//		}
//		System.out.println("가장 큰 수 : " + max);
//		System.out.println("가장 큰 값의 위치(index) : " + count);
		
		// 위에는 내가 한거, 밑에는 선생님
		int arr[] = {20,5,10,25,3};
		int maxIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println("가장 큰 값의 위치(index) : " + maxIndex);
		

	}

}
