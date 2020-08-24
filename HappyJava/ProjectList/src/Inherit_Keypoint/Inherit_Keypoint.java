package Inherit_Keypoint;
/*
<요구사항>
제품 , 구매자 가 있다
구매자는 구매행위를 할수있다. 
잔액 - 제품가격 , 포인트 정보를 갱신
Key Point -> 구매자는 매장에 있는 모든 물건을 구입할수있다. <- Key Point
구입가능 물건 3개니까 
구매할수있는 함수도 3개 여야 한다  
하나의 이름 , 중복 코드 제거
모든 제품이 product를 상속(부모)
아까 배운 자식 참조변수 주소값을 부모 참조타입으로
*/

class Product {
	int price;
	int bonuspoint;
	
	Product(int price) {
		this.price = price;
		this.bonuspoint = (int)(price / 10.0);
	}
}

class Computer extends Product {
	
	Computer(){
		super(500);
	}
	public String toString() {
		return "컴퓨터";
	}
}
class Tv extends Product {
	
	Tv(){
		super(400);
	}
	public String toString() {
		return "Tv";
	}
}
class Radio extends Product {
	
	Radio(){
		super(250);
	}
	public String toString() {
		return "라디오";
	}
}

class Buyer {
	int money;
	int bonuspoint;
	
	Buyer(int money , int bonuspoint){
		this.money = money;
		this.bonuspoint = bonuspoint;
	}
	
	public void buy(Product product) {
		
		if(this.money < product.price) {
			System.out.println("잔액이 부족합니다.");
		} else {
			this.money -= product.price;
			this.bonuspoint += product.bonuspoint;
		}
		
		System.out.println("구입 물건은 " + product.toString());
		System.out.println("남은 잔액은 " + this.money);
		System.out.println("누적 포인트는 " + this.bonuspoint);
	}
}
public class Inherit_Keypoint {	
	public static void main(String[] args) {
		Buyer buyer = new Buyer(10000,0);
		Tv tv = new Tv();
		Radio radio = new Radio();
		Computer computer = new Computer();
		
		buyer.buy(tv);
		buyer.buy(radio);
		buyer.buy(computer);
		
	}
}
