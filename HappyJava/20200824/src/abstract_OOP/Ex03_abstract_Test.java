package abstract_OOP;
/*
 추상클래스 : 인터페이스 비교
 인터페이스 : 표준 , 약속 , 규칙 , 규약 등을 만드는 행위
 A라는 사람이 회사를 다니는데 회계업무를 했다.
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
		System.out.println("Madic 이동 " + this.x + "," + this.y);
	}
}
class Madic2 extends Unit2 {
	@Override
	void move1(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Madic 이동 " + this.x + "," + this.y);
	}
}
public class Ex03_abstract_Test {
	public static void main(String[] args) {
		
		// 마린객체 3명을 만들어서 똑같은 좌표로 이동시키시오 -> 배열에 담음
		
		Marin2[] marinlist = {new Marin2() , new Marin2() , new Marin2()};
		// 빠른 for문
		for(Marin2 m : marinlist) {
			m.move1(500, 400);
		}
		
		// 모든 유닛이 똑같은 좌표로 이동시키시오  -> 배열에 담음 
		Unit2[] unitlist = {new Marin2() , new Madic2()};
		for(Unit2 u : unitlist) {
			u.move1(600, 500);
		}
	}
}
