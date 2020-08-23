package StringClass;
/*
	String Ŭ���� (���ڿ�)
	String �� ���� �Լ� ... ���ڿ��� ���� ( �ڸ��� , ��ġ�� )
	subString , replace , split ���� �ִ�.
	String >> static �Լ� + �Ϲ� �Լ�(new �ؼ� ���� �ִ� )
	subString - �κ������� �̾ƿ´�.
*/
public class Ex05_String_Class {
	public static void main(String[] args) {
		String str = ""; //���ڿ��� �ʱ�ȭ null �� ���� Ŭ�����̴ϱ� 
		//����� int ,dobule ó�� ������
		String[] starr = new String[] {"aaa","bbb","ccc"};
		for(String s : starr) {
			System.out.print(s + " ");
		}
		///////////////////////////////////////////////////
		String str1 = "ȫ�浿";
		System.out.println(str1.length()); //3 ���̸�ŭ
		System.out.println(str1.toString()); // ȫ�浿
		System.out.println(str1); // ȫ�浿 �ּҰ��� �� �ȳ��ñ�?
		// object ������ toString�� �������߱� �����̴�.(���� ����ϵ��� �ߴ�) 
		
		// String name = "�����ٶ󸶹ٻ�";
		// String ���������� �޸𸮸� ���µ� char[] �޸𸮸� ����Ѵ�.
		// >> [��][��][��][��][��][��][��]
		//     0  1  2  3  4  5  6
		// class String extends Object(char[]) 
		// ����� String�� ������ִ� Object �� 
		//  char[] �� �����Ű� @override toString() {...} length() }
		
		String str2 = new String("AAA");
		String str3 = "AAA";
		String str4 = "AAA";
		
		System.out.println(str1); 
		System.out.println(str3 == str4); // true ���� �ּҰ��� �����Ѵ�. ��? String�� Ŭ����
		// ������ ? �޸𸮿� ���� ���ڿ��� ������ �����Ѵ�.
		System.out.println(str2 == str3); // false �ٸ� �ּҰ� ���޸𸮿� ������
		
		System.out.println(str2.equals(str3)); // true
		// �ǵ����̸� eqauls �� ����. ���� ���ϴϱ�
		
		// �ͼ���
		String s = "A";
		s += "B";
		s += "C";
		s += "D";
		System.out.println(s);
		// �Ӱ� ���ñ�?  ABCD �� ���´� ��?  ���� �ּҰ��� �����ϸ鼭 ���Կ����ڷ� �������༭ ��µ�
		
		s = "E";
		System.out.println(s); // E�� ��µ� ���ο� �ּҰ� ��ü 
		
	}
}
