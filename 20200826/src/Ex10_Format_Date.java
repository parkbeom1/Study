import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_Format_Date {
	
	public static void main(String[] args) {
		Date curdate = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println("date : " + curdate); // 날짜 형식의 문자 >> format  
		System.out.println("cal : " + cal); // 문자 결합
		System.out.println("cal getTime() 함수 " + cal.getTime()); // getTime >> format 
		
		// 나는 이제 어떻게 패턴을 잡을까 ?
		SimpleDateFormat dateformat =  new SimpleDateFormat("yyyy년MM월dd일HH시mm분");
		System.out.println(dateformat.format(curdate));
		System.out.println(dateformat.format(cal.getTime()));
		
		// 사이트 정보입력
		// 문자열 >> 날짜 형식으로 변환 
		String stringDate = "202008261212";
		try {
			Date stringdate = dateformat.parse(stringDate); // 프로그램 죽을수있으니 예외처리
							//dateformat.parse 날짜 형식으로 바꿀수있다.
			System.out.println("stringdae " + stringDate);	
			
			long datelong = stringdate.getTime();
			System.out.println(datelong);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
