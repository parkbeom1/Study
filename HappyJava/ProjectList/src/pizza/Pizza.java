package pizza;

import java.util.Scanner;

public class Pizza {
	private String dough;
	private String topping1;
	private String topping2;
	private String side;
	private int choiceNum;
	
	private String[] doughts = new String[] {"��","��","��"};
	private String[] toppings = new String[] {"������","ġŲ","�Ұ��","������ũ"};
	private String[] sides = new String[] {"�����ݶ�","���ȷ���","���İ�Ƽ"};
	
	//���� 1���� ������ �������� ������ ����� �迭�� ����� �޼ҵ�
	public String[] modifyItems(int idx) {  //  modifyItems(choiceNum - 1);
		String[] src = toppings; 					// ������ ���θ�� �� src�� �ִ´�
		String[] dest = new String[src.length - 1]; // ���� ������ �������� ������ ����� �迭�� 
		for(int i = 0; i < idx; i++) {
			dest[i] = src[i];    // ���õ� ���ε��� �����������Ѱű��� �ִ´�.
		}
		for(int i = 0 ; i < idx; i++) {
			dest[i] = src[i + 1]; // 1 , 2 , 3 , 4
		}
		return dest;
	}
	
	// ������ ����� ����ϴ� �޼ҵ� 
	// ������ �س���   �� �޼ҵ� �� �ִ� �Ķ���Ϳ� �迭���� ������ �ٷ� for�� �����۵��� ������ 
	public void showItems(String[] items) {
		int i = 0;
		for(String item : items) {
			System.out.print(++i + ")" + item + "\t");
		}
		System.out.println();
	}
	
	// ������� �Է°��� �޾� ,  ���� �����ϴ� �޼ҵ�
	public void setDough(Scanner userInput) {   // �Ķ���ͷ� Scanner userInput ���� 
		do {
			System.out.println("----���켱��----");
			showItems(doughts); // String[] items = doughts 
			choiceNum = userInput.nextInt();
			
			if(1 <= choiceNum && choiceNum <= doughts.length) { // ���� 1���� ũ�� ����迭�� ���̸�ŭ 
				dough = doughts[choiceNum -1]; // 4������������ 4-1 3��°�� dought�� ��
				return;
			}
		}while (true);			
	}	
	
	// ����ڰ� �Է°��� �޾� ����1�� �����ϴ� �޼ҵ�
	public void setTopping1(Scanner userInput) {
		do {
			System.out.println("----���� ���� ----");
			showItems(toppings); // String[] items = doughts 
			choiceNum = userInput.nextInt(); 
			
			if(1 <= choiceNum && choiceNum <= toppings.length) { // ���� 1���� ũ�� ����迭�� ���̸�ŭ 
				topping1 = toppings[choiceNum - 1];  // 4������������ 4-1 3��°�� dought�� ��
				return;
			}
		}	while(true);
	}
		
	// ������ ������ ����1�� ������ ������ �� ����ڰ� �Է°��� �޾� ���� 2�� �����ϴ� �޼ҵ� 
	public void setTopping2(Scanner userInput) {
	String[] toppings2 = modifyItems(choiceNum - 1);
	do {
		System.out.println("----����2 ����----");
		showItems(toppings2);
		choiceNum = userInput.nextInt();
		
		if(1 <= choiceNum && choiceNum <= toppings2.length) {
			topping2 = toppings2[choiceNum - 1];
			return;
		}	
	} while(true);
}

	// ����ڰ� �Է°��� �޾� ���̵� �޴��� ���� �ϴ� �޼ҵ�
	public void setSide(Scanner userInput) {
		do {
			System.out.println("--- ���̵� �޴� ---");
			showItems(sides);
			choiceNum = userInput.nextInt();
			
			if(1 <= choiceNum && choiceNum <= sides.length) {
				side = sides[choiceNum -1];
				return;
			}
		} while(true);
	}
	// toString()�� �������̵� �ؼ� ������ ������ ����� �����ϴ� �޼ҵ� 
	@Override
	public String toString() {
		return "�ֹ��Ͻ� " + dough + "����" + topping1 + "," + topping2 + " �߰��� ���ڿ� " + side +"���Խ��ϴ�.";
	}
}	
	