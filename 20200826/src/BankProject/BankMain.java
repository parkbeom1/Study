package BankProject;

public class BankMain {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.addAccountNo("1111", "�ڹ�");
		bank.addAccountNo("2222", "��");
		bank.addAccountNo("3333", "��");
		bank.addAccountNo("4444", "��");
		bank.addAccountNo("5555", "��");
		bank.addAccountNo("6666", "¯");
		
		System.out.println(bank);
		bank.getAccount("6666");
		bank.getAcaccounts();
		bank.getTotalAcccount();
		
		System.out.println(bank.findAcaccounts("�ڹ�"));
		// ���� ���
		bank.getAcaccounts();
		// ���� �� ����
		bank.getTotalAcccount(); // totalaccount
	}
}
