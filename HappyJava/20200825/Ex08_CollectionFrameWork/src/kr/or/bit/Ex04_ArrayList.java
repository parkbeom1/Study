package kr.or.bit;

import java.util.ArrayList;

class Empdata {
	private String name;
	private int[] numbers;
	private ArrayList elist;
	
	public Empdata() {
		super();
		this.name = "아무개";
		// 사용자 정의타입 , Array , ArrayList >> 처음값을 갖는다 >> 힙에 있는 메모리를 갖는다 
		this.numbers = new int[10];
		this.elist = new ArrayList(); // li 가 들어가게됨 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public ArrayList getElist() {
		return elist; // ArrayList 주소값을 반환 
	}

	public void setElist(ArrayList elist) {
		this.elist = elist;
	}
}
public class Ex04_ArrayList {
	public static void main(String[] args) {
		Empdata empdata = new Empdata();
		System.out.println(empdata.toString());
		System.out.println(empdata.getElist()); // [] 
		
		ArrayList li = new ArrayList();
		li.add(100);
		li.add(200);
		
		empdata.setElist(li);  // ArrayList elist 매개변수에 넣고 리턴값은  elist를 받음 
		System.out.println(empdata.getElist().toString()); // Object가 가지고 있는 toString을 재정의해서 
	}
}
