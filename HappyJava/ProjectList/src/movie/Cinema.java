package movie;

import java.util.Scanner;

public class Cinema {
	private String[][] seat; // �¼�
	private Scanner sc;
	private String selectseat; // �¼�����
	
	
	public Cinema() {
		seat = new String[6][6];
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				seat[i][j] = (i+1)+"-"+(j+1);
			}
		}
		sc = new Scanner(System.in);
	}
	
	// �޴� ����
	public String showMenu() {
		System.out.println("*************");
		System.out.println("1. �����ϱ�");
		System.out.println();
		System.out.println("2. ������ȸ");
		System.out.println();
		System.out.println("3. �������");
		System.out.println();
		String select = sc.nextLine();
		return select;
	}
	// �����ϱ� 
	public void selectseat() {
		System.out.println("*************");
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(seat[i][j].equals((i+1)+ "-"+(j+1))) {
					System.out.printf("[%s]", seat[i][j]);
				} else {
					System.out.print("[����]");
				}
			} System.out.println();
		}
		
		System.out.println("--------------------");
		System.out.println("���Ͻô� �¼��� �Է����ּ��� (Ex 3-3)");
				this.selectseat = sc.nextLine();
					String[] strIndex = this.selectseat.split("-");
						int i = Integer.parseInt(strIndex[0]) - 1;
						int j = Integer.parseInt(strIndex[1]) - 1;
		
						if(this.seat[i][j].equals(this.selectseat)) {
							check();
							} else {
								System.out.println("�ٽ� �Է����ּ���.");
							}
						}
		// ������ȸ
		private void check() {
			best_1: for(int i = 0; i < seat.length; i++) {
				for(int j = 0; j < seat[i].length; j++) {
					if(selectseat.equals(((i+1)+"-"+(j+1)))) {
						System.out.println("���Ű� �����մϴ�.");
						System.out.println("���� �Ͻðڽ��ϱ�?");
						System.out.println("1. �� 2. �ƴϿ� 0 . �ʱ�ȭ��");
						String check = sc.nextLine();
					switch(check) {
					case "1":
						print();
						break;
					case "2":
						selectseat();
						break;
					case "0":
						return; // �ʱ�ȭ������ 
					} break best_1;
				}
			}
		}
	}
	// ���� ��ȣ
	private void print() {
	    int ran = (int)(Math.random()*100000);
	    best_2:for(int i = 0; i < seat.length; i ++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(seat[i][j].equals(selectseat)) {
					 seat[i][j] = ran+""; // ���� ���� �ִ´�.
					 System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
					 System.out.printf("������ �¼���ȣ [%s] ���Ź�ȣ [%d]",selectseat,seat[i][j]);
					 break best_2;
				}
			}
		}   
	}
	
	// ���� ��ȸ
	void showTicket() {
		System.out.println("���� ��ȣ�� �Է��ϼ���.");
		String num = sc.nextLine();
		String[] tic = forFor(seat,num);
		if(tic[0].equals("")) {
			System.out.println("���� ������ �����ϴ�.");
		} else {
			System.out.println("�¼� ��ȣ : " + tic[0]);
		}
	}
	
	// ���� ���
	void cancleTicket() {
		System.out.println("���� ��ȣ�� �Է��ϼ���.");
		String num = sc.nextLine();
		String[] tic = forFor(seat,num);
		if(tic[0].equals("")) {
			System.out.println("����� ������ �����ϴ�.");
		} else {
			System.out.printf("������ �����Ͻ� �¼��� %s �Դϴ�.",tic[0]);
			System.out.println("���Ÿ� ����Ͻðڽ��ϱ�?");
			System.out.println("��(1) �ƴϿ�(2) �� �ϳ��� �Է��ϼ���.");
			int select = Integer.parseInt(sc.nextLine());
			if(select == 1) {
				seat[Integer.parseInt(tic[1])][Integer.parseInt(tic[2])]=tic[0];
				System.out.println("���Ű� ��ҵǾ����ϴ�.�����մϴ�.");
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
	
	
