package interface_Ex03;

interface Irepairable { // ~ 할수있는  ( 수리 할수있는 )
	
	
	}
class Unit extends Object {
	int hitpoint;     // 기본 에너지
	final int MAX_HP; // 최대 에너지 
	Unit(int hp) {
		this.MAX_HP = hp;
	}
}

// 지상유닛 
class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(100);
	}
}
// 공중유닛 
class AirUnit2 extends Unit {
	AirUnit2(int hp) {
		super(500);
		
	}
}
// 건물
class CommandCenter  implements Irepairable { // 수리할수 있는 
	
}

class Tank extends GroundUnit implements Irepairable{

	Tank() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}	
	
	public String toString() {
		return "Tank2";
	}
}

class Marin extends GroundUnit {

	Marin() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	public String toString() {
		return "마린";
	}
}
// Scv는 광물도 캐고 치료도 한다. 에너지를 올릴수 있다.
class Scv extends GroundUnit implements Irepairable{
	
	Scv() {
		super(60);
		this.hitpoint = this.MAX_HP;  // final int MAX_HP; 
	}
	public String toString() {
		return "SCV";
	}

// Scv가 가지는 구체화 ,특수화 된 고유한 기능
// repair(수리 하다)
// 기능이니까 함수를 만든다.

// 수리 기능 추가 (scv 와 탱크)	
	
	
	void repair(Tank tank) {  
		if(tank.hitpoint != tank.MAX_HP) { 
			tank.hitpoint += 5; // 5hp 씩 올린다.
		}
	}
	void repair(Scv scv) { // 함수의 이름은 같지만 매개변수를 다르게 함 - 오버로딩
		if(scv.hitpoint != scv.MAX_HP) {
			scv.hitpoint += 5; // 5hp 씩 올린다.
		}
	}
	
	
	// Scv repair 해야하는 Unit 증가하면 함수를 Unit 개수 만큼 .....
	// 고민 : 하나의 함수가 모든 유닛을 치료 할수 있다면 ..
	// 다형성 ,,,, 상속 관계 ,부모타입 , 부모는 자식객체의 주소를 가질수 있다. Parent p = new Children(); .....전자제품
	
	// 우리가 가지고 있는 모든 유닛은  Unit은 repair 대상이 아니다.
	// void repair(Unit unit) {  <- 하지만  모든 유닛은 repair 하지 않는다.  Unit2에 마린이 올수도있어서 말이 안된다. > Marin (x) 
	
	// void repair(GroundUnit unit) {} >> Marine2(x) , Scv(0) Tank2(o)
	// ** CommandCenter 도 수리할수있다.
	// 고민 
	// Marine Tank  Command 연관성이 멀까  내가지금까지 배운건 같은부모면 부모타입으로 받아서 하면되는데 ... 
	// 불빛이 온다 interface 란 녀석이 한줄기 빛을 보낸다. 
	
	// implements Irepairable 상속받으면서  ~할수있는 것들이 연관성을 갖게된다.
	// Scv extends GroundUnit implements Irepairable
	// CommandCenter  implements Irepairable
	
	
	void repair(Irepairable repairunit) { // 부모타입
		// Irepairable 을 구현하고 있는 객체의 주소가 올수 있다. : Irepairable 부모타입 : 자식 타입의 주소를받을수있다. 자식타입(Tank2,CommandCenter.Scv2)
		//repair Tank SCV >> scv.hitpoint += 5; 
		// 하면되는데 repair 방법이 다른데  >> CommandCenter 
		// repairunit >> CommandCenter  이거나 아니거나 구분 처리 한다. 
		
		// Irepairable repairunit >> Tank2
		// repairunit 부모타입은 볼수있는것은 아무것도 >> 그런데 >> hitpoint ,MAX_HP >> 
		// downcasting ->  Tank2 tank : (Tank2)repairUnit; (상위타입을 하위타입으로 강제형변환 한다.)
		// downcasting ->  Scv scv : (Scv)repairUnit; (상위타입을 하위타입으로 강제형변환 한다.)
		
		// 위 코드는 무었이 올지 ... ?  탱크랑 SCV가 같은 공통점이 없을까?
		// TANK2 >> GroundUnit  >> Unit2
		// SCV2 >> GroundUnit >> Unit2
		// 공통점은 : Unit2 구나     
		
		// 또 문제점
		// 그런데  .. CommandCenter 는 유닛이 아니다..
		// 1. 파라미터로 들어온 [주소]가 Unit2 타입이냐 ? 아니냐
		// 2. 충전방법을 2가지로 .... 
		// 3. 연산자 (instanceof ) 너 그 타입이니?
		// void repair (Irepairable repairunit) >> repair(new Tank2())
		// void reapir (Irepairable repairunit) >> repair(new CommandCenter())
		// repairunit >> Tank2  주소 
		// repairunit >> CommandCenter 주소 >> Unit2 타입이니... 
		// POINT : 타입비교 (instanceof)
		if(repairunit instanceof Unit) {
			Unit unit = (Unit) repairunit; // unit >> Tank2 , Scv
			// 이 유닛이 탱크 또는 scv  
			if(unit.hitpoint != unit.MAX_HP) { 
				unit.hitpoint = unit.MAX_HP; // 피를 다 채운다
			}
		} else { // 부모가 유닛타입이 아니다.
			System.out.println("다른 충전 방식을 제공합니다. Unit 타입이 아니니까");
		}
	}
}
public class Ex04_Interface {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marin marine = new Marin();
		Scv scv = new Scv();
		
		// 전투
		tank.hitpoint -= 20;
		System.out.println("탱크가 현재 가지고 있는 hp  : " + tank.hitpoint);
		System.out.println("Scv 수리 요청");
		scv.repair(tank);
		System.out.println("탱크 수리완료  hp  : " + tank.hitpoint);
		
		scv.hitpoint -= 10;
		System.out.println("탱크가 현재 가지고 있는 hp  : " + scv.hitpoint);
		System.out.println("Scv 수리 요청");
		scv.repair(scv);
		System.out.println("탱크 수리완료  hp  : " + scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
	}
}
