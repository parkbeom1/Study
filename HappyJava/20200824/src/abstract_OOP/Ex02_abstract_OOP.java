package abstract_OOP;

// ���� : unit(����) 
// unit : ���� ���� - ���� ���(�̵���ǥ,�̵�,�����) : �߻�ȭ ,�Ϲ�ȭ 
// unit : �̵������ �ٸ��� (�̵������ unit ���� ������ .... ����... ������)
// abstract class �̸� { abstract move(); } 

abstract class Unit {
	int x,y; 
	
	void stop() { // ���� �ٴٸ��� ���������
		System.out.println("Unit stop");
	}
	abstract void move(int x,int y); 
		// �ڽĸ��� �̵��ϴ¹���� �ٸ� 
		// �������� ������ �߻�޼ҵ�	
	}

// Tank
class Tank extends Unit {
	// �߻��ڿ��� �ݵ�� �����ؾߵ�
	@Override
	void move(int x, int y) {
		this.x = x; // ��ǥ�� �Է¹޾� �̵���Ų��.
		this.y = y;
		System.out.println("Tank �̵� : " + this.x + "," + this.y);
	}
	// Tank���� Ư��ȭ �ǰ� ��üȭ�� ��ɵ� �������̴�. 
	void changemod () { 
		System.out.println("��ũ ��ȯ ���");
	}
	public String toString() {
		return "��ũ �̵�";
	}	
}
class Marin extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("���� �̵� : " + this.x + "," + this.y);
	}
	// Ư��ȭ ��üȭ
	void stimpack() {
		System.out.println("���� ������");
	}
	public String toString() {
		return "���� �̵�";
	}
}

class DropShip extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("���� �̵� : " + this.x + "," + this.y);
	}
	// Ư��ȭ ��� �¿�� ������
	void load() {
		System.out.println("Unit Load....");
	}
	void unload() {
		System.out.println("Unit Unload.....");
	}
	
	public String toString() {
		return "����� �̵�";
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
		
		//1 ��ũ 3�븦 ����� ���� ��ǥ�� �̵���Ű���� (555,444)
		Tank[] tanklist = {new Tank() , new Tank() , new Tank()};
		for(Tank tank : tanklist) {
			tank.move(555, 444);
		}
		//2. �������� Unit (Tank1 , Marin1 ,DropShip 1) �� ���� ��ǥ�� �̵� (666,444) 
		Unit[] unitlist = {new Tank() , new Marin() , new DropShip()};
		for(Unit unit : unitlist) {
			unit.move(666, 444);
		}
	}
}
