package interface_Ex03;



class Unit2 {
	int hitpoint;
	final int MAX_HP;
	
	Unit2(int hp) {
		this.MAX_HP = hp;
	}
}

// 지상유닛
class GroundUnit2 extends Unit2 {
	GroundUnit2(int hp) {
		super(100);
	}
}
//공중유닛 
class AirUnit3 extends Unit2 {
	AirUnit3(int hp) {
		super(500);	
	}
}

class CommandCenter2 {
	
}
class Tank2 extends GroundUnit {

	Tank2(int hp) {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}
class Marin2 extends GroundUnit {

	Marin2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	public String toString() {
		return "마린";
	}
}
// Scv는 광물도 캐고 치료도 한다. 에너지를 올릴수 있다.
class Scv2 extends GroundUnit implements Irepairable{
	
	Scv2() {
		super(60);
		this.hitpoint = this.MAX_HP;  // final int MAX_HP; 
	}
	public String toString() {
		return "SCV";
	}
	
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
	
	void repair(Irepairable Irepairunit) {
		
		if(Irepairunit instanceof Unit) { // 타입이 유닛 이면 ?
			Unit unit = (Unit)Irepairunit;
			if(unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP; // 채운다.
			}
		} else { // 유닛 타입이 아니면 다른 충전방식을 택함 
			System.out.println("다른 충전 방식을 제공합니다. Unit 타입이 아니니까");
		}
	}
}
	// 고칠수있는 것들만 인터페이스로 묶어둔다.  repair 를 오버로딩 해서
	// 부모가 유닛의 같은 타입의 객체는 scv로 피를 채우고
	// 그렇지 않은 객체는 다른 충전 방법을 제공함 

public class Ex04_Interface_test {
	
	public static void main(String[] args) {
		
	}
}
