
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import kr.or.bit.EmpTest;
// Today Point

public class Ex02_ArrayListTest {
	public static void main(String[] args) {
		EmpTest emp = new EmpTest(555,"È«±æµ¿","»ç¿ø");
		
		EmpTest[] arrayemp = { new EmpTest(666,"±èÃ¶Áß","»ç¿ø") 
				, new EmpTest(777,"±èÈ£","»ç¿ø") 
				, new EmpTest(888,"È£ÃÑ","»ç¿ø")};
		
		
		ArrayList<EmpTest[]> arraylist = new ArrayList<EmpTest[]>();
		
		
		for(int i = 0 ; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
				System.out.println(arraylist.get(0));
		}
		System.out.println(arraylist.toString());
		System.out.println(arraylist.contains(100)); // false;
		
		for(Object obj : arraylist) {
			System.out.println(obj);
		}
		Vector vector2 = new Vector();
		List li = new ArrayList(); // List
		li.add(arrayemp);	
		System.out.println(li.toString());
		
		ArrayList alist = new ArrayList();
		alist.add(li);
		alist.add(50);
		alist.add(50);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		System.out.println(alist.toString());
	}
}
