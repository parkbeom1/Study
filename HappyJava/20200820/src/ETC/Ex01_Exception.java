package ETC;

public class Ex01_Exception {
	public static void main(String[] args) {
		System.out.println("0���� �����ϴ�.");
		// ���� ������ �߻��ص� �ϴ� ���α׷��� ������ ������� �ʴ´�.
		try {
		System.out.println(0/0);
		// ������ �߻��ϸ� �� ������ �������ִ� ��ü(e) �� �ڵ����� ���� 
		// �����Ϸ��� ������ �´� ��ü�� new java.lang.ArithemticException �߻�
		// �߻��� ������ ���� ������ ArithmeticException �����Ѵ�.
		// �ٵ� Exception���� �ٹ������ִ� ū������ ����
		// e.printStackTrace �� ���� ������ ����.
	} catch(Exception e) { // ���ܿ� ���� ���� �κ� (������ �˷��ִ� �κ�)
		 // ���ܿ� ���� ������ �˷����� ��ġ�°� �ƴϴ�.
		e.printStackTrace(); // ������ ��ü ������ �����ش�.
		System.out.println(e.getMessage());
	} finally {
		System.out.println("������ �����ϴ� �ڵ�");
		}
	}
}
