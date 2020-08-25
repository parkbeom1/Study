
public class Stone extends Material {
	
	public String toString() {
		return "돌로 만듭니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("돌로 만듭니다.");
	}
}
