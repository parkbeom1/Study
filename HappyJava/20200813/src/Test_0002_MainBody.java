
public class Test_0002_MainBody {
	
	
		public static int power;
		public static String powerOnOff(int power) {
			String powerStatus=""; // ��� ���� 
			
			//powerOnOff(int power) ���� �޾ƿ��� 
			switch(power) {
			case 1 : powerStatus+="��ǻ��On";
				Test_0002_MainBody.power=1;break;
			case 2 : powerStatus+="��ǻ��Off";
				Test_0002_MainBody.power=2;break;
			default :
				powerStatus+="�߸����Է��Դϴ�."; break;
			}
			return powerStatus;
		}
	}
