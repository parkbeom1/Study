package Player;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("��û ������ �ݴϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� ����");
	}

	@Override
	public void turn() {
		System.out.println("�� �մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****����� �����Դϴ�.****");
	}
}
