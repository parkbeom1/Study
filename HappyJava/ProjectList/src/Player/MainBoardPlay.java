package Player;

public class MainBoardPlay {
	
	public static void main(String[] args) {
		
		
		Player player = new Player();
		// 생성자 기본생서자 초급자레벨입니다 불린다. 
		
		player.play(1);
		
		SuperLevel su = new SuperLevel();
		AdvancedLevel ad = new AdvancedLevel();
		
		// upgradeLevel(Player player);  인스턴스 멤버가 불리게된다 !!!! 
		player.upgradeLevel(ad);
		player.play(2);
		player.upgradeLevel(su);
		player.play(3);
	}
}
