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
	// 강제로 예외 발생 : 개발자가 임의로 문제를 발생시켜서 강제로 예외를 처리하는 방법
	// 코드 : 예외 객체를 직접 생한하는 것이다. new... 발생 ... 예외 ... 알려.....? throw
	// thow new IOException(); 던질수있다.
	fileDelete();
	
	try {
	copyFiles();
	startInstall();
	// throw new IOException("Install 중에 문제가 발생했어"); // 예외를 던진다.
	} catch (Exception e) {
		System.out.println("예외 메시지 출력 " + e.getMessage());
		return;
	} finally {
		// 강제 실행 블록 예외를 발생해도 실행 , 예외가 발생하지 않아도 실행 ( 왜 ? catch를 벗어나도 실행되게 해준다)
		// 자원 해제...
		fileDelete();
		}
	System.out.println("main end");
	// 함수의 강제 종료 : return;  던질게 없으면 강제종료 있다 하더라도 finally 는 강제로 실행된다.
	}
}
