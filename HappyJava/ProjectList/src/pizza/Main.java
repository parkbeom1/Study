package pizza;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		Pizza pizza = new Pizza();
		pizza.setDough(userInput);
		pizza.setTopping1(userInput);
		pizza.setTopping2(userInput);
		pizza.setSide(userInput);
		
		System.out.println(pizza.toString());  // ¿Á¡§¿«  toString() {
	}
}
