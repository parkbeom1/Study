package StringClass;

import java.util.StringTokenizer;

public class Ex07_String_Function {
	public static void main(String[] args) {
		String str = "Hello";
		str.concat("안녕");
		System.out.println(str.concat(" world"));
		boolean bo = str.contains("ello"); // 포함하면 true 
		System.out.println(bo);
		
		String str2 = "a b c d";
		System.out.println(str2.length()); // 7 (공백도 포함)
		String filename = "hello java world";
		System.out.println(filename.indexOf("h")); // h가 있는 인덱스 번호 추출
		System.out.println(filename.indexOf("java")); // 시작 위치 값 6
		System.out.println(filename.indexOf("개폭망")); // 찾는값이 없으면 -1
		// 0보다 큰 값이면 1개는 포함...
		
		if(filename.indexOf("wo") != -1) { 
		// 정수타입 이면 비교해야됨 0보다 큰 값이면 값을 가지고 있다. -1 이 아니면 값을 가지고 있다
			System.out.println("wo를 가지고 있습니다.");	// true
		}
		System.out.println(filename.lastIndexOf("a")); // 9
		// length() , indexOf() , subString() , replace() , split()
		// 부분적인 문자 추출 subString(int beginIndex,int endIndex) // endIndex 에서 -1 한 자리까지
		
		// subString 을 시작과 끝을 찾을수 있다.
		String result = "supername";
		
		System.out.println(result.substring(0)); // 0번부터 다 출력
		System.out.println(result.substring(0,2)); // su
		System.out.println(result.substring(0,0)); // 출력안함
		System.out.println(result.substring(2,3)); // p 
		
		
		//Quiz 
		String filename2 = "aaaa.zip"; // 또는 hong.png 또는 h.jpeg가  올수있는데
		// 여기서 파일명과 확장명을 출력하세요
		
		System.out.println("파일명 : " + filename2.substring(0,filename2.lastIndexOf("."))); // subString(처음부터 , 마지막에있는 . 까지)
		System.out.println("확장명 : " + filename2.substring(filename2.indexOf(".")+1,filename2.length())); // subString(.다음부터 , 글자의 길이까지)
		
		// 강사님 답안
		int position = filename2.indexOf(".");
		String file = filename2.substring(0,position);
		String extention = filename2.substring(position+1,filename2.length());
		String extention2 = filename2.substring(++position); // 포지션 다음으로 뽑을수있게 
		
		System.out.println(file); // aaa
		System.out.println(extention); // zip
		System.out.println(extention2); // zip
 
	
		// replace (치환함수)
		String str3 = "ABCDDDDDA";
		String result3 = str3.replace("DDDDD", "오늘은 목요일");
		System.out.println(result3);
		
		//ETC
		System.out.println();
		// 인덱스를 주면 문자를 찾아낸다.
		System.out.println(str3.charAt(0)); // A
		System.out.println(str3.charAt(3)); // D
		// 특정 문자열로 끝나는지 boolean 으로 반환
		System.out.println(str3.endsWith("DA")); // true
		System.out.println(str3.endsWith("ABC")); // false
		
		System.out.println(str3.equalsIgnoreCase("abcddddda")); // true
		
		
		// > > Today Point < <
		// Split 특정문자열 기준으로 뽑아낸다.
		// String str4 = "슈퍼맨 , 팬티 , 노란색 , 우하하";
		
		// 분리된걸 배열방에 넣는다. 배열에 놓고 for문을 돌린다.
		// String[] namearray = str4.split(",");
		
		// split - . 구분점을 띄운다.
		
		String str4 = "슈퍼맨,팬티,노란색,우하하";
		
		String[] str5 = str4.split(",");
	
		for(String s : str5) {
			System.out.print(s + " ");
		}
		
		/*
			정규표현식 표준 ( java,javascript , Oracle , c#) 공통적인 규칙 사용
			어떠한 문자를 만들때 규칙을 부여 하는것이다. >> 유효한 판단의 근거가 된다.
			주민번호 정수 6자리 , 라는 특수문자와  정수 7자리 {\d} - {\d} 요 규칙에 맞게 입력을 했는지
			핸드폰 12345-1234567 >> false 로 받는다
			차량번호
			우편번호
			도메인주소
			이메일주소등을 검증 정규 표현식으로 개발해둔다.
			// https://regexper.com/#%5E%28%3F%3A%5B0-9%5D%7B2%7D%28%3F%3A0%5B1-9%5D%7C1%5B0-2%5D%29%28%3F%3A0%5B1-9%5D%7C%5B1%2C2%5D%5B0-9%5D%7C3%5B0%2C1%5D%29%29-%5B1-4%5D%5B0-9%5D%7B6%7D%24
		
			// 많이 쓰는 정규 표현식  조별과제로 나중에 나감 - > 주민번호가 있으면 해석을 해야한다. 첫문자가 머가 와야 하는지
			split 다음으로 정규표현식을 쓸수있는데
			.이라는 정규표현식 문법이라서 이스케이프 그대로 \. 를 써도 이것도 정규표현식
			\\. 를 써야한다.
		*/
		System.out.println();
		String filename3 = "bit.hwp";
		// split 사용해서 파일명과 확장명 출력
		// 파일명
		String[] str6 = filename3.split("\\.");
		
		for(String s : str6) {
			System.out.println( s );  // 파일명과 확장명 출력됨
		}
		System.out.println("확장명 ");
	
	// 어느 문자 기준으로 여러가지 문자를 분리하려면 ?
	String str10 = "a/b.c-d.f";
	StringTokenizer sto = new StringTokenizer(str10,"/-.");
	while(sto.hasMoreElements()) {
		System.out.print(sto.nextToken());
		System.out.println();
		
		}
	System.out.println();
	
	// 넌센스
	String str7 = " 홍 길 동 ";
	// 저장 >> 공백제거 >> "홍길동";
	StringTokenizer sto2 = new StringTokenizer(" ");
	while(sto2.hasMoreElements()) {
		System.out.print(sto2.nextToken());
		System.out.println();
		}
	System.out.println();
	String str8 = "    홍길동       ";
	System.out.println(">" + str8 + "<");
	// 공백제거 "홍길동"
	System.out.println(str8.replaceAll(" ", ""));
	System.out.println(str8.trim());
	System.out.println(str8);
	// ...........여러개의 함수를 적용할때는( method chain )을 사용한다. <- 중요 
	System.out.println(str8.trim().replace(" ", "").substring(0));
	// 어자피가 결과가 String 이니까  chain 으로 묶음
	
	// Quiz - 1
	int sum = 0;
	String[] number = {"1","2","3","4","5"};
	//문제
	 // 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 
	// ★ 문자열 배열을 뽑을떄는 빠른 for문을 쓴다 ★
		for(String s : number) {
			sum += Integer.parseInt(s); // 문자열 -> 정수로 변환 후  sum에 대입 연산
		}
		System.out.println(sum);
	
	// Quiz - 2
	int sum2 = 0;
	String jumin = "123456-1234567"; // 주민번호 합 구하기
	String[] number2 = jumin.replace("-", "").split(""); // 공백없는 기준으로 
	for(String s : number2) {
			sum2 += Integer.parseInt(s); // String은 무조건 정수로 형변환 
 	}
	System.out.println(sum2); // 49
	}
}