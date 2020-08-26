package stack;

import java.util.Stack;

public class Ex05_Stack_Collection {
	public static void main(String[] args) {
		// JAVA API stack �ڷᱸ�� ����
		
		Stack s = new Stack();
		s.push("A");  // �ִ´�
		s.push("B");
		System.out.println(s.pop()); // ������ ����. ������ B�� ������.
		System.out.println(s.pop()); // ������ ����. ������ A�� ������.
		System.out.println(s.isEmpty()); // Ȥ�� ����ִ� ? 
		
		
		// �츮�� ���� Stack �� ������
		MyStack my = new MyStack(5);
		System.out.println(my.full());
		my.push(10);
		my.push(20);
		my.push(30);
		System.out.println(my.full());
		System.out.println(my.pop()); // return ���� value �� 
		System.out.println(my.pop());
		System.out.println(my.pop());
		
		Stack<Coin> coinbox = new Stack<Coin>();
		
		coinbox.add(new Coin(100));
		coinbox.add(new Coin(50));
		coinbox.add(new Coin(500));
		coinbox.add(new Coin(100));
		
		while(!coinbox.isEmpty()) { // ������������� true 
			Coin coin = coinbox.pop();
			System.out.println("���� : " + coin.getValue() + " ��");
		}	
	}
}
