package stack;

import java.util.Stack;

public class Ex05_Stack_Collection {
	public static void main(String[] args) {
		// JAVA API stack 자료구조 제공
		
		Stack s = new Stack();
		s.push("A");  // 넣는다
		s.push("B");
		System.out.println(s.pop()); // 끄집어 낸다. 마지막 B가 빠진다.
		System.out.println(s.pop()); // 끄집어 낸다. 마지막 A가 빠진다.
		System.out.println(s.isEmpty()); // 혹시 비어있니 ? 
		
		
		// 우리가 직접 Stack 를 만들어보자
		MyStack my = new MyStack(5);
		System.out.println(my.full());
		my.push(10);
		my.push(20);
		my.push(30);
		System.out.println(my.full());
		System.out.println(my.pop()); // return 값이 value 다 
		System.out.println(my.pop());
		System.out.println(my.pop());
		
		Stack<Coin> coinbox = new Stack<Coin>();
		
		coinbox.add(new Coin(100));
		coinbox.add(new Coin(50));
		coinbox.add(new Coin(500));
		coinbox.add(new Coin(100));
		
		while(!coinbox.isEmpty()) { // 비어있지않으면 true 
			Coin coin = coinbox.pop();
			System.out.println("동전 : " + coin.getValue() + " 원");
		}	
	}
}
