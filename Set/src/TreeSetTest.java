import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<String> treeset = new TreeSet<String>();
		
		treeset.add("홍길동");
		treeset.add("이순신");
		treeset.add("강감찬");
		
		for(String str : treeset) {
			System.out.println(str);  // ㄱㄴㅇ 순으로  기본적으로 오름차순으로 구현됨 , 내림차순은 구현해야한다.
 		}
		
	}
}
