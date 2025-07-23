package day6;

public class TJMember {
	
	String name ;
	int age ;
	String stuNo ; // 20250723 or 0001542 // 수학연산 목적 x, 0으로 시작할 가능성
	int money ;
	static int classMoney ; // 회비
	
	TJMember(String name, int age, String stuNo, int money) {
		this.name = name;
		this.age = age;
		this.stuNo = stuNo;
		this.money = money;
	}
	
	static void test() {
		System.out.println("static 테스트");
	}

}
