package movie;

public class Ex111 {
	public static void main(String[] args) {
		Cinema c = new Cinema();
		while(true) {
			switch(c.showMenu()){
			case "1":
				c.selectseat();
				break;
			case "2":
				c.showTicket();
				break;
			case "3":
				c.cancleTicket();
				break;
			default :
				break;	
			}	
		}
	}
}
