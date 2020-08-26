package BankProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// �ŷ����� Ŭ���� 
public class Transaction {
	private String transactionDate; // �ŷ��� 
	private String transactionTime; // �ŷ��ð�
	private String kind;  // ����(�Ա� �Ǵ� ���)   tkind = "���" kind "�Ա�?
	private long amount;  // �ŷ��ݾ�
	private long balance; // �ܰ�
	private Calendar cal;
	private SimpleDateFormat dateformat;
	// �ŷ����� 
	public Transaction(String kind , long amount , long balance) {
		super();
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
		cal = Calendar.getInstance();
		
		dateformat = new SimpleDateFormat("yyyy�� MM��dd��");
		transactionDate = dateformat.format(cal.getTime());
		cal = Calendar.getInstance();
		dateformat = new SimpleDateFormat("HH��mm��");
		transactionTime = dateformat.format(cal.getTime());
	}
	// �ð�
	public Calendar getCal() {
		return cal;
	}
	// �ð� 
	public SimpleDateFormat getDateFormat() {
		return dateformat;
	}

	public String getTransactionDate() {
		return transactionDate;
	}
	
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	public String getTransactionTime() {
		return transactionTime;
	}
	
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public long getAmount() {
		return amount;
	}
	
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		
	}
}
