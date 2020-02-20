package one2one;

public class TestClass {
	
	{
	int x = 5;
	
	}
	
	
	public TestClass() {
		System.out.println("I am the constructor");
	}
	
	
	static {
		
		System.out.println("I am the static block");
	}
	
	
	{
		
		System.out.println("I am the code block ");
//		System.out.println(x);  // wont compile 
		
	}
	
	static void printOut() {
		System.out.println("I am the static method");
	}
	

}
