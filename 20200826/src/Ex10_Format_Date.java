import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_Format_Date {
	
	public static void main(String[] args) {
		Date curdate = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println("date : " + curdate); // ��¥ ������ ���� >> format  
		System.out.println("cal : " + cal); // ���� ����
		System.out.println("cal getTime() �Լ� " + cal.getTime()); // getTime >> format 
		
		// ���� ���� ��� ������ ������ ?
		SimpleDateFormat dateformat =  new SimpleDateFormat("yyyy��MM��dd��HH��mm��");
		System.out.println(dateformat.format(curdate));
		System.out.println(dateformat.format(cal.getTime()));
		
		// ����Ʈ �����Է�
		// ���ڿ� >> ��¥ �������� ��ȯ 
		String stringDate = "202008261212";
		try {
			Date stringdate = dateformat.parse(stringDate); // ���α׷� ������������ ����ó��
							//dateformat.parse ��¥ �������� �ٲܼ��ִ�.
			System.out.println("stringdae " + stringDate);	
			
			long datelong = stringdate.getTime();
			System.out.println(datelong);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
