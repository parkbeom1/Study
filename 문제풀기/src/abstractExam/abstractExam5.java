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
	// �߻�޼ҵ� ����
	@Override
	public void draw() {
		System.out.println("���� �׸��ϴ�. ������ : " + this.radius);
	}
	
}
public class abstractExam5 {
	public static void main(String[] args) {
		Circle p = new Circle(10);
		p.paint(); // ������ 10�� ��µǵ����ض� 
	}
}
