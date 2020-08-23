/*
<요구사항>
제품 , 구매자 가 있다
구매자는 구매행위를 할수있다. 
잔액 - 제품가격 , 포인트 정보를 갱신
Key Point -> 구매자는 매장에 있는 모든 물건을 구입할수있다. <- Key Point
1차
구입가능 물건 3개니까 구매할수있는 함수도 3개 여야 한다  

*/

// 제품의 가격과 보너스포인트 ~은~다 상속받는 각각의 객체 구현 
class Product {
	int price;
	int bonuspoint;
	
	// 제품 가격 과  제품가격의 구매 보너스 포인트 적립율 10프로 
	public Product(int price) {
		this.price = price;
		this.bonuspoint = (int)(price / 10.0); // int 형변환		
	}
	public Product() {}
}
class Audio extends Product {
	public Audio() {
		super(500); // 부모의 생성자를 호출시킨다.
	}
	// Object 클래스의 toString를 재정의해서
	// 리턴값으로 내가 원하는 메소드를 호출하거나 글을 입력할수있다.
	// 예) Audio().toString = Audio() 만 해도 
	@Override
	public String toString() {
		return "오디오 구입";
	}
}
class Computer extends Product {
	public Computer() {
		super(1000); 
	}
	@Override
	public String toString() {
		return "컴퓨터 구입";
	}
}
class Handphone  extends Product {
	public Handphone() {
		super(700); 
	}
	@Override
	public String toString() {
		return "핸드폰 구입";
	}
}

// 코드 개선후 .. 새로운 제품이 들어왔으면
class WashMachine  extends Product {
	public WashMachine() {
		super(1200); 
	}
	@Override
	public String toString() {
		return "세탁기 구입";
	}
}

// 구매자
class Buyer {
	int money = 5000; // 재산
	int bonuspoint; // 보너스포인트
	
	// 구매자의 구매 행위 
	public void audioBuy(Audio audio) {
		if(this.money < audio.price) {
			System.out.println("고객님 잔액이 부족합니다");
			return;
		} else {
			// 실재로 구매행위 구현
			this.money -= audio.price;
			this.bonuspoint += audio.bonuspoint;
			System.out.println("구매한 물건은 " + audio.toString());
		}
	}
	public void computerBuy(Computer computer) {
		if(this.money < computer.price) {
			System.out.println("고객님 잔액이 부족합니다");
			return;
		} else {
			// 실재로 구매행위 구현
			this.money -= computer.price;
			this.bonuspoint += computer.bonuspoint;
			System.out.println("구매한 물건은 " + computer.toString());
		}
	}
	public void handphoneBuy(Handphone handphone) {
		if(this.money < handphone.price) {
			System.out.println("고객님 잔액이 부족합니다");
			return;
		} else {
			// 실재로 구매행위 구현
			this.money -= handphone.price;
			this.bonuspoint += handphone.bonuspoint;
			System.out.println("구매한 물건은 " + handphone.toString());
		}
	}
	public String buyerInfo() {
		return "내 남은 재산은 " + this.money + "내 포인트는 " +this.bonuspoint;
	}
	
	// 2차 코드 
	// 물건이 3개
	// 1차오픈
	// 재형 하와이 휴가
	// 공식 오픈
	// 매장에 제품이 1000개 다른 제품 추가됨 ( 마우스 , 토스) 제품등록 POS 등록 자동화 )
	// 매장에 제품이 전시됨 (1000개....)
	// 1. 매장에서 구매자가 3개 밖에 구매를 못한다. 나머지 997개의 제품을 살수가없다 
	// 왜 ? 구매할수있는 기능이 3개밖에 없으니까 
	
	// 관리자 >> PC방 >> 국내 전산망 >> 개발 서버 접속 
	// End 
	// 변화에 대응하는 코드를....
	// 즐거운 휴가를 보내기 위한 방법 제시
	
	// 개선
	// 제품이 추가 되더라도 구매 행위는 계속
	// 하나의 이름 , 중복 코드 제거
	// 모든 제품이 product를 상속(부모)
	// Product p
	// Audio audio = new Audio();
	// p = audio; // 아까 배운 자식 참조변수 주소값을 부모 참조타입으로 
	// 업캐스팅
	// p.toString() 에 접근이 가능
	
	// 개선코드
	
	// 매개변수를 부모 객체로 받는다. 
	public void Buy(Product product) {
		if(this.money < product.price) {
			System.out.println("고객님 잔액이 부족합니다.");
		} else {
			// 실제 구매 행위
			this.money -= product.price;
			this.bonuspoint += product.bonuspoint;
			System.out.println("구매한 물건은 : " + product.toString());
			System.out.println("-----------");
			System.out.println("남은 재산 : " + this.money);
			System.out.println("내 누적 포인트 : " + this.bonuspoint);
		}
	}
}
public class Ex12_Inherit {
	public static void main(String[] args) {
		// 매장 에서 사는행위 니까 메소드에서 구현
		// 재사용하고 super로 오버라이딩 부모생성자 호출
		Product p = new Product();
		Audio audio = new Audio();
		Computer com = new Computer();
		Handphone phone = new Handphone();
		
		// 구매자는 구매 할수있어야 한다.
		Buyer buyer = new Buyer();
		// Audio audio 호출시 = audio(객체로받음)
		buyer.audioBuy(audio);
		buyer.computerBuy(com);
		buyer.handphoneBuy(phone);
		
		System.out.println(buyer.buyerInfo());
		
		// 코드 개선후 ....
		// 세탁기를 추가했을경우
		WashMachine washmachine = new WashMachine();
		
		// Buy(product product) = 자식 참조변수들이 올수있다.
		// 업캐스팅 
		buyer.Buy(washmachine);

		
	}
}
