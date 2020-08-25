package Collection;

import java.util.ArrayList;

class MyStack  {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) { 
		arrayStack.add(data);  // add를 맨마지막에 넣으면 enqueue할때 해주면 된다.
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null; // 없으면 null 리턴
		}
		return arrayStack.remove(len -1); // 마지막 삭제 ,   dequeue일때는 0번째에서 꺼내주면 된다. 
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
