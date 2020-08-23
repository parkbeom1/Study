package instanceofTest;

import java.util.Scanner;

class Parent {
	
	private String name;
	private int age;
	private int mommoney;
	Scanner sc;
	
	Parent(String name,int age,int money) {
		this.name = name;
		this.age =age;
		this.mommoney = money;
		sc = new Scanner(System.in);
	}
	public int returnmoney() {
		int returnmoney = sc.nextInt();
		this.mommoney -= returnmoney;
		return returnmoney;
	}
}
class Child extends Parent {
	private int mymoney;
	Child() {
		super("박범",27,5000);
	}
	public int getmoney() {
		this.mymoney += returnmoney();
		return mymoney;
	}
	public static void main(String[] args) {
		Parent p = new Parent("어머니",50,100000);
		Child c = new Child();
		System.out.println(c.mymoney); // 돈을받기전 내돈 
		System.out.println(" 부모님이 자식에게 얼마를 드리겠습니까 ?");
		p.returnmoney();
		c.getmoney(); 
		System.out.printf("자식이 돈은 [%d] ",c.mymoney); // 돈을 받고난 후 내돈 
	}
}


