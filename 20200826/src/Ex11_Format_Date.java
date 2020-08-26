import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex11_Format_Date {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		SimpleDateFormat  dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
		System.out.println(dateFormat.format(cal.getTime())); // 캘린더(시간) 넣는다 
		

		// 숫자 표기 ( 내가 입력한 값을 천다위로 표현하고 뒤에 소수점을 한자리 
		DecimalFormat df = new DecimalFormat("#,###.0");
		String result = df.format(1234567.89);
		System.out.println(result);
		
		
	}
}
