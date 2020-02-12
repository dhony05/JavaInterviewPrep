package corejava.polymorphism;

public class Cat  extends Animal{
	
	@Override
	public void sound() {
		System.out.println("miaw miaw ");
	}
	
	
	public void sound(int quantity, int age) {
		System.out.println("miaws miaws");
	}

}
