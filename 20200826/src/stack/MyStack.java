package stack;

// 자료구조 만들기 (stack)
// 저장공간 : Array : Object[] stackarr
// 위치정보 : 저장되는 값이 있는 위치 (index)  
// 기능 : push , pop , empty , full

public class MyStack {
	
	private Object[] stackarr; /// 저장소 
	private int maxsize; // 최대 크기
	private int top; // 배열의 인덱스 값  : 위치정보로 쓴다.
	
	public MyStack(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize];
		top = -1; //출발점
	}
	public boolean isEmpty() { // 비어있니 
		return (top == -1); // -1이면 비어있다. true값을 리턴
	}
	public boolean full() { // 
		return (top == maxsize-1); // 마지막꺼에서 -1 하면 탑이 가리킨거랑 같으면 놓을자리가 없다.
	}
	public void push(Object i) { // 넣을떄 object 타입 으로 넣어야 된다.
		if(full()) {
			System.out.println("stack full");
			return;
		} else {
			stackarr[++top] = i ; // -1에서 0번째 방을 가리킴 
		}
	}	
	public Object pop() { // 끄집어낼떄도 
		Object value = null;
		if(isEmpty()) {
			System.out.println("stack empty");
		} else {
			value = stackarr[top-1]; // 뽑은다음 top값에 하나 뺴준다. 그래야 이전껄 뽑을수있다.
			top--;
		}
		return value;
	}
	
	
}
