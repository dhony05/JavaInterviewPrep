package corejava.finalkeyword;

import java.util.Date;

public class testClass {

	
	public static void main(String[] args) {
		
		immutableClass object = immutableClass.createNewInstance(55, "testing", new Date());
		System.out.println(object);
		modifier(object.getImmutableVar1(),object.getImmutableVar2(), object.getMutableVar());
		System.out.println(object);
		
	}
	
	private static void modifier(Integer newMod, String newString , Date newDate) {
		newMod = 3000;
		newString = "Long test";
		newDate.setDate(50);
		 
	}
}
