package kr.or.bit.utils;

import java.util.Calendar;

// ���赵
// ���ϰ� (���� ���) �����
// static ....  �Ǵ� �Լ��� ������ �����. (�ϳ��� �̸�) 


public class EduDate {
	
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR) + "��" +
				(date.get(Calendar.MONTH) + 1) + "��" +
				date.get(Calendar.DATE) + "��";
	}
	
	public static String DateString(Calendar date , String opr ) { // ������ �����ϰ� ������ ?  �Ķ���ͷ� �����ڸ� ���� 
		return date.get(Calendar.YEAR) + "��" + opr +
				(date.get(Calendar.MONTH) + 1) + "��" + opr +
				date.get(Calendar.DATE) + "��";
	}

	// �䱸����
	// 2020-8-26
	// 1~9�� >> 01,02,03....09 ������ �ϰ� �ʹ�
	// 10.,11,12 >> �״�� // ����Ἥ
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