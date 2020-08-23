package Player;

public class Player {
	
	private PlayerLevel level;
	// level 변수에 advanced  super beginn 이 올수있다.
	
	
	public Player() { // 플레이어 생성시
		// 초기값 Beginner 
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void setLevel(PlayerLevel level) {
		this.level = level;
	}
	
	// 다형성 
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
	
}
