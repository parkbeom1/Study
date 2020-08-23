package instanceofTest;

public class ParameterTest {
	public static void main(String[] args) {
		
		abc("Å·Äá");
		abc("°í¸±¶ó");
	
	}
	public static void abc(String name) {
		System.out.println(name);
		System.out.println(name + name);
		System.out.println(name + "Å·¿ÕÂ¯");
	}
}
