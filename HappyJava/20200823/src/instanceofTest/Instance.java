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
		super("�ڹ�",27,5000);
	}
	public int getmoney() {
		this.mymoney += returnmoney();
		return mymoney;
	}
	public static void main(String[] args) {
		Parent p = new Parent("��Ӵ�",50,100000);
		Child c = new Child();
		System.out.println(c.mymoney); // �����ޱ��� ���� 
		System.out.println(" �θ���� �ڽĿ��� �󸶸� �帮�ڽ��ϱ� ?");
		p.returnmoney();
		c.getmoney(); 
		System.out.printf("�ڽ��� ���� [%d] ",c.mymoney); // ���� �ް� �� ���� 
	}
}


