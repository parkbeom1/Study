package BankProject2;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts; // ��ü �迭 ���� ���� ���� 
	private int totalAccount;
	
	public Bank() {
		accounts = new ArrayList<Account>();
	}
	// ���� ����   ������ ���¸� �����Ѵ�. (���ϰ��� ����.)
	public void addAccount(String accountNo,String name) {
		accounts.add(new Account(accountNo,name));
	}
	// ���ϰ� ��ġ ���� ��ü�� �ּҰ�
	 public Account getAccount(String accountNo) {
		 int accountIndex = 0;
		 for(int i = 0; i  < accounts.size(); i++) {
			 if(accounts.get(i).getName().equals(accountNo)) {
				 accountIndex = i;
			 }
		 }
		 return accounts.get(accountIndex);
	 }
	 //  ���� �� ��������  ���� �迭 ��ü�� �ּҰ�
	 // ���¸� ã�´�(�����ڸ�����)  ���� -> ���·� ������������? ���� ���� �����ּҰ���
	 public ArrayList<Account> findAcounts(String name) { // �����ڸ����� �˻�
		 ArrayList<Account> homoneyAccounts = new ArrayList<Account>();
		 for(Account account : accounts) {
			 if(account.getName().equals(name)) { // ���� �Է��� �̸��̶� ������
				 homoneyAccounts.add(account);
			 }
		 }
		 return homoneyAccounts; //  ArrayList<Account> homoneyAccounts
	 }
	 // ���� ���� ��� - ������ ��ȯ���� �����Ƿ� �׳� ��¸� �ϸ� �ȴ�.
	 public void getAccounts() {
		 for(Account account : accounts) {
			 System.out.println(account.toString());
		 }
	 }
	 // �� ���� �� : ���ϰ��� �����  �� ? �� ���¼��� �˾ƾ� �Ǵϱ�
	 public int tatalAccount() {
		 this.totalAccount = accounts.size(); // �ִ� �뷮 �� 
		 return totalAccount;
	 }
}