
import java.util.ArrayList;
import java.util.Stack;

public class StackTest {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) { 
		arrayStack.add(data); // add를 맨마지막에 넣음 , 큐도 맨마지막에 넣음 
	}	
	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;//없으면 null값 반환 
		}
		return arrayStack.remove(len-1); // 마지막에 넣은걸 꺼냄   , 큐일때는  제로 에서 꺼낸다  	
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
