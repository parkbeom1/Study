package interfacestudy;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("�� �켱������ ���� ���� Call ���� �����´�");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���õ��� ���� �������� ���� ����Ѵ�. ");
	}
	
}
