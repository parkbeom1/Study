package instanceofTest;

public class ReturnExam {
	public static void main(String[] args) {
		ReturnExam re = new ReturnExam();
		System.out.println(re.abc(10));
		System.out.println(re.abc(20));
		System.out.println(re.abc(30));
	}
	public int abc(int a) { // ������ �Ű����� ����ϱ�	
		return a * 10;
	}
}