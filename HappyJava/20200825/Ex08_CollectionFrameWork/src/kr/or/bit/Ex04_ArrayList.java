package kr.or.bit;

import java.util.ArrayList;

class Empdata {
	private String name;
	private int[] numbers;
	private ArrayList elist;
	
	public Empdata() {
		super();
		this.name = "�ƹ���";
		// ����� ����Ÿ�� , Array , ArrayList >> ó������ ���´� >> ���� �ִ� �޸𸮸� ���´� 
		this.numbers = new int[10];
		this.elist = new ArrayList(); // li �� ���Ե� 
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
		return elist; // ArrayList �ּҰ��� ��ȯ 
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
		
		empdata.setElist(li);  // ArrayList elist �Ű������� �ְ� ���ϰ���  elist�� ���� 
		System.out.println(empdata.getElist().toString()); // Object�� ������ �ִ� toString�� �������ؼ� 
	}
}
