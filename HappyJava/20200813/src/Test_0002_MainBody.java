
public class Test_0002_MainBody {
	
	
		public static int power;
		public static String powerOnOff(int power) {
			String powerStatus=""; // 출력 문자 
			
			//powerOnOff(int power) 값을 받아오면 
			switch(power) {
			case 1 : powerStatus+="컴퓨터On";
				Test_0002_MainBody.power=1;break;
			case 2 : powerStatus+="컴퓨터Off";
				Test_0002_MainBody.power=2;break;
			default :
				powerStatus+="잘못된입력입니다."; break;
			}
			return powerStatus;
		}
	}
