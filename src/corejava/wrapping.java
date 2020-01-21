package corejava;

public class wrapping {

	public static void main(String[] args) {
		
		int i = 10; // Single value container
		Integer iRef = new Integer(i); // Boxed ( contructing the object)
		
		int j = iRef.intValue(); // unBoxing ( Extracting the value from object)
		
		Integer kRef = i; // AutoBoxing(Integer kRef = new Integer(i);)
		
		int l = kRef; // AutoBoxing
		
		// OOPS -> pass the primitives references
		
	}
	
}
