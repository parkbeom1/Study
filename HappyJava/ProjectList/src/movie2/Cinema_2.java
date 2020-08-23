package movie2;

import java.util.Scanner;

public class Cinema_2 {
	private Scanner sc;
	private String[][] seat;
	private int[][] ticketNumber;
	
	private int row; // 행
	private int col; // 열 
	
	public Cinema_2() {
		sc = new Scanner(System.in);
		
		seat = new String[6][6];
		ticketNumber = new int[6][6];
	}
	
	
	// 좌석 초기화
	
	public void initseat(){
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "[" + (i + 1) + "-" + (j + 1) + "]";
			}
		}
	}
	
	
	// 예매
	// 첫 실행 메소드
	public void execution() {
		loop_1 : while(true) {
			int initnumber = showReservationMenu();
			switch(initnumber) {
			case 1:
				showSeat(); // 좌석 현황 출력
				selectSeat(); // 좌석 입력
				break loop_1; // 위 메소드에서 break 빠져나가고 나서 이 case 를 빠져나가면
							  // 다시 while문 실행 
			case 2:
				reservationinfo(); // 예매정보 조회
				execution(); 
				break loop_1;
			case 3:
				cancelReservation(); // 예매 취소
				execution();
				break loop_1;
			case 4:
				showSeat(); // 좌석조회
				break loop_1;
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default :
				System.out.println("잘못된 번호를 입력하였습니다.");
				break;
			}
		}
	}
	// 메뉴 출력 
	// 이 메소드를 호출하면 되돌려주는값은 initnumber
	public int showReservationMenu() {
		System.out.println("영화 예매 시스템");
		System.out.println("************");
		System.out.println("1. 예매하기");
		System.out.println("2. 예매조회");
		System.out.println("3. 예매취소");
		System.out.println("4. 좌석현황");
		System.out.println("5. 종 료 ");
		int initnumber = Integer.parseInt(sc.nextLine());
		return initnumber;
	}
	
	// 좌석 현황 출력 
	public void showSeat() {
		System.out.println("***좌석현황***");
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]); 
			}
			System.out.println();
		}
		System.out.println("********************");
	}
	// 좌석 입력(예약 가능 여부 확인)
	private void selectSeat() {
		System.out.print("행>");
		 row = Integer.parseInt(sc.nextLine()) - 1;  // 행 입력 
		 System.out.print("열>");
		 col = Integer.parseInt(sc.nextLine()) - 1; // 열 입력
		 
		 if (seat[row][col].equals("[" + (row + 1) +"-"+ (col + 1)+"]")) {
			 System.out.println("예약 가능 좌석 입니다.");
			 reservation();   
		 } else {
			 System.out.println("이미 예약되었습니다.");
			 System.out.println("다른 좌석을 선택해주세요.");
			 showSeat(); // 좌석 현황 출력 
			 selectSeat(); // 내가 선택한 좌석 출력 
		 }
	}
	// 예매 가능합니다. 예매하시겠습니까 ? 에서 
	// 위 리턴 값에 따라
	// 예 	  case 1 : 예매완료  출력 , 좌석/예매 번호 출력
	// 아니오    case 2 : 다시 selectSeat으로 돌아가기
	// 초기화면 case 0 : 다시 showReservationMenu 로 돌아가기
	private void reservation() {
		int reservationMenuNum = reservationMenu(); // 예매 가능 시 매뉴 로 부터 리턴값을 받아옴 
		switch(reservationMenuNum) {
		case 1:
			assignSeatNumber(); // 예매좌석 배정
			assignTickerNumber(); // 예매번호 배정
			System.out.println("예매가 완료되었습니다.");
			printSeatNumber(); // 예매 좌석 출력
			printTicketNumber(); // 예매 번호 출력
			System.out.println("감사합니다.");
			execution(); // 첫 화면으로 다시 돌아간다.
		case 2:
			System.out.println("초기 화면으로 돌아갑니다.");
			 selectSeat(); // 다시 좌석 
			break;
		case 0:
			showReservationMenu();
			break;
		default :
			System.out.println("잘못된 번호를 입력하셨습니다.");
			break;
		}
	}	
	// 예매 가능 시 매뉴
	public int reservationMenu() {
		System.out.println("예매 가능합니다. 예매하시겠습니까 ?");
		System.out.println("1 . 예  2. 아니오  , 초기화면 (0)중 하나를 입력해주세요.");
		int reservationMenuNum = Integer.parseInt(sc.nextLine());
		return reservationMenuNum;
	}
	// 예매 좌석 배정
	private void assignSeatNumber() {
		seat[row][col] = "[예매]";
	}
	// 예매 좌석 출력
	private void printSeatNumber() {
		System.out.printf("예매한 좌석 번호 : [%s]" , (row + 1) + "-" + (col + 1));
	}
	// 예매 번호 배정 
	private void assignTickerNumber() {
		ticketNumber[row][col] = Integer.parseInt("1" + ( row + 1 )+"-"+( col + 1));
	}
	// 예매 번호 출력
	private void printTicketNumber() {
		System.out.printf(" / 예매번호 [%d]", ticketNumber[row][col]);
	}
	
	// 예매 조회
	private void reservationinfo() {
		// 예매번호 잘못 입력하면 다시 입력
		// 예매번호를 돌려서 있는 번호가 있을때만 돌려서함 	
		do {
		   try {	
			   System.out.println("예매번호를 입력하세요.");
			   int selectNumber = Integer.parseInt(sc.nextLine());
			
			   if(ticketNumber[row][col] == selectNumber) {
				   String seatNum = " [ " + (row+1) +"-"+(col+1) + "]";
				System.out.printf("고객님이 예매하신 좌석은 %s 입니다.",seatNum);
				break;
			} else {
				throw new Exception("잘못된 예매번호를 입력하였습니다.");
			}
		   } catch(Exception e) {
			   System.out.println(e.getMessage());
		   }
		} while(true);
	}
	
	// 예매 취소 메세지 
	private void cancelReservationMenu() {
		System.out.println("예매번호를 입력해주세요.");
		 int selectNumber = Integer.parseInt(sc.nextLine());
		 if(ticketNumber[row][col] == selectNumber) {
			 String seatNum = " [ " + (row+1) +"-"+(col+1) + "]";
			 System.out.printf("고객님이 예매하신 좌석은 [%s] 입니다.",seatNum);
		 }
	}
	// 예매 취소
	private void cancelReservation() {
		cancelReservationMenu(); // 메세지 실행후
		System.out.println("예매를 취소 하시겠습니까 ? ");
		System.out.println("1. 네  2. 아니오 중 하나를 입력해주세요. ");
		int selectNumber = Integer.parseInt(sc.nextLine());
best_loop : while(true) {
			switch(selectNumber) {
			case 1:
				seat[row][col] = "[" + (row+1) + "-" + (col+1) + "]";
				System.out.println("예매가 취소되었습니다. 감사합니다.");
				break best_loop;
			case 2:
				System.out.println();
				
			}
		}
	}
	
}
