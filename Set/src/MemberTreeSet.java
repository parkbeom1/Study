import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
 

public class MemberTreeSet implements Comparable<Member> { // Comparable 비교하기 위해 인터페이스를 상속 한다 
															// implements Comparable Comparator<Member>{
	private TreeSet<Member> treeSet;
	
	
	public MemberTreeSet() {
		
		treeSet = new TreeSet<Member>(); 
//		treeSet = new TreeSet<Member>(new Member()); // implements  Comparator<Member> 일시 {
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId +" 번호가 존재하지 않습니다.");
		return false;
 	}
	
	public void showMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// Comparable 비교하기 위해 인터페이스를 상속 한다 
		@Override
		public int compareTo(Member member) { // 넘어온 매개변수랑 비교한다.
			return (this.memberId - member.memberId); // 양수로 반환하면 오름차순으로 정렬됨
			// (this.memberId - member.memberId)*(-1); // 내림차순 
						// 이름으로 정렬하고 싶으면  this.memberName.compareTo(member.getMemberName()); 이름으로 정렬됨 
		}
		
		// Comparator 를 상속받았을경우 compare 를 구현
		public int compare(Member member1 , Member member2) {  // 첫번째 변수랑 2번째 넘어온 매개변수
			
			return (member1.memberId - member2.memberId);
		}
}

