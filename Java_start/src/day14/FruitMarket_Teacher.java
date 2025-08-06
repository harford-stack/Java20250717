package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket_Teacher {
	
	public static int checkNumber(String msg) {
		Scanner s = new Scanner(System.in);
		int input;
		while(true) {
			System.out.print(msg + " : ");
			input = s.nextInt();
			
			// 가격 100단위 인지 체크하는 조건문
			if(msg.equals("가격")) {
				if(input % 100 != 0) {
					System.out.println("가격은 100단위로 입력해 주세요 ");
					continue;
				}
			}
			
			// 숫자 0 혹은 음수인지 체크하는 조건문
			if(input <= 0) {
				System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}
		
		return input;
	}
	
	public static HashMap<String, Object> searchFruit(ArrayList<HashMap<String, Object>> list, String fruitName) {
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> getFruit = list.get(i);
			if(getFruit.get("fruitName").equals(fruitName)) {
				return getFruit;
			}
		}
		// 최초에는 위 for문 실행 안됨
		return null;
	}

	public static void main(String[] args) {
		
		// * 과일가게 프로그램 *
				// 메뉴 1(추가). 과일명, 가격, 개수 추가(map)한 후 list에 담기
				// 메뉴 2(확인). 과일명을 입력받고, 해당 과일명의 가격, 개수 출력
				// 		       만약 없는 과일명이면 '해당 과일이 존재하지 않습니다' 출력
				// 메뉴 3(판매). 과일명과 개수를 입력받아서 해당 과일명의 개수에서 차감
				//             'oo개가 판매되었습니다.' 출력
				//			   만약 없는 과일명이면 '해당 과일이 존재하지 않습니다' 출력
				// 메뉴 -1(종료). '종료되었습니다' 출력 후 프로그램 종료
		
//		개선 1.
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
//		 - 메뉴 4번 추가(메뉴명 : 가격 수정)
//		   과일명을 입력받고 가격을 수정할 수 있도록
//		   ex) 사과 입력 후 수정할 가격 2000을 입력하면
//		       사과의 가격(price)이 2000으로 변경
				
				Scanner s = new Scanner(System.in);
				ArrayList<HashMap<String, Object>> list = new ArrayList<>();
				System.out.println("======= 과일가게 프로그램 =======");
				while(true) {
					System.out.print("[ (1)추가 (2)확인 (3)판매 (4)가격수정 (-1)종료 ] : ");
					int menu = s.nextInt();
					
					if(menu == 1) {
						System.out.print("과일명 : ");
						String fruitName = s.next();
						HashMap<String, Object> fruit = searchFruit(list, fruitName);
//						System.out.println(fruit);
						
						if(fruit == null) {
							// 과일 map 만들고 list에 추가
							fruit = new HashMap<String, Object>(); // 처음에 null 상태인 fruit에 put을 할 수 없으니 새로 생성
							fruit.put("fruitName", fruitName);							
							fruit.put("price", checkNumber("가격"));							
							fruit.put("count", checkNumber("개수"));							
							list.add(fruit);
							
						} else {
							//fruit에 있는 과일 개수만 변경(기존거에 입력한거 추가)
							int sum = (int) fruit.get("count") + checkNumber("개수");
							fruit.put("count", sum);
						}
						
//						HashMap<String, Object> fruit = new HashMap<>();
//						System.out.print("과일명 : ");
//						String fruitName = s.next();
//						boolean searchFlg = false;
//						for(int i=0; i<list.size(); i++) {
							// list.get(i) => HashMap으로 만든 map
//							HashMap<String, Object> getFruit = list.get(i);
//							if(getFruit.get("fruitName").equals(fruitName)) {
//								searchFlg = true;
//								System.out.print("개수 : ");
//								int count = checkNumber("개수");
//								int sum = (int) getFruit.get("count") + count;
//								getFruit.put("count", sum);
//							} 
//						}
						
//						if(!searchFlg) {
//							fruit.put("fruitName", fruitName);
//							
//							System.out.print("가격 : ");
//							int price = s.nextInt();
//							fruit.put("price", checkNumber("가격"));
//							
//							System.out.print("개수 : ");
//							int count = s.nextInt();
//							fruit.put("count", checkNumber("개수"));
//							
//							list.add(fruit);
//						}
						
					} else if(menu == 2) {
						System.out.print("검색할 과일명 : ");
						String fruitName = s.next();
						HashMap<String, Object> fruit = searchFruit(list, fruitName);
						if(fruit == null) {
							System.out.println("해당 과일이 존재하지 않습니다.");
						} else {
							System.out.print("가격 : " + fruit.get("price") + "원, ");
							System.out.println("개수 : " + fruit.get("count") + "개");
						}
//						boolean searchFlg = false;
//						for(int i=0; i<list.size(); i++) {
//							// list.get(i) => HashMap으로 만든 map
//							if(list.get(i).get("fruitName").equals(fruitName)) {
//								searchFlg = true;
//								System.out.print("가격 : " + list.get(i).get("price") + "원, ");
//								System.out.println("개수 : " + list.get(i).get("count") + "개");
//							}
//						}
//						if(!searchFlg) { // searchFlg == false
//							System.out.println("해당 과일이 존재하지 않습니다.");
//						}
						
					} else if(menu == 3) {
						System.out.print("판매할 과일명 : ");
						String fruitName = s.next();
						HashMap<String, Object> fruit = searchFruit(list, fruitName);
						if(fruit == null) {
							System.out.println("해당 과일이 존재하지 않습니다.");
						} else {
							int sellCount = checkNumber("판매할 개수");
							int currentCount = (int) fruit.get("count");
							if(currentCount < sellCount) {
								System.out.println("현재 판매 가능한 개수는 " + currentCount + "개 입니다.");
								break;
							}
							fruit.put("count", (int) fruit.get("count") - sellCount);
						}
						
//						boolean searchFlg = false;
//						for(int i=0; i<list.size(); i++) {
//							// list.get(i) => HashMap으로 만든 map
//							if(list.get(i).get("fruitName").equals(fruitName)) {
//								searchFlg = true;
//								int sellCount = checkNumber("판매할 개수");
//								int currentCount = (int) list.get(i).get("count");
//								if(currentCount < sellCount) {
//									System.out.println("현재 판매 가능한 개수는 " + currentCount + "개 입니다.");
//									break;
//								}
//								list.get(i).put("count", (int) list.get(i).get("count") - sellCount);
//								
//							}
//						}
//						if(!searchFlg) { // searchFlg == false
//							System.out.println("해당 과일이 존재하지 않습니다.");
//						}
					} else if(menu == 4) {
						System.out.print("가격 수정할 과일명 : ");
						String fruitName = s.next();
						HashMap<String, Object> fruit = searchFruit(list, fruitName);
						if(fruit == null) {
							System.out.println("해당 과일이 존재하지 않습니다.");
						} else {
							int newPrice = checkNumber("수정할 가격 입력");
							fruit.put("price", newPrice);
						}
//						boolean searchFlg = false;
//						for(int i=0; i<list.size(); i++) {
//							HashMap<String, Object> map = list.get(i);
//							if(map.get("fruitName").equals(fruitName)) {
//								System.out.println("수정할 가격 입력 : ");
//								int newPrice = checkNumber("수정할 가격 입력");
//								map.put("price", newPrice);
//							}
//						}
//						if(!searchFlg) { // searchFlg == false
//							System.out.println("해당 과일이 존재하지 않습니다.");
//						}
					} else if(menu == -1) {
						System.out.println("종료되었습니다.");
						break;
					} else {
						
					}
					
				}

	}

}
