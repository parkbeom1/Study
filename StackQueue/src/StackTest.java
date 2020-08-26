
import java.util.ArrayList;
import java.util.Stack;

public class StackTest {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) { 
		arrayStack.add(data); // add�� �Ǹ������� ���� , ť�� �Ǹ������� ���� 
	}	
	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;//������ null�� ��ȯ 
		}
		return arrayStack.remove(len-1); // �������� ������ ����   , ť�϶���  ���� ���� ������  	
	}
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
}
