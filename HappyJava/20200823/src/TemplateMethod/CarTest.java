package TemplateMethod;

public class CarTest {
// static이랑 많이 쓴다 왜 ? 값이 변함이 없고 	
// 외부에서 정적으로 사용하는 경우가 많기 때문에 	
// 클래스앞에 final 이 붙으면 더이상 상속 하지 못한다. 	
public final static double PI = 3.14;
	
	
	public static void main(String[] args) {
		
		Car aicar = new AiCar(); // 업캐스팅
		aicar.run();
		System.out.println("---------");
		Car manualcar = new ManualCar();
		manualcar.run();
	}
}
