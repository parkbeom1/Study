package exInterface;

public class CalcTest {
	public static void main(String[] args) {
		// new �Ҽ��ִ°� CompleteCalc �ۿ� ���� 
		Calc calc = new CompleteCalc();
		int n1 = 10;
		int n2 = 2;
		
//		calc.  �������̽��� ��ĳ�����ϰ� ���� �����ؾ߸��ϴ°͵���
			// �����Ҽ��ִ� 
		
		calc.add(n1, n2);
		calc.divide(n1, n2);
		calc.substract(n1, n2);
		calc.divide(n1, n2);
		
//		calc.showinfo();  �� ĳ���� �� �ڽĸ޼ҵ带 �����Ҽ����� 
		
	}
}
