
class Pbase {
	int p = 100;
}
class Cbase extends Pbase {}
class Dbase extends Pbase {}
public class Inherit_Poly2 {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase);
		// 부모타입의 참조타입은 자식의 참조타입을 가질수인다.
		Pbase p = cbase;
		Dbase dbase = new Dbase();
		Dbase dbase2 = new Dbase();
		
		p = dbase; 
		// 큰범위에서 작은 범위로 가려면 명시해줘야한다. - 다운캐스팅 
		Cbase c = (Cbase)p; 
		
	}

}
