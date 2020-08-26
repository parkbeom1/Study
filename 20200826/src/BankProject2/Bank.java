package BankProject2;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts; // 객체 배열 선언 전역 변수 
	private int totalAccount;
	
	public Bank() {
		accounts = new ArrayList<Account>();
	}
	// 계좌 생성   은행은 계좌를 관리한다. (리턴값이 없다.)
	public void addAccount(String accountNo,String name) {
		accounts.add(new Account(accountNo,name));
	}
	// 리턴값 일치 계좌 객체의 주소값
	 public Account getAccount(String accountNo) {
		 int accountIndex = 0;
		 for(int i = 0; i  < accounts.size(); i++) {
			 if(accounts.get(i).getName().equals(accountNo)) {
				 accountIndex = i;
			 }
		 }
		 return accounts.get(accountIndex);
	 }
	 //  리턴 값 동명이인  계좌 배열 객체의 주소값
	 // 계좌를 찾는다(소유자명으로)  리턴 -> 계좌로 무엇을돌려줘? 내가 구한 계좌주소값을
	 public ArrayList<Account> findAcounts(String name) { // 소유자명으로 검색
		 ArrayList<Account> homoneyAccounts = new ArrayList<Account>();
		 for(Account account : accounts) {
			 if(account.getName().equals(name)) { // 내가 입력한 이름이랑 같으면
				 homoneyAccounts.add(account);
			 }
		 }
		 return homoneyAccounts; //  ArrayList<Account> homoneyAccounts
	 }
	 // 계좌 제목 출력 - 나에게 반환값이 없으므로 그냥 출력만 하면 된다.
	 public void getAccounts() {
		 for(Account account : accounts) {
			 System.out.println(account.toString());
		 }
	 }
	 // 총 계좌 수 : 리턴값을 줘야함  왜 ? 총 계좌수를 알아야 되니까
	 public int tatalAccount() {
		 this.totalAccount = accounts.size(); // 있는 용량 수 
		 return totalAccount;
	 }
}