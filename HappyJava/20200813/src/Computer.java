import java.util.Scanner;

public class Computer {
	
	static Scanner sc = new Scanner(System.in);
	
	static String ComputerPower;
	public static void main(String[] args) {
	System.out.println("���� [1.on] [2.off]");
	Test_0002_MainBody.powerOnOff(Integer.parseInt(sc.nextLine())); 
								// int power ���°��� ���� �Է��Ҽ��ְ� �ߴ�.
	System.out.println(ComputerPower);
	Computer com = new Computer();

	while(true) {		
		switch(com.displayMenu()) {
		case 1 : com.calculator(); // ����
			break;
		case 2 :com.memo(); // �޸��� 
			break;
		case 3 :com.powerSaving(); // �������
			break;
		case 4 : System.out.println("��ǻ�� ����");
			ComputerPower = Test_0002_MainBody.powerOnOff(2);
			// return; // main ����
			// ���α׷� ���� ����
		}
	}
}
//////////////////////////////////////////////////////////////////////////////////	
	
	
	// ��ǻ�� ȭ�� �޴�
	int displayMenu() {
		System.out.println("*************");
		System.out.println("****��ǻ�� ���****");
		System.out.println("1. ����");
		System.out.println();
		System.out.println("2. �޸���");
		System.out.println();
		System.out.println("3. �������");
		System.out.println();
		System.out.println("4. ��ǻ�� ����");	
		int menu = 0;	
		do {
			try {
				menu = Integer.parseInt(sc.nextLine());
				if(menu >= 1 && menu <= 4) {
					break;
				} else {
					// 1���� �۰ų� 4���� ū�� ���α׷����� ����(x)
					// ���� ���� ���ڴ�(���� ����� ����)
					// System.out.println("�߸��Է�");
					throw new Exception("�޴����ù�ȣ�� �߸��Ǿ����ϴ�."); // ����ó�� ����
				}	
			} catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("�޴� ���� ���� �߻�");
				System.out.println("�޴� 1~4������ �Է�");
			}
		} while(true);
	
	return menu;
	///////////////////////////////////////////////////////////////////////////	
}
	// ���� ���
	void powerSaving() {
		System.out.println("������尡 �Ǿ����ϴ�.");
		System.out.println("1. ������� ����  2. ��ǻ�� ����");
		switch(Integer.parseInt(sc.nextLine())) {
		case 1 : System.out.println("������尡 �����Ǿ����ϴ�.");
		break;
		case 2 : System.out.println("��ǻ�� ����");
		ComputerPower = Test_0002_MainBody.powerOnOff(2);
		}
	}	
	
	// �����
	void calculator() {
		System.out.println("�� , ������ , �� ������� �Է��ϼ���.(�� �����ڴ� +,-,*,%�� ����ϼ���");
	
		int result = 0;
		int num1 = Integer.parseInt(sc.nextLine());
		String operator = sc.nextLine();
		int num2 = Integer.parseInt(sc.nextLine());
		sc.close();
		
		while(true) {
			switch(operator) {
			case "+" : result = num1 + num2;
				break;
			case "-" : result = num1 - num2;
				break;
			case "*" : result = num1 * num2; 
				break;
			case "%" : result = num1 % num2; 
				break;
			default : System.out.println("�����ڸ� �߸� �Է��Ͽ����ϴ�.");
			}
		System.out.printf("������ : %d  %s  %d = %d ", num1, operator, num2, result);	
	  }	
	}
	
	// �޸���
	String input_v;
	public void memo() {
		while(true) {
			
			System.out.println("[1] �Է�  [2] ���");
			int a = Integer.parseInt(sc.nextLine());
			if(a == 1) {
				System.out.println("���� �Է��ϼ���");
				input_v = sc.nextLine(); // �Է½�
			} else if(a == 2) { // ��½� 
				System.out.println(input_v);
			} else {
				System.out.println("�ٽ� �Է� �ϼ���.");
			}	
		}
	}
	public void println() {
		System.out.println("�Է��ϼ���.");
		input_v = sc.nextLine();
		System.out.println("�ڷΰ���");
	}
	public void printOut() {
		System.out.println("��� �Ͻðڽ��ϱ� ? >> [1 : ��][2 : �ƴϿ�]");
		int a= Integer.parseInt(sc.nextLine());
		if(a == 1) {
			System.out.println(input_v);
		} else {
			System.out.println("�ڷΰ���");
		}
	}
}
