package Inherit_Keypoint;

/*
<�䱸����>
���� Ǯ�� ������ ^^
�䱸����
īƮ (Cart)
īƮ���� ���忡 �ִ� ��� ������ǰ�� ���� �� �ִ� 
īƮ�� ũ��� �����Ǿ� �ִ� (10��) : 1��  , 2�� ���� �� �ְ� �ִ� 10������ ���� �� �ִ�
���� ������ ���� �ϸ� ... īƮ�� ��´�
���뿡 ���� ��ü ���
������� �ʿ�
summary() ��� �߰��� �ּ���
����� ������ �����̸� �� �������� ����
�� �����ݾ� ��� ���
hint) īƮ ������ ��� ���� (Buy() �Լ��ȿ��� cart  ��� ���� ���� )  - ��ǰ���̿����� īƮ�� �ϳ� 
hint) Buyer ..>> summary()  main �Լ����� ����Ҷ�
�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�
*/

class Product2 {
	int price;
	int bonuspoint;
	
	Product2(int price){
		this.price = price;
		this.bonuspoint = (int)(price / 10.0);
	}
}
class Computer2 extends Product2 {
	
	Computer2(){
		super(500);
	}
	public String toString() {
		return "��ǻ��";
	}
}
class Tv2 extends Product2 {
	
	Tv2(){
		super(400);
	}
	public String toString() {
		return "Ƽ��";
	}
}
class Radio2 extends Product2 {
	
	Radio2(){
		super(350);
	}
	public String toString() {
		return "����";
	}
}

class Buyer2 {
	int money;
	int bonuspoint;
	Product2 Cart[];
	int index = 0;
	
	Buyer2(int money,int bonuspoint) {
		this.money = money;
		this.bonuspoint = bonuspoint;
		Cart = new Product2[10];
	}
	
	Buyer2(){
		this(10000,0);
	}
	
	public void buy(Product2 product) {
		
		if(this.money  < product.price) {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		if(this.index >= 10) {
			System.out.println("���̻� ��ǰ�� �����������ϴ�.");
		}
		
		// �� ��������
		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		
		Cart[index++] = product;
		System.out.println("������ ������ " + product.toString());
		System.out.println("�� ���� �ܾ��� " + this.money);
		System.out.println("�� ���� ����Ʈ�� " + this.bonuspoint);
	}
	
	public void summary() {
		int totalprice = 0;
		int totalbonuspoint = 0;
		String totalList = "";
		
		for(int i = 0 ; i < index; i ++) {
			totalprice += Cart[i].price;
			totalbonuspoint += Cart[i].bonuspoint;
			totalList += Cart[i].toString();
		}
		System.out.println(" �� ���� ����� " + totalprice);
		System.out.println(" �� ���� ����Ʈ�� " + totalbonuspoint);
		System.out.println("�� ���� ��ǰ�� " + totalList);
	}	
}
public class Inherit_KeyPoint2 {
	public static void main(String[] args) {
		Buyer2 buyer = new Buyer2();
		Tv2 tv = new Tv2();
		Computer2 computer = new Computer2();
		Radio2 radio = new Radio2();
		
		buyer.buy(radio);
		buyer.buy(radio);
		buyer.buy(radio);
		buyer.buy(radio);
		buyer.buy(tv);
		buyer.buy(tv);
		buyer.buy(tv);
		buyer.buy(computer);
		buyer.buy(computer);
		buyer.buy(computer);
		buyer.summary();
	}
}