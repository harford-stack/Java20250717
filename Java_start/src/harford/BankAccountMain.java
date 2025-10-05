package harford;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--- 1. 계좌 생성 ---");
	    BankAccount myAccount = new BankAccount("111-222-333", "김지훈");
	    myAccount.displayAccountInfo(); // 초기 상태 출력

	    System.out.println("\n--- 2. 입금 테스트 ---");
	    myAccount.deposit(100000);   // 100000원 입금
	    myAccount.deposit(-50000);  // 유효하지 않은 입금 시도
	    myAccount.displayAccountInfo();

	    System.out.println("\n--- 3. 출금 테스트 ---");
	    myAccount.withdraw(30000);   // 30000원 출금
	    myAccount.withdraw(100000);  // 잔액 부족 출금 시도
	    myAccount.withdraw(-10000); // 유효하지 않은 출금 시도
	    myAccount.displayAccountInfo();

	    System.out.println("\n--- 4. 예금주 이름 변경 테스트 ---");
	    myAccount.setOwnerName("하포드"); // 이름 변경
	    myAccount.setOwnerName("");     // 유효하지 않은 이름 변경 시도
	    myAccount.displayAccountInfo();

	    System.out.println("\n--- 5. Getter 메소드 사용 예시 ---");
	    System.out.println("현재 계좌 번호: " + myAccount.getAccountNumber());
	    System.out.println("현재 예금주: " + myAccount.getOwnerName());
	    System.out.println("최종 잔액: " + myAccount.getBalance() + "원");
		
	}

}
