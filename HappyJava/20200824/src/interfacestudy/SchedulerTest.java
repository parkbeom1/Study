package interfacestudy;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ���� ��� ����� �����ϼ���");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("P : �켱������ ���� �� �켱 ���õ� ���� ����");
		
		int ch = System.in.read(); // �о���δ�.
		
		Scheduler scheduler = null;
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();  // ����κ� ���� ��ĳ����
		} else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		} else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else 
		{
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		// �������̽� ������ 
		// ���� ������ ��ü�� ��ĳ�����Ͽ�  �ּҷ� �����Ͽ� ȣ���Ѵ�. 
		// ������ implements�� �Ұ��̴�. interface�� JDBC���� ��
		// ��� ���ǿ��� �����Ұ����� 
		// �����������ӿ�ũ ó�� �������̽��� �ϳ��� set���� �̷���� ��찡 �־ 
		// ������� �������̽��� �����ϳĿ� ���� �ٸ��� 
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
