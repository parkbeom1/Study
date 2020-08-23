package airplane;
/*
우리 회사는 비행기를 주문 제작 판매 하는 회사입니다
우리 회사는 비행기를 생산하는 설계도를 작성 하려고 합니다
요구사항
1.비행기를 생산하고 비행기의 이름과 번호를 부여해야 합니다
2.비행기가 생산되면 비행기의 이름과 번호 맞게 부여되었는 확인 하는 작업이 필요합니다 (출력정보 확인)
3.공장장은 현재까지 만들어진 비행기의 총대수 (누적)을 확인 할 수 있습니다
AirPlane air = new AirPlane();
AirPlane air2 = new AirPlane();
AirPlane air3 = new AirPlane();
*/
public class Airplane {
	
	public static String planeName = "Korea Airline"; // 비행기 이름
	public int planoNo; // 비행기 번호 
	
	public static void show(Airplane airplane) { 
		System.out.printf("planeName : %s , planeNo : %d \n" , 
				airplane.planeName , airplane.planoNo);
	}
	public static int count; // 공유됨 (개수를 알수있다)
	
	public static void  Ariplane() {
		count++; // 공유됨  객체 생성시 증가함 
	}
	public static void main(String[] args) {
		// 객체 생성시 count ++ 증가 static이니까 개수가 더해짐 
		Airplane airplane1 = new Airplane(); 
		airplane1.planoNo = 123;
		
		Airplane airplane2 = new Airplane();
		airplane1.planoNo = 456;
		
		Airplane airplane3 = new Airplane();
		airplane1.planoNo = 789;
		System.out.println(Airplane.count);
	}
}
