package Player;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	// 템플릿 메소드
	
	// 점프 jump()출력을 많이 해줌 
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i ++) {
			jump(); // 카운트 만큼 점프
		}
		turn();
	}
}
