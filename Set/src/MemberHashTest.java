
public class MemberHashTest {
	public static void main(String[] args) {
		
		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100,"Lee");
		Member memberKim = new Member(200,"Kim");
		Member memberPark = new Member(300,"Park");
		Member memberPark2 = new Member(300,"Park");
		
		manager.addMember(memberPark);
		manager.addMember(memberKim);
		manager.addMember(memberLee);
		manager.addMember(memberPark2); // 중복을 넣을경우 ?  equals , hashcode 구현 
		
		manager.showMember();
	}
}
