import java.util.TreeSet;

public class MemberTreeSetTest {
	
	public static void main(String[] args) {
		
		
	MemberTreeSet manager = new MemberTreeSet();
	
	Member memberLee = new Member(100,"Lee");
	Member memberKim = new Member(200,"Kim");
	Member memberPark = new Member(300,"Park");
	Member memberPark2 = new Member(300,"Park");
	
	manager.addMember(memberPark);
	manager.addMember(memberKim);
	manager.addMember(memberLee);
	manager.addMember(memberPark2); // 중복을 넣을경우 ?  equals , hashcode 구현 
	
	manager.showMember();
	// Member cannot be cast to java.lang.Comparable  Member 같은 경우는 비교하는걸 구현해야 한다. member에  implements Comparable 를 구현해줘야한다.
	}
}
