package abstract_OOP;

// 게임 : unit(유닛) 
// unit : 질럿 마린 - 공통 기능(이동좌표,이동,멈춘다) : 추상화 ,일반화 
// unit : 이동방법은 다르다 (이동방법은 unit 마다 별도의 .... 구현... 강제성)
// abstract class 이름 { abstract move(); } 

abstract class Unit {
	int x,y; 
	
	void stop() { // 점에 다다르면 멈출수있음
		System.out.println("Unit stop");
	}
	abstract void move(int x,int y); 
		// 자식마다 이동하는방법이 다름 
		// 실행블록이 없으면 추상메소드	
	}

// Tank
class Tank extends Unit {
	// 추상자원은 반드시 구현해야됨
	@Override
	void move(int x, int y) {
		this.x = x; // 좌표를 입력받아 이동시킨다.
		this.y = y;
		System.out.println("Tank 이동 : " + this.x + "," + this.y);
	}
	// Tank만의 특수화 되고 구체화된 기능도 있을것이다. 
	void changemod () { 
		System.out.println("탱크 변환 모드");
	}
	public String toString() {
		return "탱크 이동";
	}	
}
class Marin extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("마린 이동 : " + this.x + "," + this.y);
	}
	// 특수화 구체화
	void stimpack() {
		System.out.println("빨리 공격함");
	}
	public String toString() {
		return "마린 이동";
	}
}

class DropShip extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("마린 이동 : " + this.x + "," + this.y);
	}
	// 특수화 기능 태우고 내린다
	void load() {
		System.out.println("Unit Load....");
	}
	void unload() {
		System.out.println("Unit Unload.....");
	}
	
	public String toString() {
		return "드랍십 이동";
	}
}

class MoveShip extends Unit {
	Unit unit[];
	int x = 555;
	int y = 444;
	int index = 0;
	int totalmove;
	@Override
	void move(int x, int y) {
		unit = new Unit[3];
		this.x = x;
		this.y = y;
	}
	public void threemove(Unit[] unit) {
		for(int i = 0; i < index; i++) {
		}			
	}
}
public class Ex02_abstract_OOP {
	public static void main(String[] args) {
		Tank t = new Tank();
		t.move(50, 50);
		t.stop();
		t.changemod();
		
		Marin m = new Marin();
		m.move(80, 50);
		m.stop();
		m.stimpack();
		
		DropShip d = new DropShip();
		MoveShip mo = new MoveShip();
		
		//1 탱크 3대를 만들고 같은 좌표로 이동시키세요 (555,444)
		Tank[] tanklist = {new Tank() , new Tank() , new Tank()};
		for(Tank tank : tanklist) {
			tank.move(555, 444);
		}
		//2. 여러개의 Unit (Tank1 , Marin1 ,DropShip 1) 를 같은 좌표로 이동 (666,444) 
		Unit[] unitlist = {new Tank() , new Marin() , new DropShip()};
		for(Unit unit : unitlist) {
			unit.move(666, 444);
		}
	}
}
