import java.util.ArrayList;

/*
 * 자바 8가지 기본 타입(값타입) : JAVA API 제공
 * 8가지 기본타입에 대해서 객체 형태로 사용하도록 만든것 ( Wrapper class)
  기본 타입 대신에 객체 형태 타입을 사용 ... > 제네릭 자원으로 , static (문자를 -> 정수로 , 실수로  ) 
  1.매개변수 객체 요구될때
  2.기본형 값이 아닌 (객체형태)로 저장
  3.객체간 값을 비교 할때
  4.타입변환에 대한 처리가 요구될때
*/
public class Ex08_Wrapper_Class {
	public static void main(String[] args) {
	int i = 100; // 지역변수 값이 들어감
	Integer n = new Integer(500); 
	System.out.println(n); // 값 500이 나온다 .  string도 찍으면 주소가아니고 값이 나왔음 toString재정의해나서 , Integer 도 toString 재정의 주소아닌 값... 
	System.out.println(n.MAX_VALUE); // static final 상수 변수를 가져옴 // 최대 저장할수있는 정수값
	System.out.println(n.MIN_VALUE);

	// POINT
	// parameter 사용
	// 제너릭 (generic) 객체를 생성할때 타입을 강제 하는 방법 Object를 막고 타입을 강제 함으로써 캐스팅을 하지않게  코드를 간소화 시켜서 처리한다.
	
	ArrayList<Integer> li = new ArrayList<Integer>(); // 제너릭에 타입을 강제한다.
		li.add(100); // 정수타입만 올수있다.
		li.add(200);
		li.add(300);
		for(int li2 : li) { // 정수로 받는다 빠른for문 으로 출력한다. 
			System.out.println(li2);
		}	
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2 == i3); 	   // 주소값 비교  false 
		System.out.println(i2.equals(i3)); // 안에 있는 값을 비교 true 
		
		
		// equals 를 Object 꺼인데
		// String 클래스 재정의  , Integer 클래스도 재정의   실제의 값을 비교하도록 재정의 함 
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4 == i5); // true 	

		Integer t = new Integer(500);
		integerMethod(t); //t라고 하는 참조변수가 가지는 [주소값] ...
		intMethod(t); // t라는 참조변수가 가지고 있는 [값을] 넘긴다. 
	}
	//  Integer i = new Integer();
	static void integerMethod(Integer i) {
		System.out.println("Integer param : " + i); // 500  // toString 재정의해서 값이 나온다.  
		// i.toString 	
		System.out.println(i.MAX_VALUE); // 최대값이 나온다.
	}
	static void intMethod(int i) {
		System.out.println("int param : " + i); // 500 
	}
}
