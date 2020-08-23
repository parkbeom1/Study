package StringClass;

import java.util.Scanner;

public class Ex07_String_Quiz {
	// 14�ڸ� �´��� Ȯ��
	
	public static boolean juminLengthCheck(String jumin) {

		// ������ ���� �ָ� �Ǵϱ� ���Ͽ��� �˻��ϸ� ���ڳ� ? 
		// �׸��� jumin�� StringŸ���̴ϱ� String �޼ҵ� �������ڳ�?
		return ((jumin.length() == 14) ? true : false); // ���� ������ 
	}
	
	// �Է¹��� �ֹι�ȣ ��ü �ڸ����� '-' ���� ���ڰ� 1~4���� Ȯ�� 
	// ���ڰ��� ������ �ٲٷ��� IntegerParseInt �ؾ��Ѵ�.
	public static boolean juminBackFirstCheck(String jumin) {
		//940114-1
		 int jumin2= Integer.parseInt(jumin.substring(7,8)); // 7��°�ڸ����� (8-1) 7��°����
		 if(jumin2 >= 1 && jumin2 <=4) {
			 return true;
		 }
		 return false;
	}
	// ���� ���ڷ� �������� ��������   1,3 ����  2,4 ����
	public static String juminSexCheck(String jumin) {
		int jumin2 = Integer.parseInt(jumin.substring(7,8));
		return jumin2 % 2 == 0 ? "����" : "����";
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("�ֹι�ȣ�� �Է����ּ���. ��(123456-1234567) ");
		String jumin = sc.nextLine();
			// ����Ÿ���� boolean�̾ ȣ���ų�� syso
			if(!juminLengthCheck(jumin)) {
				System.out.println("14�ڸ��� �Է��ϼ���.");
			} else if(!juminBackFirstCheck(jumin)) {
				System.out.println("�޹�ȣ ù��°�� 1~4�ڸ��� �����ؾ��մϴ�.");
			} else {
				System.out.println("������ : " + juminSexCheck(jumin) + " �Դϴ�.");
				break;
			}
		}		
	}
}
