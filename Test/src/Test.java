public interface Calculator {
	public void setOprands(int first,int second,int third);
	public int sum();
	public int avg();
}
class CalculatorDummy implements Calculator  {
	public void setOprands(int first,int second,int third){};

public int sum() {
	return 60;
	}

public int avg() {
	return 20;
	}
}

public class Test {
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
		c.setOprands(230, 20, 20);
		System.out.println("√—«’¿∫ : " + c.sum() + "∆Ú±’¿∫ : " + c.avg());
	}
}


