package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket {
	
	// 가격, 개수에 음수 입력 불가하도록 코딩 // 가격, 개수 입력하는 순간이 너무 많음
	public static int checkNumber(String msg) {
		Scanner s = new Scanner(System.in);
		int input;
		while(true) {
			System.out.println(msg + " : ");
			input = s.nextInt();
			if(input <= 0) {
				System.out.println("음수는 불가능합니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		
		// 과일가게 프로그램
		// 메뉴 1(추가). 과일명, 가격, 개수 추가(map)한 후 list에 담기
		// 메뉴 2(확인). 과일명을 입력받고, 해당 과일명의 가격, 개수 출력
		//		  	   만약 없는 과일명이면 '해당 과일이 존재하지 않습니다.' 출력
		// 메뉴 3(판매). 과일명과 개수를 입력받아서 해당 과일명의 개수에서 차감
		//		  	   'oo개가 판매되었습니다.' 출력
		//		 	   만약 없는 과일명이면 '해당 과일이 존재하지 않습니다.' 출력
		// 메뉴 -1(종료). '종료되었습니다.' 출력 후 프로그램 종료
		
		// 개선 1.
//		 - 1번메뉴에서 과일을 추가할 때,
//		   이미 있는 과일이면 가격을 물어보지 말고
//		   개수만 물어본 후 해당 개수를 기존개수에 더하기
//
//		개선 2. 
//		 - 가격, 개수에 음수 입력 불가능하도록
//		   + 가격은 100단위(1500 ok, 1310 x)
//		 - 판매 개수가 원래 개수보다 많을 경우
//		   '판매 가능한 개수는 oo개 입니다' 출력 후 메뉴로 이동
//		개선 3.
//		 - 메뉴 4번 추가
//		   과일명을 입력받고 가격을 수정할 수 있도록
//		   ex) 사과 입력 후 수정할 가격 2000을 입력하면
//		       사과의 가격(price)이 2000으로 변경
		
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		System.out.println("======= 과일가게 프로그램 =======");
		while(true) {
			System.out.print("[(1) 추가 (2)확인 (3)판매 (4)가격수정 (-1)종료 ] : ");
			int menu = s.nextInt();
			
			if(menu == 1) {
				HashMap<String, Object> fruit = new HashMap<>();
				System.out.print("과일명 : ");
				String fruitName = s.next();
				boolean flag = false;
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).get("fruitName").equals(fruitName)) {
						flag = true;
						System.out.print("이미 판매중인 과일입니다, 추가할 개수를 입력하세요 : ");
						int addCount = s.nextInt();
						list.get(i).put("count", (int) list.get(i).get("count") + addCount);
					}
				}
				if(!flag) {
					fruit.put("fruitName", fruitName);
					
//					System.out.print("가격 : ");
//					int price = s.nextInt();
					fruit.put("price", checkNumber("가격"));
					
//					System.out.print("개수 : ");
//					int count = s.nextInt();
					fruit.put("count", checkNumber("개수"));
					
					list.add(fruit);
				}
			} else if(menu == 2) {
				System.out.print("검색할 과일명 : ");
				String fruitName = s.next();
				boolean searchFlg = false;
				for(int i=0; i<list.size(); i++) {
					// list.get(i) => HashMap으로 만든 map
					if(list.get(i).get("fruitName").equals(fruitName)) {
						searchFlg = true;
						System.out.print("가격 : " + list.get(i).get("price") + ", ");
						System.out.println("개수 : " + list.get(i).get("count") + "개");
					}
				}
				if(!searchFlg) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				}
			} else if(menu == 3) {
				System.out.print("판매할 과일명 : ");
				String fruitName = s.next();
				boolean searchFlg = false;
				for(int i=0; i<list.size(); i++) {
					// list.get(i) => HashMap으로 만든 map
					if(list.get(i).get("fruitName").equals(fruitName)) {
						searchFlg = true;
						System.out.print("판매할 개수 : ");
						int sellCount = s.nextInt();
						if((int) list.get(i).get("count") > sellCount) {
//						(int) list.get(i).get("count") - sellCount;
							list.get(i).put("count", (int) list.get(i).get("count") - sellCount);
						} else {
							System.out.println("판매 가능한 개수는 최대 " + list.get(i).get("count") + "개 입니다.");
							break;
						}
						
					}
				}
				if(!searchFlg) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				}
			} else if(menu == 4) {
				HashMap<String, Object> fruit = new HashMap<>();
				System.out.print("가격 수정할 과일명 : ");
				String fruitName = s.next();
				boolean searchFlg = false;
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).get("fruitName").equals(fruitName)) {
						searchFlg = true;
						System.out.print("수정할 가격 : ");
						int modPrice = s.nextInt();
						list.get(i).put("price", modPrice);
					}
				}
				if(!searchFlg) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				}
				
			} else if(menu == -1) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				
			}
			
		}

	}

}
