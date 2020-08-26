import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.or.bit.utils.EduDate;

/*
* Calendar �� ��ӹ޾� ������ ������ Ŭ������ 
* GregorianCalendar
buddhisCalendar �ִµ� getInstance()�� [�ý����� ������ ��������]�� [Ȯ��]�ؼ�
�±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ� �� �ܿ��� GregorianCalendar
�� �ν��Ͻ��� ��ȯ�Ѵ�
GregorianCalendar �� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 
�׷����¿� �°� ������ ������ �±��� ������ ������ ���������� GregorianCalendar ���
�׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�
������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����
class MyApp{
static void main(){
Calendar cal = new GregorianCalendar();
�ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����...... } }
class MyApp{
static void main(){
Calendar cal = new getInstance();
�ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����...... } }
API : ������ Protected Calendar() 
*/
//Java API
//��¥ : Date (��) -> Calendar(��)
public class Ex09_Calender {
	public static void main(String[] args) {
		Date dt = new Date();  // util��Ű��  .. ������ 
		System.out.println(dt.toString());
		
		// �Ź���
		// Calendar cal = new Calendar(); // ��������prievate �ε�? �� �������� ? 
		Calendar cal = Calendar.getInstance();  // ���ο��� new Calendar() �ؼ� �ּҸ� ���� 
		// Calendar �� �߻�Ŭ������ new�� �ȵŰ� �������� ���
		// �߻�Ŭ������ �����ϰ� �ִ� .... �������� �ִ�.  GregorianCalendar �� ���� 
		System.out.println(cal.toString()); // ���������� ���� ������ ���� �о��� 
		// ����� �ʿ��� ������ �����ؼ� ���� ����ض�
		System.out.println("�⵵ :" + cal.get(Calendar.YEAR)); // 1�� �Է��ϸ� �ֳ����� 1,2,3,��  ����� �������� year��� �⵵ ������� ������ �ȴ�.
		System.out.println(" �� : " + (cal.get(Calendar.MONTH)+1)); // 0������ �����ؼ�  �ѱ��� +1 ����� �Ѵ�.
		System.out.println(" �� : " + cal.get(Calendar.DATE));
		System.out.println(" �̴� �� ��°�� : " + cal.get(Calendar.WEEK_OF_MONTH)); // 5°�� 
		System.out.println(" " + cal.get(Calendar.DAY_OF_WEEK)); // �̹��� ��ĥ�ΰ�  

		// �� �� �� ���
		System.out.println(" �� :  " + cal.get(Calendar.HOUR) + "��");
		System.out.println(" �� : " + cal.get(Calendar.MINUTE) + "��");
		System.out.println(" �� : " + cal.get(Calendar.SECOND) + "��");
		
		System.out.println("���� ���� ? " + cal.get(Calendar.AM_PM)); // ���� 0 ���� 1 
		
		// �л� ���� �ý��� 
		// ������ ���� : 200 ������ 
		// 150 ������ ���� ��¥ ������ ���ִ�.
		// ����������� ���� ��¥ 2020�� 10�� 10�� �ϴܿ� ����ϰ� �ش޶� 
		// ���� ���� �䱸������ ��¥�� �̷� ? �̷��� �������� �ѱ������ ���°Ŵϱ� 2020�� 10�� 10�� �̷��� ���� �ϸ�
		// ���� �̷� �������� 150�� �� �ھƇJ�µ�  ��� ���� ? 150���� �����ؾ� �Ѵ�.
		// �ѹ��� �������� 150 ������ �ȿ� ��¥�� ����Ǿ����� ���ڴ�
		// ������ Ŭ������ ����  �ű� �ȿ��� �޼ҵ带 ���� ������ ���� 
		// class EduDate >> method(today) >> ���������� 
		// A ������  > EduDate.today() >>
		
		System.out.println(EduDate.DateString(Calendar.getInstance()));
		System.out.println(EduDate.DateString(Calendar.getInstance(),"-"));
		
//		System.out.println(EduDate.monthFormat_DateString(Calendar.getInstance()));
		// �������� �ϸ� ��¥��ü�� �����ָ� �������� ������ִ±��� 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��HH��mm��");
		System.out.println(cal.getTime()); // ������ Date() 
		System.out.println(dateFormat.format(cal.getTime()));
		
	}
}
