package day15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Test0806_06 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int arr[] = new int[20];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}				
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(map);
		int max = 0;
		for(int key : map.keySet()) {
//			System.out.println(key + " => " + map.get(key));
			if(max < map.get(key)) {
				max = map.get(key);
			}
		}
		System.out.println(max);
		for(int key : map.keySet()) {
			if(max == map.get(key)) {
				System.out.println("가장 많은 수 : " + key + ", 개수 : " + max);
			}
		}

	}

}
