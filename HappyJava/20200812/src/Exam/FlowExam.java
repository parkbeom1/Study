package Exam;

import java.util.Scanner;

public class FlowExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("금액을 입력해주세요.");
		int UNIT = 10000; // 화폐단위 10000 , 5000 , 1000 , 500
						  // 100 , 50 , 10 , 5 , 1
		int NUM = 0; // 화폐 매수
		int SW = 0; // 스위칭변수
		
		int MONEY = s.nextInt(); // 입력받은 금액
		
		while(true) {
			NUM =  MONEY/UNIT; // 몫 ; 화폐매수 : 입력 받은 금액을 화폐 단위로 돌려준다.
			System.out.println(UNIT +" 원 "+ NUM +" 개 "); // 출력
			
			if(UNIT <= 1) { // UNIT가 1보다 작거나 같으면
				break;  
			} // if 종료	
			MONEY = MONEY - UNIT * NUM; // 나누어나온 나머지 , 다음 금액의 초기값
			
			if (SW == 0) { // 같은지 값은 == 로 비교 , 문자는 equals 로 비교 
				UNIT = UNIT / 2; // 10000/2 = 5000 .....
				SW = 1;
			} else {
				UNIT = UNIT / 5; // 5000/5 = 1000, .....
				SW = 0;
			} // if
		} // while
	}
}
