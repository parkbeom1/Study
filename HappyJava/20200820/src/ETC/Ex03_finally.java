package ETC;

public class Ex03_finally {
	
	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("File DELETE");
	}
	public static void main(String[] args) {
	// copyFiles();
	// startInstall();
	// ������ ���� �߻� : �����ڰ� ���Ƿ� ������ �߻����Ѽ� ������ ���ܸ� ó���ϴ� ���
	// �ڵ� : ���� ��ü�� ���� �����ϴ� ���̴�. new... �߻� ... ���� ... �˷�.....? throw
	// thow new IOException(); �������ִ�.
	fileDelete();
	
	try {
	copyFiles();
	startInstall();
	// throw new IOException("Install �߿� ������ �߻��߾�"); // ���ܸ� ������.
	} catch (Exception e) {
		System.out.println("���� �޽��� ��� " + e.getMessage());
		return;
	} finally {
		// ���� ���� ��� ���ܸ� �߻��ص� ���� , ���ܰ� �߻����� �ʾƵ� ���� ( �� ? catch�� ����� ����ǰ� ���ش�)
		// �ڿ� ����...
		fileDelete();
		}
	System.out.println("main end");
	// �Լ��� ���� ���� : return;  ������ ������ �������� �ִ� �ϴ��� finally �� ������ ����ȴ�.
	}
}
