package interface_Ex03;



class Unit2 {
	int hitpoint;
	final int MAX_HP;
	
	Unit2(int hp) {
		this.MAX_HP = hp;
	}
}

// ��������
class GroundUnit2 extends Unit2 {
	GroundUnit2(int hp) {
		super(100);
	}
}
//�������� 
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
		return "����";
	}
}
// Scv�� ������ ĳ�� ġ�ᵵ �Ѵ�. �������� �ø��� �ִ�.
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
			tank.hitpoint += 5; // 5hp �� �ø���.
		}
	}
	void repair(Scv scv) { // �Լ��� �̸��� ������ �Ű������� �ٸ��� �� - �����ε�
		if(scv.hitpoint != scv.MAX_HP) {
			scv.hitpoint += 5; // 5hp �� �ø���.
		}
	}
	
	void repair(Irepairable Irepairunit) {
		
		if(Irepairunit instanceof Unit) { // Ÿ���� ���� �̸� ?
			Unit unit = (Unit)Irepairunit;
			if(unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP; // ä���.
			}
		} else { // ���� Ÿ���� �ƴϸ� �ٸ� ��������� ���� 
			System.out.println("�ٸ� ���� ����� �����մϴ�. Unit Ÿ���� �ƴϴϱ�");
		}
	}
}
	// ��ĥ���ִ� �͵鸸 �������̽��� ����д�.  repair �� �����ε� �ؼ�
	// �θ� ������ ���� Ÿ���� ��ü�� scv�� �Ǹ� ä���
	// �׷��� ���� ��ü�� �ٸ� ���� ����� ������ 

public class Ex04_Interface_test {
	
	public static void main(String[] args) {
		
	}
}
