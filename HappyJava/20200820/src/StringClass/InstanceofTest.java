package StringClass;

class Animal {
	
	public void crying() {
		System.out.println("�������� ����");
	}
}
class Dog extends Animal {

	public void crying() {
		System.out.println("���� ����");
	}
}

class Pig extends Animal {
	
	public void crying() {
		System.out.println("������ �ܲ� ��ϴ�.");
	}
}
public class InstanceofTest {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal; // ����� ����ȯ (�ٿ�ĳ����)
	
		}  
	}
}

