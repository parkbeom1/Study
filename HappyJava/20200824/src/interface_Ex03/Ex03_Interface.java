package interface_Ex03;
/*
	추상클래스 : 인터페이스 비교
	인터페이스 표준 : 약속 , 표준안 
	공통점  스스로 객체 생성 불가능
	추상클래스는 extends , 인터페이스는 implements - 서로 new 라는 연산자 사용 불가능
	1.1 두놈의 차이점 : 추상클래스(완성 + 미완성) , 인터페이스(완전 미완성)
	
	2. 사용
	추상클래스  extends 
	인터페이스 implements 완성된게 없어서 다 구현해야 한다.
	class Car extends abcclass;
	class Car implements abcclass;
	가지고 있는 자원(추상) 을 강제로 구현하게 한다.(추상자원을 재정의)
	[ 추상 클래스 : 인터페이스 다른점 ]
	1.인터페이스는 다중구현이 가능하다. 
	약속을 만든다 >> 약속 너무 크게  >> 사용성이 떨어진다. >> 그래서 활용도를 높게 작은단위를 여러개의 약속을 만들어서 한덩어리로 만든다 
	>> 모아모아서 약속 >> 다중으로 쓸수있다. class Test extends Object implements la,lb,lc ; 다중약속이 가능 
	인터페이스 와 인터페이스는 extends가 가능하다.
	
	 2. 추상클래스는 단일상속이 원칙이다. (계층적 상속)
	 3. 추상클래스는 완성된 코드를 가지고 있다. (완성된 코드 + 미완성코드)
	 4. 인터페이스는 (상수를 제외한 나머지는 미완성(추상)자원 
	 	인터페이스는 소프트웨어 설계 최상위 단계
	 	어떤 프로젝트를 진행할대 약속정의....
	 ** 개발자 (초급)
	 1. 인터페이스를 [다형성] 입장으로 접근(인터페이스 부모타입)
	 2. 서로 연관성이 없는 클래스를 하나로 묶어주는 기능을 한다.(같은 부모를 가지게)
	 3. JAVA API 가 수많은 인터페이스를 미리 만들어 놓았다. 직접 설계하지 않아도 넘친다.....사용 방법
	 4. 인터페이스는 (~ble) : 날수 있는 ,수리할수 있는 (설계)
	 5. 객체간 연결 고리 : 객체간 소통(다형성) >> 다형성
	  	
*/

/*
interface la {
	String point(); // 구현부가 없고 약속만 있다. // 출력할때는 print 사용하고 return 은 문자로 해라 
}
class Test implements la {
	@Override
	public String point() {
		return null;
	}
}
*/
/*
설계 표준 >> 구현 > 재정의
Interface  
1. 실제 구현부를 가지고 있지 않다. 실행 블록이 없다 :  약속 
 시스템에서 이동하는 것은 move 라는 이름을 사용하고 이동시에는 좌표값 2개를 받자
  >> 합의 >> void move(int x , int y); 
구현은 재정의가 해야 한다. 약속은 지켜야 한다. >> 구현자 >> 재정의 강제 >> 추상 메소드 
>> 활용 >> collection (동적 배열) :
 자료구조 >> Vector , ★ ArrayList , HashSet , ★ HashMap 여러개의 인터페이스를 구현 하고 있다.
 
 2. 생성방법 
  2.1 상수(final) : public static final int VERSION = 1; 인터페이스에 쓸수있다.
  >> [public static final] int VERSION  []를 생략해서 나온다.
  컴파일러가 알아서 붙여준다. ....
  
   interface  {
   		int VERSION=1; [ Default 로 컴파일러가 public static final 생략시킴 ]
   		
   }
  2.2 함수(method) : public 왜 ? public abstract void run(); >> [public abstract] void run();
 
 Interface {
 	 int VERSION = 1; [public abstract final] ... default
 	 void run();  // [public abstract] ... default
   	 String move(int x , int y); >> public abstract String move(int x,int y);
 
   인터페이스를 만들때 방법  
   Interface lable{} 
   Interface label{int NUM=0;}
   Interface label{void run();}
   	
   class Test extends Object implements la,lb,lc {
   		
   }	
*/
interface Ia {
	public static final int AGE = 100;
	String GENDER = "남";
	
	public abstract String print();
	void message(String str);
}
interface Ib {
	public static final int AGE = 10;
	public abstract void info();
	public abstract String val(String s);
}
class Test extends Object implements Ia , Ib {	
	public String print() {
		return null;
	}
	@Override
	public void info() {
		
	}
	@Override
	public String val(String s) {
		return null;
	}
	@Override
	public void message(String str) {
	}
}
public class Ex03_Interface {
	public static void main(String[] args) {
		Test t = new Test();
		Ia ia = t; // 업캐스팅  부모는 자식타입의 주소를 가질수 있다. (다형성) 
		System.out.println(ia); 
		ia.message("AA"); // 재정의해서 쓸수있다.
		System.out.println(ia.AGE);
		Ib ib = t;
		System.out.println(ib.AGE);
		
	}
}
