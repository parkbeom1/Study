
class Pbase {
	int p = 100;
}
class Cbase extends Pbase {}
class Dbase extends Pbase {}
public class Inherit_Poly2 {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase);
		// �θ�Ÿ���� ����Ÿ���� �ڽ��� ����Ÿ���� �������δ�.
		Pbase p = cbase;
		Dbase dbase = new Dbase();
		Dbase dbase2 = new Dbase();
		
		p = dbase; 
		// ū�������� ���� ������ ������ ���������Ѵ�. - �ٿ�ĳ���� 
		Cbase c = (Cbase)p; 
		
	}

}
