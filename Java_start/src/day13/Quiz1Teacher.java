package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1Teacher {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Human> list = new ArrayList<>();
		
		while(true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 삭제 (4) 종료 ] : ");
			int input = s.nextInt();
			if(input == 1) {
				System.out.print("이름 : ");
				String name = s.next();
				System.out.print("나이 : ");
				int age = s.nextInt();
				System.out.print("주소 : ");
				String addr = s.next();
				Human human = new Human(name, age, addr);
				list.add(human);
			} else if(input == 2) {
				for(int i=0; i<list.size();	i++) {
					Human human = list.get(i); // 나랑 여기가 다름
					System.out.println((i+1) + ". 이름 : " + human.getName() + ", 나이 : " + human.getAge() + ", 주소 : " + human.getAddr());
				}
			} else if(input == 3) {
				System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
				String delName = s.next();
				boolean searchFlg = false; // 이름 찾으면 true로 변경
				for(int i=0; i<list.size(); i++) {
					Human human = list.get(i);
					if(delName.equals(human.getName())) {
						searchFlg = true;
						list.remove(i);
						i--; // 삭제 후에 인덱스가 땡겨지기 때문에 i를 줄여줘야 함
						System.out.println("삭제되었습니다.");
					}
				}
				if(!searchFlg) { // searchFlg == false
					System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
				}
				
			} else if(input == 4) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4 중에 선택해주세요.");
			}
			System.out.println("---------------------------------------");
		}
		
		
	}
}
