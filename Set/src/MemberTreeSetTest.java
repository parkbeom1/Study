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
	manager.addMember(memberPark2); // �ߺ��� ������� ?  equals , hashcode ���� 
	
	manager.showMember();
	// Member cannot be cast to java.lang.Comparable  Member ���� ���� ���ϴ°� �����ؾ� �Ѵ�. member��  implements Comparable �� ����������Ѵ�.
	}
}
