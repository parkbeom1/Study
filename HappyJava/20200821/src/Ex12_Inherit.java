/*
<�䱸����>
��ǰ , ������ �� �ִ�
�����ڴ� ���������� �Ҽ��ִ�. 
�ܾ� - ��ǰ���� , ����Ʈ ������ ����
Key Point -> �����ڴ� ���忡 �ִ� ��� ������ �����Ҽ��ִ�. <- Key Point
1��
���԰��� ���� 3���ϱ� �����Ҽ��ִ� �Լ��� 3�� ���� �Ѵ�  

*/

// ��ǰ�� ���ݰ� ���ʽ�����Ʈ ~��~�� ��ӹ޴� ������ ��ü ���� 
class Product {
	int price;
	int bonuspoint;
	
	// ��ǰ ���� ��  ��ǰ������ ���� ���ʽ� ����Ʈ ������ 10���� 
	public Product(int price) {
		this.price = price;
		this.bonuspoint = (int)(price / 10.0); // int ����ȯ		
	}
	public Product() {}
}
class Audio extends Product {
	public Audio() {
		super(500); // �θ��� �����ڸ� ȣ���Ų��.
	}
	// Object Ŭ������ toString�� �������ؼ�
	// ���ϰ����� ���� ���ϴ� �޼ҵ带 ȣ���ϰų� ���� �Է��Ҽ��ִ�.
	// ��) Audio().toString = Audio() �� �ص� 
	@Override
	public String toString() {
		return "����� ����";
	}
}
class Computer extends Product {
	public Computer() {
		super(1000); 
	}
	@Override
	public String toString() {
		return "��ǻ�� ����";
	}
}
class Handphone  extends Product {
	public Handphone() {
		super(700); 
	}
	@Override
	public String toString() {
		return "�ڵ��� ����";
	}
}

// �ڵ� ������ .. ���ο� ��ǰ�� ��������
class WashMachine  extends Product {
	public WashMachine() {
		super(1200); 
	}
	@Override
	public String toString() {
		return "��Ź�� ����";
	}
}

// ������
class Buyer {
	int money = 5000; // ���
	int bonuspoint; // ���ʽ�����Ʈ
	
	// �������� ���� ���� 
	public void audioBuy(Audio audio) {
		if(this.money < audio.price) {
			System.out.println("���� �ܾ��� �����մϴ�");
			return;
		} else {
			// ����� �������� ����
			this.money -= audio.price;
			this.bonuspoint += audio.bonuspoint;
			System.out.println("������ ������ " + audio.toString());
		}
	}
	public void computerBuy(Computer computer) {
		if(this.money < computer.price) {
			System.out.println("���� �ܾ��� �����մϴ�");
			return;
		} else {
			// ����� �������� ����
			this.money -= computer.price;
			this.bonuspoint += computer.bonuspoint;
			System.out.println("������ ������ " + computer.toString());
		}
	}
	public void handphoneBuy(Handphone handphone) {
		if(this.money < handphone.price) {
			System.out.println("���� �ܾ��� �����մϴ�");
			return;
		} else {
			// ����� �������� ����
			this.money -= handphone.price;
			this.bonuspoint += handphone.bonuspoint;
			System.out.println("������ ������ " + handphone.toString());
		}
	}
	public String buyerInfo() {
		return "�� ���� ����� " + this.money + "�� ����Ʈ�� " +this.bonuspoint;
	}
	
	// 2�� �ڵ� 
	// ������ 3��
	// 1������
	// ���� �Ͽ��� �ް�
	// ���� ����
	// ���忡 ��ǰ�� 1000�� �ٸ� ��ǰ �߰��� ( ���콺 , �佺) ��ǰ��� POS ��� �ڵ�ȭ )
	// ���忡 ��ǰ�� ���õ� (1000��....)
	// 1. ���忡�� �����ڰ� 3�� �ۿ� ���Ÿ� ���Ѵ�. ������ 997���� ��ǰ�� ��������� 
	// �� ? �����Ҽ��ִ� ����� 3���ۿ� �����ϱ� 
	
	// ������ >> PC�� >> ���� ����� >> ���� ���� ���� 
	// End 
	// ��ȭ�� �����ϴ� �ڵ带....
	// ��ſ� �ް��� ������ ���� ��� ����
	
	// ����
	// ��ǰ�� �߰� �Ǵ��� ���� ������ ���
	// �ϳ��� �̸� , �ߺ� �ڵ� ����
	// ��� ��ǰ�� product�� ���(�θ�)
	// Product p
	// Audio audio = new Audio();
	// p = audio; // �Ʊ� ��� �ڽ� �������� �ּҰ��� �θ� ����Ÿ������ 
	// ��ĳ����
	// p.toString() �� ������ ����
	
	// �����ڵ�
	
	// �Ű������� �θ� ��ü�� �޴´�. 
	public void Buy(Product product) {
		if(this.money < product.price) {
			System.out.println("���� �ܾ��� �����մϴ�.");
		} else {
			// ���� ���� ����
			this.money -= product.price;
			this.bonuspoint += product.bonuspoint;
			System.out.println("������ ������ : " + product.toString());
			System.out.println("-----------");
			System.out.println("���� ��� : " + this.money);
			System.out.println("�� ���� ����Ʈ : " + this.bonuspoint);
		}
	}
}
public class Ex12_Inherit {
	public static void main(String[] args) {
		// ���� ���� ������� �ϱ� �޼ҵ忡�� ����
		// �����ϰ� super�� �������̵� �θ������ ȣ��
		Product p = new Product();
		Audio audio = new Audio();
		Computer com = new Computer();
		Handphone phone = new Handphone();
		
		// �����ڴ� ���� �Ҽ��־�� �Ѵ�.
		Buyer buyer = new Buyer();
		// Audio audio ȣ��� = audio(��ü�ι���)
		buyer.audioBuy(audio);
		buyer.computerBuy(com);
		buyer.handphoneBuy(phone);
		
		System.out.println(buyer.buyerInfo());
		
		// �ڵ� ������ ....
		// ��Ź�⸦ �߰��������
		WashMachine washmachine = new WashMachine();
		
		// Buy(product product) = �ڽ� ������������ �ü��ִ�.
		// ��ĳ���� 
		buyer.Buy(washmachine);

		
	}
}
