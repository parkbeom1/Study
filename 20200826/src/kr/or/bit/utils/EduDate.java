package kr.or.bit.utils;

import java.util.Calendar;

// 설계도
// 편하게 (많이 사용) 기능을
// static ....  또는 함수를 여러개 만든다. (하나의 이름) 


public class EduDate {
	
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR) + "년" +
				(date.get(Calendar.MONTH) + 1) + "월" +
				date.get(Calendar.DATE) + "일";
	}
	
	public static String DateString(Calendar date , String opr ) { // 형식을 지정하고 싶으면 ?  파라미터로 구분자를 지정 
		return date.get(Calendar.YEAR) + "년" + opr +
				(date.get(Calendar.MONTH) + 1) + "월" + opr +
				date.get(Calendar.DATE) + "일";
	}

	// 요구사항
	// 2020-8-26
	// 1~9월 >> 01,02,03....09 나오게 하고 싶다
	// 10.,11,12 >> 그대로 // 제어문써서
	/*
	public static int monthFormat_DateString(Calendar date , int opr) {
		String month ="";
		if((date.get((Calendar.MONTH)+1 < 10) {
			month = "0" + date.get(Calendar.MONTH) + 1));
		} else {
			month = String.valueOf(date.get(Calendar.MONTH) + 1));
		}
	}
	*/
}