package corejava;

public class StringBs {

	
	//Difference between StringBuilder and StringBuffer
	
	public static void main(String[] args) {
		int N = 999999999;
		long t;
	
	
		
		
	{	
		StringBuffer sb = new StringBuffer();
		t = System.currentTimeMillis();
		for( int i = N; i --> 0;) {
			sb.append("");
		} // Slowest // ThreadSafe // Synchronized
		
		System.out.println(System.currentTimeMillis() - t);
	}
	
	{	
		StringBuilder sb = new StringBuilder();
		t = System.currentTimeMillis();
		for( int i = N; i --> 0;) {
			sb.append("");
		}
		
		System.out.println(System.currentTimeMillis() - t);
	}
	
	// Fastest // when dealing with single string treatment
	
	
	String str = new String("Hello");
	
	StringBuilder builder = new StringBuilder("Hello");
	StringBuffer buffer = new StringBuffer("Hello");
	
	str.concat(" world");
	builder.append(" wold");
	buffer.append(" world");
	
	System.out.println(str); //Immutable
	System.out.println(builder); // mutable
	System.out.println(buffer); // mutable
	
	}
	
	
	
	
}
