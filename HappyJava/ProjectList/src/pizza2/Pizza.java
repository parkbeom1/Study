package pizza2;

import java.util.Scanner;

public class Pizza {
	Scanner scanner = new Scanner(System.in);
	
	private String dough;
	private String topping1;
	private String topping2;
	private String side;
	
	// 도우 선택
	String selectDough() {
	do {	  
	try {	
		 System.out.print("도우를 선택하세요(쌀, 밀, 씬):");
	      dough = scanner.nextLine();
		   if(dough.equals("쌀") 
			 || dough.equals("밀")|| dough.equals("씬")) 
			 break;  
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("메뉴 선택 문제 발생");
			System.out.println("도우를 입력하세요.(쌀,밀,씬):");
			}
		}while(true);
		return dough;
	}
	
	// 토핑1 선택
	String selectTopping1() {
		do {
			  try {
				  System.out.print("첫번째 토핑을 선택하세요(베이컨, 치킨, 불고기, 스테이크):");
				  topping1 = scanner.nextLine();
				  if(topping1.equals("베이컨")
					|| topping1.equals("치킨")
					|| topping1.equals("불고기")
					|| topping1.equals("스테이크")) {
					  break;
				  }else {
					  throw new Exception("토핑 선택이 잘못 되었습니다");
				  }
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("메뉴 선택 문제 발생");
				  System.out.println("베이컨,치킨,불고기,스테이크 중 입력");
			  }
		}while(true);
		return topping1;
	}
	
	// 토핑2 선택
	String selecTopping2() {
		do {
			  try {
				  System.out.print("두번째 토핑을 선택하세요(베이컨, 치킨, 불고기, 스테이크):");
				  topping2 = scanner.nextLine();
				  if(topping2.equals(topping1)) {
					  throw new Exception("중복된 토핑입니다.");
				  }else if(topping2.equals("베이컨") || 
						  topping2.equals("치킨") || 
						  topping2.equals("불고기") || 
						  topping2.equals("스테이크")) {
					  break;
				  }else {
					  throw new Exception("토핑 선택이 잘못 되었습니다");
				  }
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("메뉴 선택 문제 발생");
				  System.out.println("첫번째 토핑을 제외한 토핑(베이컨,치킨,불고기,스테이크 중) 입력");
			  }
		}while(true);
		return topping2;
	}
	
	// 사이드메뉴 선택
	String selectSide() {
		do {
			  try {
				  System.out.print("사이드메뉴를 선택하세요(제로콜라, 버팔로윙, 스파게티):");
				  side = scanner.nextLine();
				  if(side.equals("제로콜라") || side.equals("버팔로윙") || side.equals("스파게티")) {
					  break;
				  }else {
					  throw new Exception("사이드메뉴 선택이 잘못 되었습니다");
				  }
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("메뉴 선택 문제 발생");
				  System.out.println("제로콜라,버팔로윙,스파게티 중 입력");
			  }
		}while(true);
		return side;
	}
	
	//메뉴 출력
	void giveMenu() {
		System.out.printf("주문하신 '%s %s 피자(도우:%s)'와 '%s' 나왔습니다.",
							topping1, topping2, dough, side); 
	}
}

