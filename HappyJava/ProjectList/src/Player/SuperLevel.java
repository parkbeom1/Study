package Player;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빠르게 뜁니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 점프");
	}

	@Override
	public void turn() {
		System.out.println("턴 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****고급자 레벨입니다.****");
	}
}
