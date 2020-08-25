
public class Plastic extends Material {
	
	public String toString() {
		return "플라스틱 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 으로 만듭니다.");
	}
}
