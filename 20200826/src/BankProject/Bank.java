package BankProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Bank {
	private static int totalAccount; // �Ѱ��¼�
	Account account = new Account();
	ArrayList<Account> accounts = new ArrayList<Account>();
	Scanner sc = new Scanner(System.in);
	int accountIndex = 0; // ���� ��ȸ ?
	
	// �ϳ��� ���� accountIndex 
	Bank() {}
	// ���� ���� 
	public void addAccountNo(String accountNo,String name) {
		accounts.add(new Account(accountNo,name));			
		for(Account acaccounts : accounts) {
			System.out.println(acaccounts.getAccountNo());
		}
		totalAccount++; // ���� ������ �߰� �� 
	}	
	// �� ���¸� ã�´� (���� ��ȣ��) 
	public Account getAccount(String accountNo) {
		for(int i = 0; i < accounts.size(); i++) {
		  String accountNo1 = sc.nextLine();
		  	if(accounts.get(i).getAccountNo() == accountNo1);	  	
		  		accountIndex = i;
		}
		return accounts.get(accountIndex);
	}
	//, Account[] account
	// ���¸� ã�´�.(�����ڸ����� - �������ε� ������ �Ѵ� )
	
	public ArrayList<Account> findAcaccounts(String name) {
		ArrayList<Account> accounts2 = new ArrayList<Account>();
		for(int i = 0; i < accounts.size(); i++) {
			name = sc.nextLine();
			  if(accounts.get(i).getName().equals(name)) {	
				 		accounts2.add(account);	 	
			  	}		  
			}
			  // ���� ã�� �������� ���¹�ȣ 		  		
		return accounts2;
	}
	// ���� ����� ���� 
	public ArrayList<Account> getAcaccounts() {			
		return this.accounts;
	}
	// �� ���¼� 
	public int getTotalAcccount() {
		for(int i = 0; i < accounts.size(); i++) {
				accounts.get(totalAccount);
			}
		return totalAccount;
	}
}
