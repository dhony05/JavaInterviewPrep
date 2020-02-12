package corejava.polymorphism;

public class Shelter {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Cat cat = new Cat();
		
		
		dog.sound();
		cat.sound();
		cat.sound(1,3);

	}

}
