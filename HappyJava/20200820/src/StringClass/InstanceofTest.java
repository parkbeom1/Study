package StringClass;

class Animal {
	
	public void crying() {
		System.out.println("동물들은 울어요");
	}
}
class Dog extends Animal {

	public void crying() {
		System.out.println("개는 울어요");
	}
}

class Pig extends Animal {
	
	public void crying() {
		System.out.println("돼지는 꿀꿀 웁니다.");
	}
}
public class InstanceofTest {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal; // 명시적 형변환 (다운캐스팅)
	
		}  
	}
}

