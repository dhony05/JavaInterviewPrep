package interfaces;

@FunctionalInterface
interface Calling{
	
	 void call(String str);
	
}

 class Caller implements Calling {

	@Override
	public void call(String str) {
		System.out.println(str);
		
	
}
}

public class functionalInterfaceDemo  {

	
	public static void main(String[] args) {
		Caller caller = new Caller();
		caller.call("This method is called from a functional interface");


	}

}
