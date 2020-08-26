package BankProject;

public class BankMain {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.addAccountNo("1111", "¹Ú¹ü");
		bank.addAccountNo("2222", "ÀÌ");
		bank.addAccountNo("3333", "»ó");
		bank.addAccountNo("4444", "ÇØ");
		bank.addAccountNo("5555", "¾¾");
		bank.addAccountNo("6666", "Â¯");
		
		System.out.println(bank);
		bank.getAccount("6666");
		bank.getAcaccounts();
		bank.getTotalAcccount();
		
		System.out.println(bank.findAcaccounts("¹Ú¹ü"));
		// °èÁÂ ¸ñ·Ï
		bank.getAcaccounts();
		// °³ÁÂ ÃÑ °³¼ö
		bank.getTotalAcccount(); // totalaccount
	}
}
