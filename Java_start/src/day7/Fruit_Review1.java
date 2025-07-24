package day7;

public class Fruit_Review1 {
	
	private String name;
	private int price;
	
	Fruit_Review1(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void sell(int x) {
		System.out.println(x + "개를 판매했습니다.");
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int p) {
		String status = "A"; // 임의로 권한 값 지정 // A를 M 또는 C로 바꿔보면서 Main클래스에서 변화 확인하기
							 // A는 관리자, M은 매니저, C는 일반 사용자
		if(status.equals("A")) {
			if(p <= 0) {
				System.out.println("가격이 0원 이하입니다. 다시 확인바랍니다..");	// -금액 넣어서 변화 확인하기			
			} else {
				this.price = p;			
				System.out.println("가격이 수정되었습니다.");				
			}
		} else {
			System.out.println("가격 수정 권한이 없습니다.");
		}
	}

}
