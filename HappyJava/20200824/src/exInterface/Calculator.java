package exInterface;

public abstract class Calculator implements Calc {
	// 인터페이스를 일부부분만 구현할경우 
	
	
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}
	
	
}
