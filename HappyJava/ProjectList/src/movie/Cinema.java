package movie;

import java.util.Scanner;

public class Cinema {
	private String[][] seat; // 좌석
	private Scanner sc;
	private String selectseat; // 좌석선택
	
	
	public Cinema() {
		seat = new String[6][6];
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				seat[i][j] = (i+1)+"-"+(j+1);
			}
		}
		sc = new Scanner(System.in);
	}
	
	// 메뉴 선택
	public String showMenu() {
		System.out.println("*************");
		System.out.println("1. 예매하기");
		System.out.println();
		System.out.println("2. 예매조회");
		System.out.println();
		System.out.println("3. 예매취소");
		System.out.println();
		String select = sc.nextLine();
		return select;
	}
	// 예매하기 
	public void selectseat() {
		System.out.println("*************");
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(seat[i][j].equals((i+1)+ "-"+(j+1))) {
					System.out.printf("[%s]", seat[i][j]);
				} else {
					System.out.print("[예매]");
				}
			} System.out.println();
		}
		
		System.out.println("--------------------");
		System.out.println("원하시는 좌석을 입력해주세요 (Ex 3-3)");
				this.selectseat = sc.nextLine();
					String[] strIndex = this.selectseat.split("-");
						int i = Integer.parseInt(strIndex[0]) - 1;
						int j = Integer.parseInt(strIndex[1]) - 1;
		
						if(this.seat[i][j].equals(this.selectseat)) {
							check();
							} else {
								System.out.println("다시 입력해주세요.");
							}
						}
		// 예매조회
		private void check() {
			best_1: for(int i = 0; i < seat.length; i++) {
				for(int j = 0; j < seat[i].length; j++) {
					if(selectseat.equals(((i+1)+"-"+(j+1)))) {
						System.out.println("예매가 가능합니다.");
						System.out.println("예매 하시겠습니까?");
						System.out.println("1. 네 2. 아니오 0 . 초기화면");
						String check = sc.nextLine();
					switch(check) {
					case "1":
						print();
						break;
					case "2":
						selectseat();
						break;
					case "0":
						return; // 초기화면으로 
					} break best_1;
				}
			}
		}
	}
	// 예매 번호
	private void print() {
	    int ran = (int)(Math.random()*100000);
	    best_2:for(int i = 0; i < seat.length; i ++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(seat[i][j].equals(selectseat)) {
					 seat[i][j] = ran+""; // 랜덤 값을 넣는다.
					 System.out.println("예매가 완료되었습니다.");
					 System.out.printf("예매한 좌석번호 [%s] 예매번호 [%d]",selectseat,seat[i][j]);
					 break best_2;
				}
			}
		}   
	}
	
	// 예매 조회
	void showTicket() {
		System.out.println("예매 번호를 입력하세요.");
		String num = sc.nextLine();
		String[] tic = forFor(seat,num);
		if(tic[0].equals("")) {
			System.out.println("예매 정보가 없습니다.");
		} else {
			System.out.println("좌석 번호 : " + tic[0]);
		}
	}
	
	// 예매 취소
	void cancleTicket() {
		System.out.println("예매 번호를 입력하세요.");
		String num = sc.nextLine();
		String[] tic = forFor(seat,num);
		if(tic[0].equals("")) {
			System.out.println("예약된 정보가 없습니다.");
		} else {
			System.out.printf("고객님이 예매하신 좌석은 %s 입니다.",tic[0]);
			System.out.println("예매를 취소하시겠습니까?");
			System.out.println("네(1) 아니오(2) 중 하나를 입력하세요.");
			int select = Integer.parseInt(sc.nextLine());
			if(select == 1) {
				seat[Integer.parseInt(tic[1])][Integer.parseInt(tic[2])]=tic[0];
				System.out.println("예매가 취소되었습니다.감사합니다.");
			}
		}
	}
	private String[] forFor(String[][] seat, String num) { // forFor(seat,num);
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(num.equals(seat[i][j])) {
					return new String[] {
							(i+1)+"-"+(j+1),
							i+"",
							j+""};
					}
				}
			}return new String[] {""};
		}
	}
	
	
