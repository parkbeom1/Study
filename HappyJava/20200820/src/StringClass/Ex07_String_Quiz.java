package StringClass;

import java.util.Scanner;

public class Ex07_String_Quiz {
	// 14자리 맞는지 확인
	
	public static boolean juminLengthCheck(String jumin) {

		// 어자피 값만 주면 되니까 리턴에서 검사하면 되자나 ? 
		// 그리고 jumin은 String타입이니까 String 메소드 쓸수있자나?
		return ((jumin.length() == 14) ? true : false); // 삼항 연산자 
	}
	
	// 입력받은 주민번호 전체 자리에서 '-' 뒤의 숫자가 1~4인지 확인 
	// 문자값은 정수로 바꾸려면 IntegerParseInt 해야한다.
	public static boolean juminBackFirstCheck(String jumin) {
		//940114-1
		 int jumin2= Integer.parseInt(jumin.substring(7,8)); // 7번째자리부터 (8-1) 7번째까지
		 if(jumin2 >= 1 && jumin2 <=4) {
			 return true;
		 }
		 return false;
	}
	// 뒤의 숫자로 남자인지 여자인지   1,3 남자  2,4 여자
	public static String juminSexCheck(String jumin) {
		int jumin2 = Integer.parseInt(jumin.substring(7,8));
		return jumin2 % 2 == 0 ? "여자" : "남자";
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("주민번호를 입력해주세요. 예(123456-1234567) ");
		String jumin = sc.nextLine();
			// 리턴타입이 boolean이어도 호출시킬때 syso
			if(!juminLengthCheck(jumin)) {
				System.out.println("14자리로 입력하세요.");
			} else if(!juminBackFirstCheck(jumin)) {
				System.out.println("뒷번호 첫번째는 1~4자리로 시작해야합니다.");
			} else {
				System.out.println("성별은 : " + juminSexCheck(jumin) + " 입니다.");
				break;
			}
		}		
	}
}
