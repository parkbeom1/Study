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
	
	public Product2(int price) { // 제품마다 가격이 있다.
		this.price = price;
		this.bonuspoint = (int)(price / 10.0); // 구매가격의 10프로 적립 
	}
}
class Tv2 extends Product2 {
	public Tv2() {
		super(500); 
	}
	public String toString() {
		return "Tv 구입";
	}
}
class Radio2 extends Product2 {
	
	public Radio2() {
		super(250); 
	}
	public String toString() {
		return "라디오 구입";
	}
}
class NoteBook extends Product2 {	
	public NoteBook() {
		super(300); 
	}
	public String toString() {
		return "노트북 구입";
	}
}
// 구매자   장바구니생성 (장바구니는 가지고있으니까 - 장바구니에 모든 전자제품이 들어간다)
// 
class Buyer2 {
	int money; // 전재산
	int bonuspoint; // 포인트 
	Product2[] Cart;  // 장바구니 = 카트에 담는다. 
	int index = 0; // 각각의 인덱스
	
	public Buyer2(int money,int bonuspoint) {
		this.money = money;
		this.bonuspoint = bonuspoint;
		Cart = new Product2[10]; // 10개까지만 담을수있다.
	}
	public Buyer2() {
		this(1000,0); // 전재산 , 포인트
	}
	
	// 구매자의 구매 행위에  제품을 담는 기능도 포함 하시오 
	public void Buy(Product2 product) {
		if(this.money < product.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		} 
		if(this.index >= 10) {
			System.out.println("더 이상 제품을 담을수 없습니다.");
			return;
		}
		
		// 장바구니에 제품들을  담아보자 
		// Product2 product = 자식객체들의 참조변수 들을 가져와서
		// Cart[] 배열에 담는데 index++ 하나하나씩 담는다.
		Cart[index++] = product; 
		
		// 실제 구매 행위
		this.money -= product.price; 
		this.bonuspoint += product.bonuspoint;
		System.out.println("구매한 물건은 : " + product.toString());
		System.out.println("잔액  : " + this.money);
		System.out.println("포인트  : " + this.bonuspoint);
	}
	
	// 계산대 ( 장바구니 )
	// 장바구니에 담긴 물건들을 이제 계산해야한다
	// for문을 통해 배열을 출력한다. 
	// 물건의 총액과 물건의 목록을 모두 출력한다.
	
	
	// 계산대 -배열에서 꺼내서  총 계산 , 총 물건 리스트 
	public void summary() {
		int totalprice = 0;
		int totalbonuspoint = 0;
		String productlist ="";
		
		// 내가 넣은 제품들이 있는 Cart[index] 까지 
		for(int i = 0; i < index; i++) {
			totalprice += Cart[i].price;
			totalbonuspoint += Cart[i].bonuspoint;
			productlist += Cart[i].toString();
		}
		
		System.out.println("*********************");
		System.out.println("구매한 물건 총액 : " + totalprice);
		System.out.println("포인트 총액 : " + totalbonuspoint);
		System.out.println("구매한 물건 목록 : " + productlist);
	}
}
public class Ex13_Inherit_KeyPoint {
	public static void main(String[] args) {
		Buyer2 buyer = new Buyer2(5000,0); // 돈 초기값 설정 
		Tv2 tv = new Tv2();
		Radio2 radio = new Radio2();
		NoteBook  notebook = new NoteBook();
		
		buyer.Buy(tv);
		buyer.Buy(radio);
		buyer.Buy(radio);		
	}
}
