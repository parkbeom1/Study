package interface_Ex03;

interface Irepairable { // ~ �Ҽ��ִ�  ( ���� �Ҽ��ִ� )
	
	
	}
class Unit extends Object {
	int hitpoint;     // �⺻ ������
	final int MAX_HP; // �ִ� ������ 
	Unit(int hp) {
		this.MAX_HP = hp;
	}
}

// �������� 
class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(100);
	}
}
// �������� 
class AirUnit2 extends Unit {
	AirUnit2(int hp) {
		super(500);
		
	}
}
// �ǹ�
class CommandCenter  implements Irepairable { // �����Ҽ� �ִ� 
	
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
		return "����";
	}
}
// Scv�� ������ ĳ�� ġ�ᵵ �Ѵ�. �������� �ø��� �ִ�.
class Scv extends GroundUnit implements Irepairable{
	
	Scv() {
		super(60);
		this.hitpoint = this.MAX_HP;  // final int MAX_HP; 
	}
	public String toString() {
		return "SCV";
	}

// Scv�� ������ ��üȭ ,Ư��ȭ �� ������ ���
// repair(���� �ϴ�)
// ����̴ϱ� �Լ��� �����.

// ���� ��� �߰� (scv �� ��ũ)	
	
	
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
	
	
	// Scv repair �ؾ��ϴ� Unit �����ϸ� �Լ��� Unit ���� ��ŭ .....
	// ��� : �ϳ��� �Լ��� ��� ������ ġ�� �Ҽ� �ִٸ� ..
	// ������ ,,,, ��� ���� ,�θ�Ÿ�� , �θ�� �ڽİ�ü�� �ּҸ� ������ �ִ�. Parent p = new Children(); .....������ǰ
	
	// �츮�� ������ �ִ� ��� ������  Unit�� repair ����� �ƴϴ�.
	// void repair(Unit unit) {  <- ������  ��� ������ repair ���� �ʴ´�.  Unit2�� ������ �ü����־ ���� �ȵȴ�. > Marin (x) 
	
	// void repair(GroundUnit unit) {} >> Marine2(x) , Scv(0) Tank2(o)
	// ** CommandCenter �� �����Ҽ��ִ�.
	// ��� 
	// Marine Tank  Command �������� �ֱ�  �������ݱ��� ���� �����θ�� �θ�Ÿ������ �޾Ƽ� �ϸ�Ǵµ� ... 
	// �Һ��� �´� interface �� �༮�� ���ٱ� ���� ������. 
	
	// implements Irepairable ��ӹ����鼭  ~�Ҽ��ִ� �͵��� �������� ���Եȴ�.
	// Scv extends GroundUnit implements Irepairable
	// CommandCenter  implements Irepairable
	
	
	void repair(Irepairable repairunit) { // �θ�Ÿ��
		// Irepairable �� �����ϰ� �ִ� ��ü�� �ּҰ� �ü� �ִ�. : Irepairable �θ�Ÿ�� : �ڽ� Ÿ���� �ּҸ��������ִ�. �ڽ�Ÿ��(Tank2,CommandCenter.Scv2)
		//repair Tank SCV >> scv.hitpoint += 5; 
		// �ϸ�Ǵµ� repair ����� �ٸ���  >> CommandCenter 
		// repairunit >> CommandCenter  �̰ų� �ƴϰų� ���� ó�� �Ѵ�. 
		
		// Irepairable repairunit >> Tank2
		// repairunit �θ�Ÿ���� �����ִ°��� �ƹ��͵� >> �׷��� >> hitpoint ,MAX_HP >> 
		// downcasting ->  Tank2 tank : (Tank2)repairUnit; (����Ÿ���� ����Ÿ������ ��������ȯ �Ѵ�.)
		// downcasting ->  Scv scv : (Scv)repairUnit; (����Ÿ���� ����Ÿ������ ��������ȯ �Ѵ�.)
		
		// �� �ڵ�� ������ ���� ... ?  ��ũ�� SCV�� ���� �������� ������?
		// TANK2 >> GroundUnit  >> Unit2
		// SCV2 >> GroundUnit >> Unit2
		// �������� : Unit2 ����     
		
		// �� ������
		// �׷���  .. CommandCenter �� ������ �ƴϴ�..
		// 1. �Ķ���ͷ� ���� [�ּ�]�� Unit2 Ÿ���̳� ? �ƴϳ�
		// 2. ��������� 2������ .... 
		// 3. ������ (instanceof ) �� �� Ÿ���̴�?
		// void repair (Irepairable repairunit) >> repair(new Tank2())
		// void reapir (Irepairable repairunit) >> repair(new CommandCenter())
		// repairunit >> Tank2  �ּ� 
		// repairunit >> CommandCenter �ּ� >> Unit2 Ÿ���̴�... 
		// POINT : Ÿ�Ժ� (instanceof)
		if(repairunit instanceof Unit) {
			Unit unit = (Unit) repairunit; // unit >> Tank2 , Scv
			// �� ������ ��ũ �Ǵ� scv  
			if(unit.hitpoint != unit.MAX_HP) { 
				unit.hitpoint = unit.MAX_HP; // �Ǹ� �� ä���
			}
		} else { // �θ� ����Ÿ���� �ƴϴ�.
			System.out.println("�ٸ� ���� ����� �����մϴ�. Unit Ÿ���� �ƴϴϱ�");
		}
	}
}
public class Ex04_Interface {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marin marine = new Marin();
		Scv scv = new Scv();
		
		// ����
		tank.hitpoint -= 20;
		System.out.println("��ũ�� ���� ������ �ִ� hp  : " + tank.hitpoint);
		System.out.println("Scv ���� ��û");
		scv.repair(tank);
		System.out.println("��ũ �����Ϸ�  hp  : " + tank.hitpoint);
		
		scv.hitpoint -= 10;
		System.out.println("��ũ�� ���� ������ �ִ� hp  : " + scv.hitpoint);
		System.out.println("Scv ���� ��û");
		scv.repair(scv);
		System.out.println("��ũ �����Ϸ�  hp  : " + scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
	}
}
