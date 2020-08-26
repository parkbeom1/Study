package BankProject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

class Account {
	private String accountNo; // 계좌번호
	private String name; // 소유자명
	private long balance; // 잔고
	ArrayList<Transaction> transcation = new ArrayList<Transaction>();
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat  dateFormat = new SimpleDateFormat("yyyyMMddHHmm");

	Account(String name,String accountNo) {
		this.name = name;
		this.accountNo = accountNo;
	}
	Account(){}
	// 입금하기
	public void deposit(long amount) {	
			
			transcation.add(new Transaction("입금",amount, amount));
			this.balance += amount;
			System.out.println(this.balance);
		}
	// 출금하기 
	public void withdraw(long amount) {	
		
			transcation.add(new Transaction("출금",amount, amount));
			this.balance -= amount;
			System.out.println(this.balance);
		}
	// 잔고확인 
	public long getBalance() {
		return this.balance;
	}
	
	
	// 거래내역보기 
	public ArrayList<Transaction> getTranscation() {
		return transcation;
	
	}
	public String getAccountNo() {
		return this.accountNo;
	
	}
	public String getName() {
		return this.name;
	
	}
	
	public String toString() {
		return "[계좌번호] " + this.accountNo + "[이름]" + this.name + "[잔액]" + this.balance; 
	}	
}
