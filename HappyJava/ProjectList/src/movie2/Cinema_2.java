package movie2;

import java.util.Scanner;

public class Cinema_2 {
	private Scanner sc;
	private String[][] seat;
	private int[][] ticketNumber;
	
	private int row; // ��
	private int col; // �� 
	
	public Cinema_2() {
		sc = new Scanner(System.in);
		
		seat = new String[6][6];
		ticketNumber = new int[6][6];
	}
	
	
	// �¼� �ʱ�ȭ
	
	public void initseat(){
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "[" + (i + 1) + "-" + (j + 1) + "]";
			}
		}
	}
	
	
	// ����
	// ù ���� �޼ҵ�
	public void execution() {
		loop_1 : while(true) {
			int initnumber = showReservationMenu();
			switch(initnumber) {
			case 1:
				showSeat(); // �¼� ��Ȳ ���
				selectSeat(); // �¼� �Է�
				break loop_1; // �� �޼ҵ忡�� break ���������� ���� �� case �� ����������
							  // �ٽ� while�� ���� 
			case 2:
				reservationinfo(); // �������� ��ȸ
				execution(); 
				break loop_1;
			case 3:
				cancelReservation(); // ���� ���
				execution();
				break loop_1;
			case 4:
				showSeat(); // �¼���ȸ
				break loop_1;
			case 5:
				System.out.println("���α׷� ����");
				System.exit(0);
				break;
			default :
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�.");
				break;
			}
		}
	}
	// �޴� ��� 
	// �� �޼ҵ带 ȣ���ϸ� �ǵ����ִ°��� initnumber
	public int showReservationMenu() {
		System.out.println("��ȭ ���� �ý���");
		System.out.println("************");
		System.out.println("1. �����ϱ�");
		System.out.println("2. ������ȸ");
		System.out.println("3. �������");
		System.out.println("4. �¼���Ȳ");
		System.out.println("5. �� �� ");
		int initnumber = Integer.parseInt(sc.nextLine());
		return initnumber;
	}
	
	// �¼� ��Ȳ ��� 
	public void showSeat() {
		System.out.println("***�¼���Ȳ***");
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]); 
			}
			System.out.println();
		}
		System.out.println("********************");
	}
	// �¼� �Է�(���� ���� ���� Ȯ��)
	private void selectSeat() {
		System.out.print("��>");
		 row = Integer.parseInt(sc.nextLine()) - 1;  // �� �Է� 
		 System.out.print("��>");
		 col = Integer.parseInt(sc.nextLine()) - 1; // �� �Է�
		 
		 if (seat[row][col].equals("[" + (row + 1) +"-"+ (col + 1)+"]")) {
			 System.out.println("���� ���� �¼� �Դϴ�.");
			 reservation();   
		 } else {
			 System.out.println("�̹� ����Ǿ����ϴ�.");
			 System.out.println("�ٸ� �¼��� �������ּ���.");
			 showSeat(); // �¼� ��Ȳ ��� 
			 selectSeat(); // ���� ������ �¼� ��� 
		 }
	}
	// ���� �����մϴ�. �����Ͻðڽ��ϱ� ? ���� 
	// �� ���� ���� ����
	// �� 	  case 1 : ���ſϷ�  ��� , �¼�/���� ��ȣ ���
	// �ƴϿ�    case 2 : �ٽ� selectSeat���� ���ư���
	// �ʱ�ȭ�� case 0 : �ٽ� showReservationMenu �� ���ư���
	private void reservation() {
		int reservationMenuNum = reservationMenu(); // ���� ���� �� �Ŵ� �� ���� ���ϰ��� �޾ƿ� 
		switch(reservationMenuNum) {
		case 1:
			assignSeatNumber(); // �����¼� ����
			assignTickerNumber(); // ���Ź�ȣ ����
			System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
			printSeatNumber(); // ���� �¼� ���
			printTicketNumber(); // ���� ��ȣ ���
			System.out.println("�����մϴ�.");
			execution(); // ù ȭ������ �ٽ� ���ư���.
		case 2:
			System.out.println("�ʱ� ȭ������ ���ư��ϴ�.");
			 selectSeat(); // �ٽ� �¼� 
			break;
		case 0:
			showReservationMenu();
			break;
		default :
			System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
			break;
		}
	}	
	// ���� ���� �� �Ŵ�
	public int reservationMenu() {
		System.out.println("���� �����մϴ�. �����Ͻðڽ��ϱ� ?");
		System.out.println("1 . ��  2. �ƴϿ�  , �ʱ�ȭ�� (0)�� �ϳ��� �Է����ּ���.");
		int reservationMenuNum = Integer.parseInt(sc.nextLine());
		return reservationMenuNum;
	}
	// ���� �¼� ����
	private void assignSeatNumber() {
		seat[row][col] = "[����]";
	}
	// ���� �¼� ���
	private void printSeatNumber() {
		System.out.printf("������ �¼� ��ȣ : [%s]" , (row + 1) + "-" + (col + 1));
	}
	// ���� ��ȣ ���� 
	private void assignTickerNumber() {
		ticketNumber[row][col] = Integer.parseInt("1" + ( row + 1 )+"-"+( col + 1));
	}
	// ���� ��ȣ ���
	private void printTicketNumber() {
		System.out.printf(" / ���Ź�ȣ [%d]", ticketNumber[row][col]);
	}
	
	// ���� ��ȸ
	private void reservationinfo() {
		// ���Ź�ȣ �߸� �Է��ϸ� �ٽ� �Է�
		// ���Ź�ȣ�� ������ �ִ� ��ȣ�� �������� �������� 	
		do {
		   try {	
			   System.out.println("���Ź�ȣ�� �Է��ϼ���.");
			   int selectNumber = Integer.parseInt(sc.nextLine());
			
			   if(ticketNumber[row][col] == selectNumber) {
				   String seatNum = " [ " + (row+1) +"-"+(col+1) + "]";
				System.out.printf("������ �����Ͻ� �¼��� %s �Դϴ�.",seatNum);
				break;
			} else {
				throw new Exception("�߸��� ���Ź�ȣ�� �Է��Ͽ����ϴ�.");
			}
		   } catch(Exception e) {
			   System.out.println(e.getMessage());
		   }
		} while(true);
	}
	
	// ���� ��� �޼��� 
	private void cancelReservationMenu() {
		System.out.println("���Ź�ȣ�� �Է����ּ���.");
		 int selectNumber = Integer.parseInt(sc.nextLine());
		 if(ticketNumber[row][col] == selectNumber) {
			 String seatNum = " [ " + (row+1) +"-"+(col+1) + "]";
			 System.out.printf("������ �����Ͻ� �¼��� [%s] �Դϴ�.",seatNum);
		 }
	}
	// ���� ���
	private void cancelReservation() {
		cancelReservationMenu(); // �޼��� ������
		System.out.println("���Ÿ� ��� �Ͻðڽ��ϱ� ? ");
		System.out.println("1. ��  2. �ƴϿ� �� �ϳ��� �Է����ּ���. ");
		int selectNumber = Integer.parseInt(sc.nextLine());
best_loop : while(true) {
			switch(selectNumber) {
			case 1:
				seat[row][col] = "[" + (row+1) + "-" + (col+1) + "]";
				System.out.println("���Ű� ��ҵǾ����ϴ�. �����մϴ�.");
				break best_loop;
			case 2:
				System.out.println();
				
			}
		}
	}
	
}
