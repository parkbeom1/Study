package interfacestudy;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객 우선순위가 높은 고객의 Call 먼저 가져온다");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("업무 숙련도가 높은 상담원에게 먼저 배분한다. ");
	}
	
}
