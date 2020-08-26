package stack;

// �ڷᱸ�� ����� (stack)
// ������� : Array : Object[] stackarr
// ��ġ���� : ����Ǵ� ���� �ִ� ��ġ (index)  
// ��� : push , pop , empty , full

public class MyStack {
	
	private Object[] stackarr; /// ����� 
	private int maxsize; // �ִ� ũ��
	private int top; // �迭�� �ε��� ��  : ��ġ������ ����.
	
	public MyStack(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize];
		top = -1; //�����
	}
	public boolean isEmpty() { // ����ִ� 
		return (top == -1); // -1�̸� ����ִ�. true���� ����
	}
	public boolean full() { // 
		return (top == maxsize-1); // ������������ -1 �ϸ� ž�� ����Ų�Ŷ� ������ �����ڸ��� ����.
	}
	public void push(Object i) { // ������ object Ÿ�� ���� �־�� �ȴ�.
		if(full()) {
			System.out.println("stack full");
			return;
		} else {
			stackarr[++top] = i ; // -1���� 0��° ���� ����Ŵ 
		}
	}	
	public Object pop() { // ��������� 
		Object value = null;
		if(isEmpty()) {
			System.out.println("stack empty");
		} else {
			value = stackarr[top-1]; // �������� top���� �ϳ� ���ش�. �׷��� ������ �������ִ�.
			top--;
		}
		return value;
	}
	
	
}
