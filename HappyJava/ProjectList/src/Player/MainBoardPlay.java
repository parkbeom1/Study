package Player;

public class MainBoardPlay {
	
	public static void main(String[] args) {
		
		
		Player player = new Player();
		// ������ �⺻������ �ʱ��ڷ����Դϴ� �Ҹ���. 
		
		player.play(1);
		
		SuperLevel su = new SuperLevel();
		AdvancedLevel ad = new AdvancedLevel();
		
		// upgradeLevel(Player player);  �ν��Ͻ� ����� �Ҹ��Եȴ� !!!! 
		player.upgradeLevel(ad);
		player.play(2);
		player.upgradeLevel(su);
		player.play(3);
	}
}
