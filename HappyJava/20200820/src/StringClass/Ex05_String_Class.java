package StringClass;
/*
	String 클래스 (문자열)
	String 수 많은 함수 ... 문자열을 조작 ( 자르고 , 합치고 )
	subString , replace , split 등이 있다.
	String >> static 함수 + 일반 함수(new 해서 쓸수 있는 )
	subString - 부분적으로 뽑아온다.
*/
public class Ex05_String_Class {
	public static void main(String[] args) {
		String str = ""; //문자열의 초기화 null 도 가능 클래스이니까 
		//사용방법 int ,dobule 처럼 쓰세요
		String[] starr = new String[] {"aaa","bbb","ccc"};
		for(String s : starr) {
			System.out.print(s + " ");
		}
		///////////////////////////////////////////////////
		String str1 = "홍길동";
		System.out.println(str1.length()); //3 길이만큼
		System.out.println(str1.toString()); // 홍길동
		System.out.println(str1); // 홍길동 주소값이 왜 안나올까?
		// object 가지는 toString를 재정의했기 때문이다.(값을 출력하도록 했다) 
		
		// String name = "가나다라마바사";
		// String 내부적으로 메모리를 갖는데 char[] 메모리를 사용한다.
		// >> [가][나][다][라][마][바][사]
		//     0  1  2  3  4  5  6
		// class String extends Object(char[]) 
		// 열어보면 String를 상속해주는 Object 에 
		//  char[] 이 있을거고 @override toString() {...} length() }
		
		String str2 = new String("AAA");
		String str3 = "AAA";
		String str4 = "AAA";
		
		System.out.println(str1); 
		System.out.println(str3 == str4); // true 같은 주소값을 참조한다. 왜? String은 클래스
		// 이유는 ? 메모리에 같은 문자열이 있으면 재사용한다.
		System.out.println(str2 == str3); // false 다른 주소값 힙메모리에 생성됨
		
		System.out.println(str2.equals(str3)); // true
		// 되도록이면 eqauls 를 쓴다. 값을 비교하니까
		
		// 넌센스
		String s = "A";
		s += "B";
		s += "C";
		s += "D";
		System.out.println(s);
		// 머가 나올까?  ABCD 가 나온다 왜?  같은 주소값을 참조하면서 대입연산자로 누적해줘서 출력됨
		
		s = "E";
		System.out.println(s); // E만 출력됨 새로운 주소값 대체 
		
	}
}
