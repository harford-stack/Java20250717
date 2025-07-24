package day7;

public class ArrayFunc {
	
	
	static int maxArr(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static double avgArr(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return (double) sum/arr.length;
	}
	
	static int[] oddArr(int[] arr) {
		int oddCount = 0;
		for(int value : arr) {
			if(value % 2 == 1) {
				oddCount++;
			}
		}
		int oddArr[] = new int[oddCount];
		int oddIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 1) {
				oddArr[oddIndex++] = arr[i];
			}
		}
		return oddArr;
	}
	
	static int[] bigNumArr(int[] arr) {
		int bigNumCount = 0;
		for(int value : arr) {
			if(value >= 8) {
				bigNumCount++;
			}
		}
		int bigNumArr[] = new int[bigNumCount];
		int bigNumIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 8) {
				bigNumArr[bigNumIndex++] = arr[i];
			}
		}
		return bigNumArr;
	}
	

}
