package Collection;

import java.util.ArrayList;

class MyStack  {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) { 
		arrayStack.add(data);  // add�� �Ǹ������� ������ enqueue�Ҷ� ���ָ� �ȴ�.
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("������ ������ϴ�.");
			return null; // ������ null ����
		}
		return arrayStack.remove(len -1); // ������ ���� ,   dequeue�϶��� 0��°���� �����ָ� �ȴ�. 
	}	
}
 public class StackTest {
	 
	 public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("B");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
 }
