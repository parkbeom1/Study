package interfacestudy;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열로 가져옵니다");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서에 상담원에게 ");
	}
	
}
