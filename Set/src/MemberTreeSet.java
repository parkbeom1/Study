import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
 

public class MemberTreeSet implements Comparable<Member> { // Comparable ���ϱ� ���� �������̽��� ��� �Ѵ� 
															// implements Comparable Comparator<Member>{
	private TreeSet<Member> treeSet;
	
	
	public MemberTreeSet() {
		
		treeSet = new TreeSet<Member>(); 
//		treeSet = new TreeSet<Member>(new Member()); // implements  Comparator<Member> �Ͻ� {
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
		System.out.println(memberId +" ��ȣ�� �������� �ʽ��ϴ�.");
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
	
	// Comparable ���ϱ� ���� �������̽��� ��� �Ѵ� 
		@Override
		public int compareTo(Member member) { // �Ѿ�� �Ű������� ���Ѵ�.
			return (this.memberId - member.memberId); // ����� ��ȯ�ϸ� ������������ ���ĵ�
			// (this.memberId - member.memberId)*(-1); // �������� 
						// �̸����� �����ϰ� ������  this.memberName.compareTo(member.getMemberName()); �̸����� ���ĵ� 
		}
		
		// Comparator �� ��ӹ޾������ compare �� ����
		public int compare(Member member1 , Member member2) {  // ù��° ������ 2��° �Ѿ�� �Ű�����
			
			return (member1.memberId - member2.memberId);
		}
}

