package exInterface;

public class CalcTest {
	public static void main(String[] args) {
		// new 할수있는건 CompleteCalc 밖에 없다 
		Calc calc = new CompleteCalc();
		int n1 = 10;
		int n2 = 2;
		
//		calc.  인터페이스로 업캐스팅하고 나면 구현해야만하는것들을
			// 구현할수있다 
		
		calc.add(n1, n2);
		calc.divide(n1, n2);
		calc.substract(n1, n2);
		calc.divide(n1, n2);
		
//		calc.showinfo();  업 캐스팅 후 자식메소드를 참조할수없다 
		
	}
}
