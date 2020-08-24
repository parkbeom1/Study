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
		System.out.println("고용형태-정규직<P> 임시적<T>를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s == "P" || s == "p") {
			Permanent p = new Permanent("유관순",225000,5000);
			System.out.println("고용형태 : 정규직 , 이름 "+p.getName() + "급여 " + p.getPay());
		} else if( s =="T" || s == "t") {
			Temporary t = new Temporary("유관순",225000,5000);
			System.out.println("고용형태 : 임시적  이름 : " + t.getName() + "급여 : " + t.getPay());
		}
	}
}
