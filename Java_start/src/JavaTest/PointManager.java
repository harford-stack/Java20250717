package JavaTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PointManager {

	public static int checkNumber(int input) {
		while(true) {
			if(input <= 0) {
				System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}		
		return input;
	}
	
	public static HashMap<String, Object> searchUser(ArrayList<HashMap<String, Object>> list, String userName) {
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> getUser = list.get(i);
			if(getUser.get("userName").equals(userName)) {
				return getUser;
			}
		}
		return null;
	}




	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("======= 포인트 관리 프로그램 =======");
		while (true) {
			System.out.print("[ (1)사용자 등록 (2)포인트 적립 (3)포인트 차감 (4)포인트 확인 (5)종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				System.out.print("이름 : ");
				String userName = s.next();
				HashMap<String, Object> user = searchUser(list, userName);
				if(user == null) {
					user = new HashMap<String, Object>();
					user.put("userName", userName);
					System.out.println("나이 : ");
					int age = s.nextInt();
					user.put("age", checkNumber(age));
					int point = 0;
					user.put("point", point);							
					list.add(user);
					System.out.println(userName + "님이 등록되었습니다.");
				} else {
					System.out.println("이미 등록된 사용자입니다.");
				}
				
			} else if(menu == 2) {
				System.out.println("포인트 적립할 사용자 이름 : ");
				String userName = s.next();
				HashMap<String, Object> user = searchUser(list, userName);
				if(user == null) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
				} else {
					
				}
				
			} else if(menu == 3) {
				
			} else if(menu == 4) {
				System.out.println("포인트 확인할 사용자 이름 : ");
				String userName = s.next();
				HashMap<String, Object> user = searchUser(list, userName);
				if(user == null) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
				} else {
					System.out.println(userName + "님의 현재 포인트는");
				}
			} else if(menu == 5) {
				System.out.println("종료되었습니다.");
				break;
			}
		}

	}

}
