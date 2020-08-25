import java.util.Vector;

/*
	다수의 데이터를 다루는 표준화된 인터페이스를 구현하고있는 클래스
	
	Collection 인터페이스 -> List 상속 -> ArrayList (구현 : 약속을...)
					   -> Set 상속 -> HashSet , TreeSet(구현 :...)
    Map 인터페이스 -> (key,value)하나의 쌍으로 갖는 배열  -> HashMap (구현)
    
    1. List (줄을서시오 - 중복허용o 순서있다o) : 순서(번호표) 내부적으로 데이터 (자료,객체)들을 >> 배열관리
    데이터를 배열 방에 집어 넣는다. 번호표 로 0,1,2,3,4 홍길동을 구분함
  >> [홍길동][홍길동][홍길동] 인덱스로 구분한다.
   
  1.1 Vector(구버전)   화장실 -> 동기화 보장 (한강 화장실) -> 멀티스레드 -> 내부적으로 Lock 장치를 가지고 있어서 데이터를 보호한다. -> 성능이 좋지 않다 -> 자료의 프라이버시 
  1.2 ArrayList(신버전) 비빔밥->  동기화 보장 (멀티스레드 ) -> Lock 장치(x) 필요에따라서 -> 성능 우선 (한강비빔밥)  
						  
  기존 여러개의 같은 타입의 데이터를 관리 할때는 Array 정적 (고정) 배열 - 방의 개수가 한번 정해지면 변경하지 못한다. 
  int[] arr = new int[5];
  arr[0] = 100; 
  .. 또는 10개의 방이 필요 방을 줄이거나 늘릴수없다. 
  int[] arr = {10,20,30};  방3개 각각 방에 10,20,30 으로 초기화 

  	Array 
	1. 배열의 크기가 고정 Car[] cars = {new Car(),new Car()}; // 방2개
	2. 접근 방법(index 첨자) 방번호 접근 : cars[0]... : 0 ... n방 까지 : 마지막 방의 번호는 (index) : length -1 같다  첨자가 0부터 시작하니까
	3. 초기 설정 불가
	
	반기가 일어난게 Collection 
	List 구현
(Vector , ArrayList) -줄을서시오
1. 배열의 크기를 동적으로 확장할수있다.(축소도 가능 , 늘리는것도 가능하다) :: >> 사실은 배열의 재할당을 이용한다. 
2. 순서를 유지한다. 중복값을 허용한다. 내부적 배열 : index
3. 데이터의 저장공간으로  Array .... 
	
*/
public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 default 용량 " + v.capacity()); // 초기 10개의 방을 만듬 ( 비어있는 방 )
		System.out.println("실제 데이터 크기 : " + v.size());
		v.add("AA"); // (object e) 라서 모든지 다 넣을수있다. 
		v.add("AA");
		v.add(1);
		v.add(2);
		System.out.println("실제 데이터 크기 : " + v.size()); // 4   동적배열의 length 와 똑같다 
		System.out.println(v.toString()); // 벡터의 toString은 오버라이딩 되어있어서 for문 돌려서 값을 출력하도록 되어 있다.
		//Array >> length 
		//Collection >> size
		for(int i = 0; i < v.size(); i++) { // 실제 데이터 있는 크기까지 돈다.
			System.out.println(v.get(i)); // 데이터를 가져올때 get()함수를 쓴다. get(index)값을 return  정적arr[index] 
		}
		// 개선된 for문   리턴타입은 object타입
		for(Object obj : v ) {
			System.out.println(obj);
		}
		
		// 제너릭 >> 내가 타입을 강제 >> 
		Vector<String> v2 = new Vector<String>(); // String 담을 수 있는 그릇  각각의 배열방은 String 으로 세팅된다. >> 추후 별도 학습 
		v2.add("hello"); // object 에서 String 으로 문자열만 들어갈수있게 됨 
		v2.add("Bye");
		v2.add("king");
		for(String str : v2) {
			System.out.println(str);
		}
		////////////////////////////////////////////////////
		Vector v3 = new Vector();
		System.out.println(v3.capacity()); // 자동으로 10개 그릇 생김		
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");//
		v3.add("A");// 11번째 방을 늘린다.
		System.out.println(v3.capacity()); // 20개 공간으로 늘림 ( 2배로 늘림 )  
		System.out.println(v3.size()); // 데이터가 실제로 들어있는 공간의 개수 11개 
		// 필요하면 늘리고 필요없을때 줄인다.
		
		
		
	}
}
