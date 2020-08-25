
public class Powder extends Material {
	
	public String toString() {	
		return "파우더 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더로 만듭니다.");
	}
}
