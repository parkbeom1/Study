package Inherit_Keypoint;
/*
<�䱸����>
��ǰ , ������ �� �ִ�
�����ڴ� ���������� �Ҽ��ִ�. 
�ܾ� - ��ǰ���� , ����Ʈ ������ ����
Key Point -> �����ڴ� ���忡 �ִ� ��� ������ �����Ҽ��ִ�. <- Key Point
���԰��� ���� 3���ϱ� 
�����Ҽ��ִ� �Լ��� 3�� ���� �Ѵ�  
�ϳ��� �̸� , �ߺ� �ڵ� ����
��� ��ǰ�� product�� ���(�θ�)
�Ʊ� ��� �ڽ� �������� �ּҰ��� �θ� ����Ÿ������
*/
class Product {
	int price;
	int bonuspoint;
	
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(price / 10.0);
	}
}

class Computer extends Product {
	
	Computer() {
		super(500);
	}
	
	public String toString() {
		return "Computer";
	}
}
class Tv extends Product {
	
	Tv() {
		super(400);
	}
	
	public String toString() {
		return "Tv";
	}
}
class Radio extends Product {
	
	Radio() {
		super(300);
	}
	
	public String toString() {
		return "Radio";
	}
}

class Buyer {
	int money;
	int bonuspoint;
	
	Buyer(int money,int bonuspoint) {
		this.money = money;
		this.bonuspoint = bonuspoint;
	}
	Buyer() {
		this(10000,0);
	}
	public void buy(Product product) {
		
		if(this.money < product.price) {
			System.out.println("�ܾ��� �����մϴ�.");
		} else {
			this.money -= product.price;
			this.bonuspoint += product.bonuspoint;
		}
		System.out.println("���� : " + product.toString());
		System.out.println("�� ���� �ܾ� : " + this.money);
		System.out.println("�� ���� ����Ʈ : " + this.bonuspoint);
	}
}

public class Inherit_Keypoint {	
	public static void main(String[] args) {
		Buyer buyer=  new Buyer();
		Tv tv = new Tv();
		Radio radio = new Radio();
		Computer computer = new Computer();
		
		buyer.buy(tv);
		buyer.buy(radio);
		buyer.buy(computer);
	}
}
