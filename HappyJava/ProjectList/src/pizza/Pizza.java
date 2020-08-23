package pizza;

import java.util.Scanner;

public class Pizza {
	private String dough;
	private String topping1;
	private String topping2;
	private String side;
	private int choiceNum;
	
	private String[] doughts = new String[] {"쌀","밀","씬"};
	private String[] toppings = new String[] {"베이컨","치킨","불고기","스테이크"};
	private String[] sides = new String[] {"제로콜라","버팔로윙","스파게티"};
	
	//토핑 1에서 선택한 아이템을 제외한 목록을 배열로 만드는 메소드
	public String[] modifyItems(int idx) {  //  modifyItems(choiceNum - 1);
		String[] src = toppings; 					// 선택한 토핑목록 을 src에 넣는다
		String[] dest = new String[src.length - 1]; // 내가 선택한 아이템을 제외한 목록을 배열로 
		for(int i = 0; i < idx; i++) {
			dest[i] = src[i];    // 선택된 토핑들은 마지막선택한거까지 넣는다.
		}
		for(int i = 0 ; i < idx; i++) {
			dest[i] = src[i + 1]; // 1 , 2 , 3 , 4
		}
		return dest;
	}
	
	// 아이템 목록을 출력하는 메소드 
	// 다형성 해놓음   저 메소드 에 있는 파라미터에 배열명이 들어오면 바로 for문 아이템들을 보여줌 
	public void showItems(String[] items) {
		int i = 0;
		for(String item : items) {
			System.out.print(++i + ")" + item + "\t");
		}
		System.out.println();
	}
	
	// 사용자의 입력값을 받아 ,  도우 선택하는 메소드
	public void setDough(Scanner userInput) {   // 파라미터로 Scanner userInput 받음 
		do {
			System.out.println("----도우선택----");
			showItems(doughts); // String[] items = doughts 
			choiceNum = userInput.nextInt();
			
			if(1 <= choiceNum && choiceNum <= doughts.length) { // 선택 1보다 크고 도우배열의 길이만큼 
				dough = doughts[choiceNum -1]; // 4를선택했으면 4-1 3번째가 dought로 들어감
				return;
			}
		}while (true);			
	}	
	
	// 사용자가 입력값을 받아 토핑1을 선택하는 메소드
	public void setTopping1(Scanner userInput) {
		do {
			System.out.println("----토핑 선택 ----");
			showItems(toppings); // String[] items = doughts 
			choiceNum = userInput.nextInt(); 
			
			if(1 <= choiceNum && choiceNum <= toppings.length) { // 선택 1보다 크고 도우배열의 길이만큼 
				topping1 = toppings[choiceNum - 1];  // 4를선택했으면 4-1 3번째가 dought로 들어감
				return;
			}
		}	while(true);
	}
		
	// 이전에 선택한 토핑1을 제외한 나머지 중 사용자가 입력값을 받아 토핑 2를 선택하는 메소드 
	public void setTopping2(Scanner userInput) {
	String[] toppings2 = modifyItems(choiceNum - 1);
	do {
		System.out.println("----토핑2 선택----");
		showItems(toppings2);
		choiceNum = userInput.nextInt();
		
		if(1 <= choiceNum && choiceNum <= toppings2.length) {
			topping2 = toppings2[choiceNum - 1];
			return;
		}	
	} while(true);
}

	// 사용자가 입력값을 받아 사이드 메뉴를 선택 하는 메소드
	public void setSide(Scanner userInput) {
		do {
			System.out.println("--- 사이드 메뉴 ---");
			showItems(sides);
			choiceNum = userInput.nextInt();
			
			if(1 <= choiceNum && choiceNum <= sides.length) {
				side = sides[choiceNum -1];
				return;
			}
		} while(true);
	}
	// toString()을 오버라이드 해서 선택한 아이템 목록을 리턴하는 메소드 
	@Override
	public String toString() {
		return "주문하신 " + dough + "도우" + topping1 + "," + topping2 + " 추가한 피자에 " + side +"나왔습니다.";
	}
}	
	