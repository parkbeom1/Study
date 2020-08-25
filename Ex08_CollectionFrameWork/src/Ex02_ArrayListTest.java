import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

// Today Point
public class Ex02_ArrayListTest {
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList(10);
		
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		arraylist.add(400);
		
		for(int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
				System.out.println(arraylist.get(0));
		}
		System.out.println(arraylist.toString());
		arraylist.add(0, 100);
		System.out.println(arraylist.toString());
		System.out.println(arraylist.contains(100)); // true
		System.out.println(arraylist.toString());
		
		System.out.println(arraylist.isEmpty()); // 비어있지 않다
				
		arraylist.remove(1);
		System.out.println(arraylist.toString());
		
		Object obj = arraylist.remove(0);
		System.out.println(obj); // 100
		
		for(Object obj1 : arraylist) {
			System.out.println(obj1);
		}
		
		List li3 = new ArrayList(); // 업캐스팅
		li3.add("가");
		li3.add("나");
		li3.add("다");
		
		List li4 = li3.subList(0, 1);
		System.out.println(li4.toString()); // 가
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(10);
		alist.add(7);
		alist.add(46);
		
		System.out.println(alist.toString());
		Object obj2 = alist.remove(2);
		System.out.println(obj2); // 10가져옴
		
		System.out.println(obj2.toString());
		
		System.out.println(alist.toString()); // 40 , 7 , 1 , 50
		 
		Collections.reverse(alist);
	
			ArrayList<Object> alist2 = new ArrayList();
		
	
	}
}
