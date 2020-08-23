package instanceofTest;

public class ReturnExam {
	public static void main(String[] args) {
		ReturnExam re = new ReturnExam();
		System.out.println(re.abc(10));
		System.out.println(re.abc(20));
		System.out.println(re.abc(30));
	}
	public int abc(int a) { // 정수형 매개변수 사용하기	
		return a * 10;
	}
}