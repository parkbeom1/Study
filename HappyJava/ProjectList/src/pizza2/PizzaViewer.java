package pizza2;

public class PizzaViewer {
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		
		//주문사항
		pizza.selectDough();
		pizza.selectTopping1();
		pizza.selecTopping2();
		pizza.selectSide();		
		//메뉴 출력
		pizza.giveMenu();
	}
}


