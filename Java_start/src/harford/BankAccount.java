package harford;

public class BankAccount {

	private String accountNumber;
	private String ownerName;
	private double balance;
	
	
	BankAccount(String accountNumber, String ownerName) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = 0.0;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setOwnerName(String newName) {
		if(newName != null && !newName.equals("")) {
			this.ownerName = newName;			
		} else {
			System.out.println("유효하지 않은 이름입니다.");
		}
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println(amount + "원이 입금되었습니다. 현재 잔액 : " + getBalance() + "원");
		} else {
			System.out.println("입금액은 0보다 커야 합니다.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && balance >= amount) {
			this.balance -= amount;
			System.out.println(amount + "원이 출금되었습니다. 현재 잔액 : " + getBalance() + "원");
		} else if(amount < 0) {
			System.out.println("출금액은 0보다 커야 합니다.");
		} else if(balance < amount) {
			System.out.println("잔액이 부족합니다. (현재 잔액 : " + getBalance() + "원)");
		}
	}
	
	public void displayAccountInfo() {
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("예금주 : " + ownerName);
		System.out.println("잔액 : " + balance + "원");
	}
	
	
}
