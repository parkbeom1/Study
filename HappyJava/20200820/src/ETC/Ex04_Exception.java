package ETC;

import java.io.File;
import java.io.IOException;

public class Ex04_Exception {
	public static void main(String[] args) throws NullPointerException, IOException {
//	File f = new File("C:\\Temp");//  자바 API 제공 : 파일 클래스 제공 이 경로에 파일이 있는지 테스트 
// 파일이 없을수 있으니 예외처리를 해줘라 		
		File f = new File("C:\\Temp");	
		// 이 클래스를 사용한다면 안쪽에 이러한 문제가 발생할수있으니 집을 지을때 안정장치를 마련하고 집을 지어라
		ExClass ex = new ExClass("Temp"); 
		
		// 직접던지는거  - throw() new 
		
		//그물망 예외처리
		ExClass ex2 = new ExClass("Temp"); 
	}
}
