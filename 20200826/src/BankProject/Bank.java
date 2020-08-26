package BankProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Bank {
	private static int totalAccount; // 총계좌수
	Account account = new Account();
	ArrayList<Account> accounts = new ArrayList<Account>();
	Scanner sc = new Scanner(System.in);
	int accountIndex = 0; // 계좌 조회 ?
	
	// 하나의 계좌 accountIndex 
	Bank() {}
	// 계좌 생성 
	public void addAccountNo(String accountNo,String name) {
		accounts.add(new Account(accountNo,name));			
		for(Account acaccounts : accounts) {
			System.out.println(acaccounts.getAccountNo());
		}
		totalAccount++; // 계좌 생성시 추가 됨 
	}	
	// 내 계좌를 찾는다 (계좌 번호로) 
	public Account getAccount(String accountNo) {
		for(int i = 0; i < accounts.size(); i++) {
		  String accountNo1 = sc.nextLine();
		  	if(accounts.get(i).getAccountNo() == accountNo1);	  	
		  		accountIndex = i;
		}
		return accounts.get(accountIndex);
	}
	//, Account[] account
	// 계좌를 찾는다.(소유자명으로 - 동명이인도 나오게 한다 )
	
	public ArrayList<Account> findAcaccounts(String name) {
		ArrayList<Account> accounts2 = new ArrayList<Account>();
		for(int i = 0; i < accounts.size(); i++) {
			name = sc.nextLine();
			  if(accounts.get(i).getName().equals(name)) {	
				 		accounts2.add(account);	 	
			  	}		  
			}
			  // 내가 찾은 소유자의 계좌번호 		  		
		return accounts2;
	}
	// 계좌 목록을 본다 
	public ArrayList<Account> getAcaccounts() {			
		return this.accounts;
	}
	// 총 계좌수 
	public int getTotalAcccount() {
		for(int i = 0; i < accounts.size(); i++) {
				accounts.get(totalAccount);
			}
		return totalAccount;
	}
}
