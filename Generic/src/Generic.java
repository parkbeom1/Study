
public class Generic {

	public static void main(String[] args) {
		Powder power = new Powder();
		GenericTest<Powder> powdergeneric = new GenericTest<>();
		powdergeneric.setMaterial(power);
		System.out.println(powdergeneric);
		
		Plastic plastic = new Plastic();
		GenericTest<Plastic> plasticgeneric = new GenericTest<>();
		plasticgeneric.setMaterial(plastic);
		System.out.println(plasticgeneric);
		
		Stone stone = new Stone();
		GenericTest<Stone> stonegeneric = new GenericTest<>();
		stonegeneric.setMaterial(stone);
		System.out.println(stonegeneric);
		
		Gallaxy gallaxy = new Gallaxy();
		GenericTest<Gallaxy> gallaxygeneric = new GenericTest<>();
		gallaxygeneric.setMaterial(gallaxy);
		System.out.println();
		
		Stone[] stonelist = { new Stone(), new Stone(), new Stone() };
		
		for(Stone s : stonelist) {
			System.out.println(s);
		}
		
		// 다형성 구형
		Material[] materlist = {new Stone() , new Powder(), new Plastic()};
		for(Material m : materlist) {
			System.out.println(m);
		}
		
	}
}
