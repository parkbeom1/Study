package BankProject2;

import java.util.ArrayList;

import BankProject.Transaction;

//���´� �����ڸ�, ���¹�ȣ, �ܰ�� �����ȴ�.
public class Account {
	private String accountNo; // ���¹�ȣ
	private String name;  // �̸� 
	private long balance; // �ܰ�
	private ArrayList<Transaction> transaction; // �������� (��������-����ʵ弱��)
	
	
	// ���´� �����ڸ�, ���¹�ȣ, �ܰ�� �����ȴ�.
	// ���´� �Ա�,��� ��� �� ���´� �Ա�,��� ����� �ִ�.
	// ���¿��� �ܾ��� ��ȭ�� ���� ������ ����� ���� ���
	
	public Account(String accountNo,String name) { 
		this.accountNo = accountNo;
		this.name = name;
		transaction = ArrayList<Transaction>();
	}
	// ���´� �Ա� ���  - ��ȯ���� �� ? ���� ���⼭ Ȯ���ϸ� �Ǵϱ� 
	public deposit(long amount) { // �Ա�
		this.balance -= 
	}
	// ���´� ��ݱ�� 
	public withdraw() {
		
	}
	
}