package BankProject2;

import java.util.ArrayList;

import BankProject.Transaction;

//계좌는 소유자명, 계좌번호, 잔고로 구성된다.
public class Account {
	private String accountNo; // 계좌번호
	private String name;  // 이름 
	private long balance; // 잔고
	private ArrayList<Transaction> transaction; // 연관관계 (컴포지션-멤버필드선언)
	
	
	// 계좌는 소유자명, 계좌번호, 잔고로 구성된다.
	// 계좌는 입금,출금 기능 과 계좌는 입금,출금 기능이 있다.
	// 계좌에서 잔액의 변화가 있을 때마다 입출금 명세에 기록
	
	public Account(String accountNo,String name) { 
		this.accountNo = accountNo;
		this.name = name;
		transaction = ArrayList<Transaction>();
	}
	// 계좌는 입금 기능  - 반환없다 왜 ? 내가 여기서 확인하면 되니까 
	public deposit(long amount) { // 입금
		this.balance -= 
	}
	// 계좌는 출금기능 
	public withdraw() {
		
	}
	
}