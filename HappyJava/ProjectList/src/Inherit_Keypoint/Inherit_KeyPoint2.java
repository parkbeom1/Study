package Inherit_Keypoint;

/*
<요구사항>
문제 풀어 보세요 ^^
요구사항
카트 (Cart)
카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개  , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다
계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력
hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart  담는 것을 구현 )  - 제품들이여러개 카트는 하나 
hint) Buyer ..>> summary()  main 함수에서 계산할때
구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다
*/

class Product2 {
	int price;
	int bonuspoint;
	
	Product2(int price) {
		this.price = price;
		this.bonuspoint = (int)(price / 10.0);
	}
}

class Computer2 extends Product2 {
	
	Computer2() {
		super(500);
	}
	public String toString() {
		return "컴퓨터";
	}
}
class Tv2 extends Product2 {
	
	Tv2() {
		super(450);
	}
	public String toString() {
		return "티비";
	}
}
class Radio2 extends Product2 {
	
	Radio2() {
		super(300);
	}
	public String toString() {
		return "라디오";
	}
}

class Buyer2 {
	int money;
	int bonus;
	Product2 Cart[];
	int index = 0;
	
	
	Buyer2(int money,int bonus){
		this.money = money;
		this.bonus = bonus;
		Cart = new Product2[10];
	}
	
	Buyer2(){
		this(5000,0);
	}
	
	public void buy(Product2 product) {
		
		if(this.money < product.price) {
			System.out.println("잔액이 부족합니다.");
		}
		if(this.index >= 10) {
			System.out.println("더이상 담을수없습니다.");
		}
		
		Cart[index++] = product;
		
		this.money -= product.price;
		this.bonus += product.bonuspoint;
		
		System.out.println("구입 물품 " + product.toString());
		System.out.println("내 잔액  " + this.money);
		System.out.println("내 누적 포인트 " + this.bonus);
	}
	
	public void summary() {
		int totalPrice = 0;
		int totalBonous = 0;
		String totalList = "";
		
		for(int i = 0; i < index; i ++) {
			totalPrice += Cart[i].price;
			totalBonous += Cart[i].bonuspoint;
			totalList += Cart[i].toString();
		}
		System.out.println("내 총 구입 목록 " + totalList);
		System.out.println("총 구입 금액 " + totalPrice);
		System.out.println("내 총 누적포인트 " + totalBonous);
	}
}

public class Inherit_KeyPoint2 {
	public static void main(String[] args) {
		Buyer2 buyer = new Buyer2();
		Tv2 tv = new Tv2();
		Radio2 radio = new Radio2();
		Computer2 computer = new Computer2();
		
		buyer.buy(tv);
		buyer.buy(radio);
		buyer.buy(radio);
		buyer.buy(radio);
		buyer.buy(radio);
		buyer.buy(tv);
		buyer.buy(tv);
		buyer.buy(tv);
		buyer.buy(computer);
		buyer.buy(computer);
		buyer.summary();
	}
}