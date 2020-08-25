package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		System.out.println(set); // set은 순서대로 출력되지 않는다. 중복을 허용하지 않는다.
		// 김유신 , 강감찬 , 이순신  
		
		ArrayList<String> set2 = new ArrayList<String>();
		
		Iterator ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}
}
