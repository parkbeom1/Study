package instanceofTest;

import java.util.Scanner;

class Parent {
	
	private String name;
	private int age;
	public int mommoney;
	Scanner sc;
	
	Parent(String name,int age,int money) {
		this.name = name;
		this.age =age;
		this.mommoney = money;
		sc = new Scanner(System.in);
	}
	public void returnmoney(Child child) {
		this.mommoney -= child.mommoney;
	}
}
class Child extends Parent {
	private int mymoney;
	Child() {
		super("�ڹ�",27,5000);
	}
	public void getmoney() {
		this.mommoney = Integer.parseInt(sc.nextLine());
		this.mymoney += mommoney;
	}
	
	public int getmymoney() {
		return mymoney;
	}
}

public class Instance {
	public static void main(String[] args) {
		Parent p = new Parent("��Ӵ�",50,100000);
		Child c = new Child();
		
		c.getmoney(); //���� �� �Է�
		p.returnmoney(c); //���� ���� ��Ӵ� ��ü�� mommoney �ν��Ͻ� ��ü�� ���̳ʽ�
		
		System.out.println(c.getmymoney()); //�� �ް� �� ���� �� ��
		System.out.println(p.mommoney); //�� �ְ� �� ���� ���� ��
	
//		System.out.println("�ڽİ�ü �ʱ� mymoney:" +c.getmymoney()
//		+ "�ڽİ�ü �ʱ� mommoney:"+c.mommoney); // �����ޱ��� ���� 
//		System.out.println(p.mommoney);
//		System.out.println();
//		System.out.println(" �θ���� �ڽĿ��� �󸶸� �帮�ڽ��ϱ� ?");
//		c.getmoney(); 
//		System.out.printf("�ڽ��� ���� [%d] ",c.getmymoney()); // ���� �ް� �� ���� 
//		System.out.println("�θ�Ե�:" + p.mommoney);
//		System.out.println("�ڽ� ��ü mommoney:" + c.mommoney);
	}
}


