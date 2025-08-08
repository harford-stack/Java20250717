package review_final;

import review_day3.Person;
import review_day3.Student;

public class Review4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"java", "oracle", "html", "javascript", "jsp"};
		// 가장 길이가 긴 문자 출력
		String longStr = "";
		for(int i=0; i<arr.length; i++) {
			if(longStr.length() < arr[i].length()) {
				longStr = arr[i];
			}
		}
		System.out.println(longStr);
		
		
		Student stuArr[] = new Student[5]; // Student로 만든 객체만 stuArr[]에 들어올 수 있음 또는 Student 클래스를 상속받는 클래스의 객체도(업캐스팅?)
		stuArr[0] = new Student("홍길동", 30, "인천", 1234);
		
		Person stuArr1[] = new Person[5];
		stuArr1[0] = new Student("홍길동", 30, "인천", 1234);
		

	}

}
