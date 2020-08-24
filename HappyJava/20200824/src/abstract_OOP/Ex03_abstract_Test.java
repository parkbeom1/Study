package abstract_OOP;
/*
 �߻�Ŭ���� : �������̽� ��
 �������̽� : ǥ�� , ��� , ��Ģ , �Ծ� ���� ����� ����
 A��� ����� ȸ�縦 �ٴϴµ� ȸ������� �ߴ�.
*/

abstract class Unit2 {
	int x = 0;
	int y = 0;	
	abstract void move1(int x,int y);
}

class Marin2 extends Unit2 {
	void move1(int x,int y) {
		this.x = x;
		this.y = y;
		System.out.println("Madic �̵� " + this.x + "," + this.y);
	}
}
class Madic2 extends Unit2 {
	@Override
	void move1(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Madic �̵� " + this.x + "," + this.y);
	}
}
public class Ex03_abstract_Test {
	public static void main(String[] args) {
		
		// ������ü 3���� ���� �Ȱ��� ��ǥ�� �̵���Ű�ÿ� -> �迭�� ����
		
		Marin2[] marinlist = {new Marin2() , new Marin2() , new Marin2()};
		// ���� for��
		for(Marin2 m : marinlist) {
			m.move1(500, 400);
		}
		
		// ��� ������ �Ȱ��� ��ǥ�� �̵���Ű�ÿ�  -> �迭�� ���� 
		Unit2[] unitlist = {new Marin2() , new Madic2()};
		for(Unit2 u : unitlist) {
			u.move1(600, 500);
		}
	}
}
