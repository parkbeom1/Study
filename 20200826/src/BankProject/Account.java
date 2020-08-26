package BankProject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

class Account {
	private String accountNo; // ���¹�ȣ
	private String name; // �����ڸ�
	private long balance; // �ܰ�
	ArrayList<Transaction> transcation = new ArrayList<Transaction>();
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat  dateFormat = new SimpleDateFormat("yyyyMMddHHmm");

	Account(String name,String accountNo) {
		this.name = name;
		this.accountNo = accountNo;
	}
	Account(){}
	// �Ա��ϱ�
	public void deposit(long amount) {	
			
			transcation.add(new Transaction("�Ա�",amount, amount));
			this.balance += amount;
			System.out.println(this.balance);
		}
	// ����ϱ� 
	public void withdraw(long amount) {	
		
			transcation.add(new Transaction("���",amount, amount));
			this.balance -= amount;
			System.out.println(this.balance);
		}
	// �ܰ�Ȯ�� 
	public long getBalance() {
		return this.balance;
	}
	
	
	// �ŷ��������� 
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
		return "[���¹�ȣ] " + this.accountNo + "[�̸�]" + this.name + "[�ܾ�]" + this.balance; 
	}	
}
