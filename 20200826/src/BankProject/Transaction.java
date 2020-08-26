package BankProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// 거래내역 클래스 
public class Transaction {
	private String transactionDate; // 거래일 
	private String transactionTime; // 거래시간
	private String kind;  // 구분(입금 또는 출금)   tkind = "출금" kind "입금?
	private long amount;  // 거래금액
	private long balance; // 잔고
	private Calendar cal;
	private SimpleDateFormat dateformat;
	// 거래내역 
	public Transaction(String kind , long amount , long balance) {
		super();
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
		cal = Calendar.getInstance();
		
		dateformat = new SimpleDateFormat("yyyy년 MM월dd일");
		transactionDate = dateformat.format(cal.getTime());
		cal = Calendar.getInstance();
		dateformat = new SimpleDateFormat("HH시mm분");
		transactionTime = dateformat.format(cal.getTime());
	}
	// 시간
	public Calendar getCal() {
		return cal;
	}
	// 시간 
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
