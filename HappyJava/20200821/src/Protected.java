
/*
	Bird를 상속 받아서 구현 한다.
	Protected : 상속 관계에서 재정의를 해줘도 되고 안해줘도 된다. ( 선택사항 )	
*/
class Bi extends Bird2 {

	// 재정의 해주면 좋겠어 왜 protected 로 받나? default 와 같으니까
	@Override
	protected void moveFast() {
	// 부모쪽의 구현한 것을 불러온다.
	  super.moveFast(); 
	}	
}
class Ostrich extends Bird2 {
	// 구체화 특수화 해준다
	void run() {
		System.out.println("run~~~~~~");
	}
	// 재정의 해서 내가 따로 필요에 따라 구현을 해줄수 있다. 
	// 상속관계에서 재정의 하면 protected를 안쓴다고 해서 문제 되지 않는다.
	@Override
	protected void moveFast() {
		// run하기때문에 빠르다고 볼수있으니 함수 호출
		run(); 
	}
}

public class Protected {
	public static void main(String[] args) {
		Bi b = new Bi();
		b.fly();
		// 재정의 함수 호출 super로 인해 부모의 Flying 호출
		b.moveFast(); 
		Ostrich o = new Ostrich();
		o.run(); 
		// 재정의 함수 호출  run~~~~~~
		o.moveFast(); 
	}
}
