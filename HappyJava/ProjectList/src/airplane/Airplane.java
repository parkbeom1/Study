package airplane;
/*
�츮 ȸ��� ����⸦ �ֹ� ���� �Ǹ� �ϴ� ȸ���Դϴ�
�츮 ȸ��� ����⸦ �����ϴ� ���赵�� �ۼ� �Ϸ��� �մϴ�
�䱸����
1.����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ� �մϴ�
2.����Ⱑ ����Ǹ� ������� �̸��� ��ȣ �°� �ο��Ǿ��� Ȯ�� �ϴ� �۾��� �ʿ��մϴ� (������� Ȯ��)
3.�������� ������� ������� ������� �Ѵ�� (����)�� Ȯ�� �� �� �ֽ��ϴ�
AirPlane air = new AirPlane();
AirPlane air2 = new AirPlane();
AirPlane air3 = new AirPlane();
*/
public class Airplane {
	
	public static String planeName = "Korea Airline"; // ����� �̸�
	public int planoNo; // ����� ��ȣ 
	
	public static void show(Airplane airplane) { 
		System.out.printf("planeName : %s , planeNo : %d \n" , 
				airplane.planeName , airplane.planoNo);
	}
	public static int count; // ������ (������ �˼��ִ�)
	
	public static void  Ariplane() {
		count++; // ������  ��ü ������ ������ 
	}
	public static void main(String[] args) {
		// ��ü ������ count ++ ���� static�̴ϱ� ������ ������ 
		Airplane airplane1 = new Airplane(); 
		airplane1.planoNo = 123;
		
		Airplane airplane2 = new Airplane();
		airplane1.planoNo = 456;
		
		Airplane airplane3 = new Airplane();
		airplane1.planoNo = 789;
		System.out.println(Airplane.count);
	}
}
