package ETC;

import java.io.File;
import java.io.IOException;

public class Ex04_Exception {
	public static void main(String[] args) throws NullPointerException, IOException {
//	File f = new File("C:\\Temp");//  �ڹ� API ���� : ���� Ŭ���� ���� �� ��ο� ������ �ִ��� �׽�Ʈ 
// ������ ������ ������ ����ó���� ����� 		
		File f = new File("C:\\Temp");	
		// �� Ŭ������ ����Ѵٸ� ���ʿ� �̷��� ������ �߻��Ҽ������� ���� ������ ������ġ�� �����ϰ� ���� �����
		ExClass ex = new ExClass("Temp"); 
		
		// ���������°�  - throw() new 
		
		//�׹��� ����ó��
		ExClass ex2 = new ExClass("Temp"); 
	}
}
