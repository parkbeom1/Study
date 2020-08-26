import java.util.HashSet;
import java.util.Iterator;

// set은 순회하면서 꺼낸다 그러면 추가된 순서대로 먼저 출력된다.(오름차순)


public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet <String> set = new HashSet<String>();
		
		set.add("이순신");
		set.add("강감찬");
		set.add("하루살이");
		
		
		Iterator<String> ir = set.iterator(); 
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}
}
