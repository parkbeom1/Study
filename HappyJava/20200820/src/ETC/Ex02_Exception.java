package ETC;

public class Ex02_Exception {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;
		System.out.println("main start");

		try {
		for(int i = 0; i < 10; i++) {
			// if�� ������ �༭ ���ܸ� ó���Ѵ�.
			result = num/(int)(Math.random()*10); // 0 ~ 9
			System.out.println("��� result : " + result + " i ");
			
		}	
	} catch (ArithmeticException e) {
		// ������ �߻��ϸ� ������ �´� ��ü�� �ڵ� �����ǰ� �ּҰ� ����
		// catch(Exception e) >> ������ >> (x)
		// catch(ArithemeticException e) >> ���� �ڵ�(�������� ����)
		// ������ catch >> ���� �� ���� >> ū�� (������ ó��)
		System.out.println("������ �߻� �����ڿ��� ���� �߼�");
		System.out.println("���� : " + e.getMessage());
	} catch (NullPointerException e) {
		// NullPoinerException ó��
	} catch (Exception e) {
		// ���� ����ó�� , null ���ܸ� ������ �������� ó���Ѵ�.
	}
	System.out.println("main end");
	
	}
}
