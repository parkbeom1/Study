import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.or.bit.utils.EduDate;

/*
* Calendar 를 상속받아 완전히 구현한 클래스는 
* GregorianCalendar
buddhisCalendar 있는데 getInstance()는 [시스템의 국가와 지역설정]을 [확인]해서
태국인 경우 buddhisCalendar 의 인스턴스를 반환하고 그 외에는 GregorianCalendar
의 인스턴스를 반환한다
GregorianCalendar 는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 
그레고리력에 맞게 구현한 것으로 태국을 제외한 나머지 국가에서는 GregorianCalendar 사용
그래서 인스턴스를 직접 생성해서 사용하지 않고 메서드를 통해서 인스턴스를 반환받게하는
이유는 최소의 변경으로 프로그램 동작을 하도록 하기 위함
class MyApp{
static void main(){
Calendar cal = new GregorianCalendar();
다른 종류의 역법의 사용하는 국가에서 실행하면 변경...... } }
class MyApp{
static void main(){
Calendar cal = new getInstance();
다른 종류의 역법의 사용하는 국가에서 실행하면 변경...... } }
API : 생성자 Protected Calendar() 
*/
//Java API
//날짜 : Date (구) -> Calendar(신)
public class Ex09_Calender {
	public static void main(String[] args) {
		Date dt = new Date();  // util패키지  .. 구버전 
		System.out.println(dt.toString());
		
		// 신버전
		// Calendar cal = new Calendar(); // 막았으면prievate 인데? 왜 막았을까 ? 
		Calendar cal = Calendar.getInstance();  // 내부에서 new Calendar() 해서 주소를 리턴 
		// Calendar 는 추상클래스라 new가 안돼고 다형성을 사용
		// 추상클래스를 구현하고 있는 .... 누군가가 있다.  GregorianCalendar 를 리턴 
		System.out.println(cal.toString()); // 내부적으로 값을 세팅해 놓고 읽어줌 
		// 당신이 필요한 형식을 추출해서 조합 사용해라
		System.out.println("년도 :" + cal.get(Calendar.YEAR)); // 1를 입력하면 애내들이 1,2,3,등  상수로 만들어놔서 year라는 년도 상수값을 넣으면 된다.
		System.out.println(" 월 : " + (cal.get(Calendar.MONTH)+1)); // 0월부터 시작해서  한국은 +1 해줘야 한다.
		System.out.println(" 일 : " + cal.get(Calendar.DATE));
		System.out.println(" 이달 의 몇째주 : " + cal.get(Calendar.WEEK_OF_MONTH)); // 5째주 
		System.out.println(" " + cal.get(Calendar.DAY_OF_WEEK)); // 이번주 며칠인가  

		// 시 분 초 출력
		System.out.println(" 시 :  " + cal.get(Calendar.HOUR) + "시");
		System.out.println(" 분 : " + cal.get(Calendar.MINUTE) + "분");
		System.out.println(" 초 : " + cal.get(Calendar.SECOND) + "초");
		
		System.out.println("오전 오후 ? " + cal.get(Calendar.AM_PM)); // 오전 0 오후 1 
		
		// 학사 관리 시스템 
		// 페이지 본수 : 200 페이지 
		// 150 페이지 에는 날짜 정보가 들어가있다.
		// 모든페이지에 현재 날짜 2020년 10월 10일 하단에 출력하게 해달라 
		// 만약 누가 요구사항이 날짜가 이래 ? 이렇게 하지말고 한국사람이 보는거니까 2020년 10월 10일 이렇게 해줘 하면
		// 내가 이런 페이지를 150개 다 박아놧는데  몇번 수정 ? 150번을 수정해야 한다.
		// 한번의 수정으로 150 페이지 안에 날짜가 변경되었으면 좋겠다
		// 별도의 클래스로 빼서  거기 안에서 메소드를 만들어서 페이지 마다 
		// class EduDate >> method(today) >> 페이지마다 
		// A 페이지  > EduDate.today() >>
		
		System.out.println(EduDate.DateString(Calendar.getInstance()));
		System.out.println(EduDate.DateString(Calendar.getInstance(),"-"));
		
//		System.out.println(EduDate.monthFormat_DateString(Calendar.getInstance()));
		// 포멧팅을 하면 날짜전체를 던져주면 형식으로 만들어주는구나 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년MM월HH시mm분");
		System.out.println(cal.getTime()); // 구버전 Date() 
		System.out.println(dateFormat.format(cal.getTime()));
		
	}
}
