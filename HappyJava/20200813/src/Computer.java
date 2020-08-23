import java.util.Scanner;

public class Computer {
	
	static Scanner sc = new Scanner(System.in);
	
	static String ComputerPower;
	public static void main(String[] args) {
	System.out.println("전원 [1.on] [2.off]");
	Test_0002_MainBody.powerOnOff(Integer.parseInt(sc.nextLine())); 
								// int power 적는곳에 내가 입력할수있게 했다.
	System.out.println(ComputerPower);
	Computer com = new Computer();

	while(true) {		
		switch(com.displayMenu()) {
		case 1 : com.calculator(); // 계산기
			break;
		case 2 :com.memo(); // 메모기능 
			break;
		case 3 :com.powerSaving(); // 절전모드
			break;
		case 4 : System.out.println("컴퓨터 종료");
			ComputerPower = Test_0002_MainBody.powerOnOff(2);
			// return; // main 종료
			// 프로그램 강제 종료
		}
	}
}
//////////////////////////////////////////////////////////////////////////////////	
	
	
	// 컴퓨터 화면 메뉴
	int displayMenu() {
		System.out.println("*************");
		System.out.println("****컴퓨터 기능****");
		System.out.println("1. 계산기");
		System.out.println();
		System.out.println("2. 메모장");
		System.out.println();
		System.out.println("3. 절전모드");
		System.out.println();
		System.out.println("4. 컴퓨터 종료");	
		int menu = 0;	
		do {
			try {
				menu = Integer.parseInt(sc.nextLine());
				if(menu >= 1 && menu <= 4) {
					break;
				} else {
					// 1보다 작거나 4보다 큰값 프로그램적인 오류(x)
					// 나는 오류 보겠다(오류 사용자 강제)
					// System.out.println("잘못입력");
					throw new Exception("메뉴선택번호가 잘못되었습니다."); // 예외처리 던짐
				}	
			} catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("메뉴 선택 문제 발생");
				System.out.println("메뉴 1~4번까지 입력");
			}
		} while(true);
	
	return menu;
	///////////////////////////////////////////////////////////////////////////	
}
	// 절전 모드
	void powerSaving() {
		System.out.println("절전모드가 되었습니다.");
		System.out.println("1. 절전모드 해제  2. 컴퓨터 종료");
		switch(Integer.parseInt(sc.nextLine())) {
		case 1 : System.out.println("절전모드가 해제되었습니다.");
		break;
		case 2 : System.out.println("컴퓨터 종료");
		ComputerPower = Test_0002_MainBody.powerOnOff(2);
		}
	}	
	
	// 계산기능
	void calculator() {
		System.out.println("값 , 연산자 , 값 순서대로 입력하세요.(단 연산자는 +,-,*,%만 사용하세요");
	
		int result = 0;
		int num1 = Integer.parseInt(sc.nextLine());
		String operator = sc.nextLine();
		int num2 = Integer.parseInt(sc.nextLine());
		sc.close();
		
		while(true) {
			switch(operator) {
			case "+" : result = num1 + num2;
				break;
			case "-" : result = num1 - num2;
				break;
			case "*" : result = num1 * num2; 
				break;
			case "%" : result = num1 % num2; 
				break;
			default : System.out.println("연산자를 잘못 입력하였습니다.");
			}
		System.out.printf("연산결과 : %d  %s  %d = %d ", num1, operator, num2, result);	
	  }	
	}
	
	// 메모기능
	String input_v;
	public void memo() {
		while(true) {
			
			System.out.println("[1] 입력  [2] 출력");
			int a = Integer.parseInt(sc.nextLine());
			if(a == 1) {
				System.out.println("값을 입력하세요");
				input_v = sc.nextLine(); // 입력시
			} else if(a == 2) { // 출력시 
				System.out.println(input_v);
			} else {
				System.out.println("다시 입력 하세요.");
			}	
		}
	}
	public void println() {
		System.out.println("입력하세요.");
		input_v = sc.nextLine();
		System.out.println("뒤로가기");
	}
	public void printOut() {
		System.out.println("출력 하시겠습니까 ? >> [1 : 예][2 : 아니오]");
		int a= Integer.parseInt(sc.nextLine());
		if(a == 1) {
			System.out.println(input_v);
		} else {
			System.out.println("뒤로가기");
		}
	}
}
