import java.util.Vector;

/*
	�ټ��� �����͸� �ٷ�� ǥ��ȭ�� �������̽��� �����ϰ��ִ� Ŭ����
	
	Collection �������̽� -> List ��� -> ArrayList (���� : �����...)
					   -> Set ��� -> HashSet , TreeSet(���� :...)
    Map �������̽� -> (key,value)�ϳ��� ������ ���� �迭  -> HashMap (����)
    
    1. List (�������ÿ� - �ߺ����o �����ִ�o) : ����(��ȣǥ) ���������� ������ (�ڷ�,��ü)���� >> �迭����
    �����͸� �迭 �濡 ���� �ִ´�. ��ȣǥ �� 0,1,2,3,4 ȫ�浿�� ������
  >> [ȫ�浿][ȫ�浿][ȫ�浿] �ε����� �����Ѵ�.
   
  1.1 Vector(������)   ȭ��� -> ����ȭ ���� (�Ѱ� ȭ���) -> ��Ƽ������ -> ���������� Lock ��ġ�� ������ �־ �����͸� ��ȣ�Ѵ�. -> ������ ���� �ʴ� -> �ڷ��� �����̹��� 
  1.2 ArrayList(�Ź���) �����->  ����ȭ ���� (��Ƽ������ ) -> Lock ��ġ(x) �ʿ信���� -> ���� �켱 (�Ѱ������)  
						  
  ���� �������� ���� Ÿ���� �����͸� ���� �Ҷ��� Array ���� (����) �迭 - ���� ������ �ѹ� �������� �������� ���Ѵ�. 
  int[] arr = new int[5];
  arr[0] = 100; 
  .. �Ǵ� 10���� ���� �ʿ� ���� ���̰ų� �ø�������. 
  int[] arr = {10,20,30};  ��3�� ���� �濡 10,20,30 ���� �ʱ�ȭ 

  	Array 
	1. �迭�� ũ�Ⱑ ���� Car[] cars = {new Car(),new Car()}; // ��2��
	2. ���� ���(index ÷��) ���ȣ ���� : cars[0]... : 0 ... n�� ���� : ������ ���� ��ȣ�� (index) : length -1 ����  ÷�ڰ� 0���� �����ϴϱ�
	3. �ʱ� ���� �Ұ�
	
	�ݱⰡ �Ͼ�� Collection 
	List ����
(Vector , ArrayList) -�������ÿ�
1. �迭�� ũ�⸦ �������� Ȯ���Ҽ��ִ�.(��ҵ� ���� , �ø��°͵� �����ϴ�) :: >> ����� �迭�� ���Ҵ��� �̿��Ѵ�. 
2. ������ �����Ѵ�. �ߺ����� ����Ѵ�. ������ �迭 : index
3. �������� �����������  Array .... 
	
*/
public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ� default �뷮 " + v.capacity()); // �ʱ� 10���� ���� ���� ( ����ִ� �� )
		System.out.println("���� ������ ũ�� : " + v.size());
		v.add("AA"); // (object e) �� ����� �� �������ִ�. 
		v.add("AA");
		v.add(1);
		v.add(2);
		System.out.println("���� ������ ũ�� : " + v.size()); // 4   �����迭�� length �� �Ȱ��� 
		System.out.println(v.toString()); // ������ toString�� �������̵� �Ǿ��־ for�� ������ ���� ����ϵ��� �Ǿ� �ִ�.
		//Array >> length 
		//Collection >> size
		for(int i = 0; i < v.size(); i++) { // ���� ������ �ִ� ũ����� ����.
			System.out.println(v.get(i)); // �����͸� �����ö� get()�Լ��� ����. get(index)���� return  ����arr[index] 
		}
		// ������ for��   ����Ÿ���� objectŸ��
		for(Object obj : v ) {
			System.out.println(obj);
		}
		
		// ���ʸ� >> ���� Ÿ���� ���� >> 
		Vector<String> v2 = new Vector<String>(); // String ���� �� �ִ� �׸�  ������ �迭���� String ���� ���õȴ�. >> ���� ���� �н� 
		v2.add("hello"); // object ���� String ���� ���ڿ��� �����ְ� �� 
		v2.add("Bye");
		v2.add("king");
		for(String str : v2) {
			System.out.println(str);
		}
		////////////////////////////////////////////////////
		Vector v3 = new Vector();
		System.out.println(v3.capacity()); // �ڵ����� 10�� �׸� ����		
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");//
		v3.add("A");// 11��° ���� �ø���.
		System.out.println(v3.capacity()); // 20�� �������� �ø� ( 2��� �ø� )  
		System.out.println(v3.size()); // �����Ͱ� ������ ����ִ� ������ ���� 11�� 
		// �ʿ��ϸ� �ø��� �ʿ������ ���δ�.
		
		
		
	}
}
