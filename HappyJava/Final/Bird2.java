// protected ����


public class Bird2 {
	
	public void fly() { // ���� ��� 
		System.out.println("Flying");
	}
	
	protected void moveFast() { // ���� ������ �ʿ信 ���� ������ 
		fly(); 
	}

	public static void main(String[] args) {
		
	}
}
// �����ڰ� ������� protected �� �ִٴ°�
// ���� ����ϴ� ����� moveFast() �� �ʿ信 ���� ������ ������ ���ھ� 
// ���� �� �𸣰ڴµ� ���� ���� ������ ���ھ� (���ص��ȴ�) - �������� ����
// ���� �ʴ� ���� ������ �ʿ信 ���� ������ �Ҽ��ִ�.