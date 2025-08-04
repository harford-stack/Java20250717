package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		ArrayList<Human> list = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
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
				System.out.println("---------------------------------------");
				Human human1 = new Human(name, age, addr);
				list.add(human1);
			} else if(input == 2) {
				for(int i=0; i<list.size();	i++) {
					System.out.println((i+1) + ". 이름 : " + list.get(i).getName() + ", 나이 : " + list.get(i).getAge() + ", 주소 : " + list.get(i).getAddr());
				}
			} else if(input == 3) {
				System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
				String delName = s.next();
				for(int i=0; i<list.size(); i++) {
					if(delName.equals(list.get(i).getName())) {
						list.remove(i);
						System.out.println("삭제되었습니다.");
						System.out.println("---------------------------------------");
					} else {
						System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
						System.out.println("---------------------------------------");
						continue;
					}
				}
			} else if(input == 4) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4 중에 선택해주세요.");
				System.out.println("---------------------------------------");
			}
		}

	}

}
