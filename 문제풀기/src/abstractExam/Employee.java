package abstractExam;

import java.util.Scanner;

public abstract class Employee {
	private String name;
	private int pay;
	
	public String getName() {
		return name;
	}
	public int getPay() {
		return pay;
	}
	class Permanent extends Employee {
		String name = "";
		int pay = 0;
		int bonus = 0;
		int time = 5;	
		
	    Permanent(String name,int pay,int bonus) {
		  this.name = name;
		  this.pay = pay;
		  this.bonus = bonus;
		}
		@Override
		public int getPay() {
			return pay + bonus;
		}		
	}
	class Temporary extends Employee {
			String name = "";
			int pay = 0;
			int bonus = 0;
			int time = 5;	
		Temporary(String name,int pay, int bonus) {
			this.name = name;
			this.pay = pay;
			this.bonus = bonus;
		}
		@Override
		public int getPay() {		
			return time * pay;
		}
		public void setPay(int pay) {
			this.pay = pay;
		}	
	}
	public static void main(String[] args) {
		System.out.println("�������-������<P> �ӽ���<T>�� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s == "P" || s == "p") {
			Permanent p = new Permanent("������",225000,5000);
			System.out.println("������� : ������ , �̸� "+p.getName() + "�޿� " + p.getPay());
		} else if( s =="T" || s == "t") {
			Temporary t = new Temporary("������",225000,5000);
			System.out.println("������� : �ӽ���  �̸� : " + t.getName() + "�޿� : " + t.getPay());
		}
	}
}
