package Exam;

import java.util.Scanner;

public class FlowExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�ݾ��� �Է����ּ���.");
		int UNIT = 10000; // ȭ����� 10000 , 5000 , 1000 , 500
						  // 100 , 50 , 10 , 5 , 1
		int NUM = 0; // ȭ�� �ż�
		int SW = 0; // ����Ī����
		
		int MONEY = s.nextInt(); // �Է¹��� �ݾ�
		
		while(true) {
			NUM =  MONEY/UNIT; // �� ; ȭ��ż� : �Է� ���� �ݾ��� ȭ�� ������ �����ش�.
			System.out.println(UNIT +" �� "+ NUM +" �� "); // ���
			
			if(UNIT <= 1) { // UNIT�� 1���� �۰ų� ������
				break;  
			} // if ����	
			MONEY = MONEY - UNIT * NUM; // ������� ������ , ���� �ݾ��� �ʱⰪ
			
			if (SW == 0) { // ������ ���� == �� �� , ���ڴ� equals �� �� 
				UNIT = UNIT / 2; // 10000/2 = 5000 .....
				SW = 1;
			} else {
				UNIT = UNIT / 5; // 5000/5 = 1000, .....
				SW = 0;
			} // if
		} // while
	}
}
