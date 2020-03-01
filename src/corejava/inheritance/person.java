package corejava.inheritance;

public class person extends Actions implements TV {

	int channel = 0;
	static String person1 = "Alex";
	public static void main(String[] args) {
	
		Actions.sleep(person1);
		
		

	}

	@Override
	public void switchChannel(int channel) {
		channel ++;
		System.out.println("channel " + channel + " channged" );
	}

}
