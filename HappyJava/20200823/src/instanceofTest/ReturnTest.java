package instanceofTest;

public class ReturnTest {
	
	
	public static void main(String[] args) {
		
			int a = 10;   
	        abc(a); // a�� ���� �׳� 10�� �Ѱ��ذ��� a�� k�� �����ʴ´�.
	        System.out.println(abc(a));     
	        
		}	    
	    static int abc(int k) { // 20
	    k += 5;    
	    return k;
	    // �Լ� ���ʿ��� ��ȯ��Ų ���� �Լ� �ٱ����� �Ѱ��ִ� ����� �ʿ�
	}
}
