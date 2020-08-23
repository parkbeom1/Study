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
	
	public Product2(int price) { // ��ǰ���� ������ �ִ�.
		this.price = price;
		this.bonuspoint = (int)(price / 10.0); // ���Ű����� 10���� ���� 
	}
}
class Tv2 extends Product2 {
	public Tv2() {
		super(500); 
	}
	public String toString() {
		return "Tv ����";
	}
}
class Radio2 extends Product2 {
	
	public Radio2() {
		super(250); 
	}
	public String toString() {
		return "���� ����";
	}
}
class NoteBook extends Product2 {	
	public NoteBook() {
		super(300); 
	}
	public String toString() {
		return "��Ʈ�� ����";
	}
}
// ������   ��ٱ��ϻ��� (��ٱ��ϴ� �����������ϱ� - ��ٱ��Ͽ� ��� ������ǰ�� ����)
// 
class Buyer2 {
	int money; // �����
	int bonuspoint; // ����Ʈ 
	Product2[] Cart;  // ��ٱ��� = īƮ�� ��´�. 
	int index = 0; // ������ �ε���
	
	public Buyer2(int money,int bonuspoint) {
		this.money = money;
		this.bonuspoint = bonuspoint;
		Cart = new Product2[10]; // 10�������� �������ִ�.
	}
	public Buyer2() {
		this(1000,0); // ����� , ����Ʈ
	}
	
	// �������� ���� ������  ��ǰ�� ��� ��ɵ� ���� �Ͻÿ� 
	public void Buy(Product2 product) {
		if(this.money < product.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		} 
		if(this.index >= 10) {
			System.out.println("�� �̻� ��ǰ�� ������ �����ϴ�.");
			return;
		}
		
		// ��ٱ��Ͽ� ��ǰ����  ��ƺ��� 
		// Product2 product = �ڽİ�ü���� �������� ���� �����ͼ�
		// Cart[] �迭�� ��µ� index++ �ϳ��ϳ��� ��´�.
		Cart[index++] = product; 
		
		// ���� ���� ����
		this.money -= product.price; 
		this.bonuspoint += product.bonuspoint;
		System.out.println("������ ������ : " + product.toString());
		System.out.println("�ܾ�  : " + this.money);
		System.out.println("����Ʈ  : " + this.bonuspoint);
	}
	
	// ���� ( ��ٱ��� )
	// ��ٱ��Ͽ� ��� ���ǵ��� ���� ����ؾ��Ѵ�
	// for���� ���� �迭�� ����Ѵ�. 
	// ������ �Ѿװ� ������ ����� ��� ����Ѵ�.
	
	
	// ���� -�迭���� ������  �� ��� , �� ���� ����Ʈ 
	public void summary() {
		int totalprice = 0;
		int totalbonuspoint = 0;
		String productlist ="";
		
		// ���� ���� ��ǰ���� �ִ� Cart[index] ���� 
		for(int i = 0; i < index; i++) {
			totalprice += Cart[i].price;
			totalbonuspoint += Cart[i].bonuspoint;
			productlist += Cart[i].toString();
		}
		
		System.out.println("*********************");
		System.out.println("������ ���� �Ѿ� : " + totalprice);
		System.out.println("����Ʈ �Ѿ� : " + totalbonuspoint);
		System.out.println("������ ���� ��� : " + productlist);
	}
}
public class Ex13_Inherit_KeyPoint {
	public static void main(String[] args) {
		Buyer2 buyer = new Buyer2(5000,0); // �� �ʱⰪ ���� 
		Tv2 tv = new Tv2();
		Radio2 radio = new Radio2();
		NoteBook  notebook = new NoteBook();
		
		buyer.Buy(tv);
		buyer.Buy(radio);
		buyer.Buy(radio);		
	}
}
