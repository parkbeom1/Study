package Collection;
// ArrayList는  순서에 따라 객체를 지향하고 중복을 허용한다. 

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		
		System.out.println(myList);
		myList.add(1,"D");
		System.out.println(myList);
		myList.removeLast();
		System.out.println(myList);
		
		for(int i = 0; i < myList.size(); i++) {
			String s = myList.get(i);
			System.out.print(s + " ");
		
		}
	}
}
