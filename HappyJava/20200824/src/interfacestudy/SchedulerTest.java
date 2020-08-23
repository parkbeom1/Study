package interfacestudy;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담원 상담 방식을 선택하세요");
		System.out.println("R : 한명씩 차례대로");
		System.out.println("L : 대기가 적은 상담원 우선");
		System.out.println("P : 우선순위가 높은 고객 우선 숙련도 높은 상담원");
		
		int ch = System.in.read(); // 읽어들인다.
		
		Scheduler scheduler = null;
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();  // 라운드로빈 매핑 업캐스팅
		} else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		} else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else 
		{
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		// 인터페이스 다형성 
		// 내가 선택한 객체의 업캐스팅하여  주소로 접근하여 호출한다. 
		// 구현은 implements가 할것이다. interface는 JDBC같은 것
		// 어느 조건에서 생성할것인지 
		// 스프링프레임워크 처럼 인터페이스를 하나의 set으로 이루어진 경우가 있어서 
		// 어느쪽의 인터페이스를 선택하냐에 따라 다르다 
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
