package abstractExam;

abstract class Shape {
	public void paint() {
		draw();
	}
	abstract public void draw();
}
class Circle extends Shape {
	private int radius = 10;
	public Circle(int radius) {
		this.radius = radius;
	}
	double getArea() {
		return 3.14*radius*radius;
	}
	// 추상메소드 구현
	@Override
	public void draw() {
		System.out.println("원을 그립니다. 반지름 : " + this.radius);
	}
	
}
public class abstractExam5 {
	public static void main(String[] args) {
		Circle p = new Circle(10);
		p.paint(); // 반지름 10이 출력되도록해라 
	}
}
