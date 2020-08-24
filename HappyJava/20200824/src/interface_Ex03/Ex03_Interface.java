package interface_Ex03;
/*
	�߻�Ŭ���� : �������̽� ��
	�������̽� ǥ�� : ��� , ǥ�ؾ� 
	������  ������ ��ü ���� �Ұ���
	�߻�Ŭ������ extends , �������̽��� implements - ���� new ��� ������ ��� �Ұ���
	1.1 �γ��� ������ : �߻�Ŭ����(�ϼ� + �̿ϼ�) , �������̽�(���� �̿ϼ�)
	
	2. ���
	�߻�Ŭ����  extends 
	�������̽� implements �ϼ��Ȱ� ��� �� �����ؾ� �Ѵ�.
	class Car extends abcclass;
	class Car implements abcclass;
	������ �ִ� �ڿ�(�߻�) �� ������ �����ϰ� �Ѵ�.(�߻��ڿ��� ������)
	[ �߻� Ŭ���� : �������̽� �ٸ��� ]
	1.�������̽��� ���߱����� �����ϴ�. 
	����� ����� >> ��� �ʹ� ũ��  >> ��뼺�� ��������. >> �׷��� Ȱ�뵵�� ���� ���������� �������� ����� ���� �ѵ���� ����� 
	>> ��Ƹ�Ƽ� ��� >> �������� �����ִ�. class Test extends Object implements la,lb,lc ; ���߾���� ���� 
	�������̽� �� �������̽��� extends�� �����ϴ�.
	
	 2. �߻�Ŭ������ ���ϻ���� ��Ģ�̴�. (������ ���)
	 3. �߻�Ŭ������ �ϼ��� �ڵ带 ������ �ִ�. (�ϼ��� �ڵ� + �̿ϼ��ڵ�)
	 4. �������̽��� (����� ������ �������� �̿ϼ�(�߻�)�ڿ� 
	 	�������̽��� ����Ʈ���� ���� �ֻ��� �ܰ�
	 	� ������Ʈ�� �����Ҵ� �������....
	 ** ������ (�ʱ�)
	 1. �������̽��� [������] �������� ����(�������̽� �θ�Ÿ��)
	 2. ���� �������� ���� Ŭ������ �ϳ��� �����ִ� ����� �Ѵ�.(���� �θ� ������)
	 3. JAVA API �� ������ �������̽��� �̸� ����� ���Ҵ�. ���� �������� �ʾƵ� ��ģ��.....��� ���
	 4. �������̽��� (~ble) : ���� �ִ� ,�����Ҽ� �ִ� (����)
	 5. ��ü�� ���� �� : ��ü�� ����(������) >> ������
	  	
*/

/*
interface la {
	String point(); // �����ΰ� ���� ��Ӹ� �ִ�. // ����Ҷ��� print ����ϰ� return �� ���ڷ� �ض� 
}
class Test implements la {
	@Override
	public String point() {
		return null;
	}
}
*/
/*
���� ǥ�� >> ���� > ������
Interface  
1. ���� �����θ� ������ ���� �ʴ�. ���� ����� ���� :  ��� 
 �ý��ۿ��� �̵��ϴ� ���� move ��� �̸��� ����ϰ� �̵��ÿ��� ��ǥ�� 2���� ����
  >> ���� >> void move(int x , int y); 
������ �����ǰ� �ؾ� �Ѵ�. ����� ���Ѿ� �Ѵ�. >> ������ >> ������ ���� >> �߻� �޼ҵ� 
>> Ȱ�� >> collection (���� �迭) :
 �ڷᱸ�� >> Vector , �� ArrayList , HashSet , �� HashMap �������� �������̽��� ���� �ϰ� �ִ�.
 
 2. ������� 
  2.1 ���(final) : public static final int VERSION = 1; �������̽��� �����ִ�.
  >> [public static final] int VERSION  []�� �����ؼ� ���´�.
  �����Ϸ��� �˾Ƽ� �ٿ��ش�. ....
  
   interface  {
   		int VERSION=1; [ Default �� �����Ϸ��� public static final ������Ŵ ]
   		
   }
  2.2 �Լ�(method) : public �� ? public abstract void run(); >> [public abstract] void run();
 
 Interface {
 	 int VERSION = 1; [public abstract final] ... default
 	 void run();  // [public abstract] ... default
   	 String move(int x , int y); >> public abstract String move(int x,int y);
 
   �������̽��� ���鶧 ���  
   Interface lable{} 
   Interface label{int NUM=0;}
   Interface label{void run();}
   	
   class Test extends Object implements la,lb,lc {
   		
   }	
*/
interface Ia {
	public static final int AGE = 100;
	String GENDER = "��";
	
	public abstract String print();
	void message(String str);
}
interface Ib {
	public static final int AGE = 10;
	public abstract void info();
	public abstract String val(String s);
}
class Test extends Object implements Ia , Ib {	
	public String print() {
		return null;
	}
	@Override
	public void info() {
		
	}
	@Override
	public String val(String s) {
		return null;
	}
	@Override
	public void message(String str) {
	}
}
public class Ex03_Interface {
	public static void main(String[] args) {
		Test t = new Test();
		Ia ia = t; // ��ĳ����  �θ�� �ڽ�Ÿ���� �ּҸ� ������ �ִ�. (������) 
		System.out.println(ia); 
		ia.message("AA"); // �������ؼ� �����ִ�.
		System.out.println(ia.AGE);
		Ib ib = t;
		System.out.println(ib.AGE);
		
	}
}
