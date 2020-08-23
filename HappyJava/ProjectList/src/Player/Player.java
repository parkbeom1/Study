package Player;

public class Player {
	
	private PlayerLevel level;
	// level ������ advanced  super beginn �� �ü��ִ�.
	
	
	public Player() { // �÷��̾� ������
		// �ʱⰪ Beginner 
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void setLevel(PlayerLevel level) {
		this.level = level;
	}
	
	// ������ 
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
	
}
