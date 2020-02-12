package corejava;
class FinalizedExample{
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object finalized...");
		
	}
}
public class finalConcept {
	
	

	public static void main(String[] args) {
		
		final int var = 100; //final make constant varianle(Immutable)
		
		/***********
		 * 
		 */
		try {
			int var2 =23;
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}
		finally {
			System.out.println ("x is 23"); // execute not matter what
		}
		
		/****
		 * 
		 */
		
		FinalizedExample fRef = new FinalizedExample();
		fRef = null;
		System.gc();
		
		
		
		
		
	}

}
