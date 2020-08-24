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
		super("박범",27,5000);
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
		Parent p = new Parent("어머니",50,100000);
		Child c = new Child();
		
		c.getmoney(); //받을 돈 입력
		p.returnmoney(c); //받을 돈을 어머니 객체의 mommoney 인스턴스 객체에 마이너스
		
		System.out.println(c.getmymoney()); //돈 받고 난 뒤의 내 돈
		System.out.println(p.mommoney); //돈 주고 난 뒤의 엄마 돈
	
//		System.out.println("자식객체 초기 mymoney:" +c.getmymoney()
//		+ "자식객체 초기 mommoney:"+c.mommoney); // 돈을받기전 내돈 
//		System.out.println(p.mommoney);
//		System.out.println();
//		System.out.println(" 부모님이 자식에게 얼마를 드리겠습니까 ?");
//		c.getmoney(); 
//		System.out.printf("자식이 돈은 [%d] ",c.getmymoney()); // 돈을 받고난 후 내돈 
//		System.out.println("부모님돈:" + p.mommoney);
//		System.out.println("자식 객체 mommoney:" + c.mommoney);
	}
}


