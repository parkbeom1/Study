package ETC;

public class Ex01_Exception {
	public static void main(String[] args) {
		System.out.println("0으로 나눔니다.");
		// 연산 문제가 발생해도 일단 프로그램이 강제로 종료되지 않는다.
		try {
		System.out.println(0/0);
		// 문제가 발생하면 그 문제를 담을수있는 객체(e) 가 자동으로 생성 
		// 컴파일러가 문제에 맞는 객체를 new java.lang.ArithemticException 발생
		// 발생한 문제에 대한 정보를 ArithmeticException 전달한다.
		// 근데 Exception으로 다받을수있는 큰놈으로 쓴다
		// e.printStackTrace 로 예외 내용을 본다.
	} catch(Exception e) { // 예외에 대한 수습 부분 (정보를 알려주는 부분)
		 // 예외에 대한 정보를 알려주지 고치는게 아니다.
		e.printStackTrace(); // 예외의 전체 정보를 보여준다.
		System.out.println(e.getMessage());
	} finally {
		System.out.println("무조건 실행하는 코드");
		}
	}
}
