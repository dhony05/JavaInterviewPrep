package corejava.inheritance;

public class person implements TV {

	public String name;
	public char gender;
	public int age;
	
	public person(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = gender;
	}

	@Override
	public void switchChannel(int channel) {
		channel ++;
		System.out.println(name + " switched the channel to "+ channel );
		
	}

	@Override
	public void turningTVOn() {
		System.out.println(name + " turned the TV on");
	}

	@Override
	public void turningTVOff() {
		System.out.println(name + " turned the TV off");
		
	}


	
	

}
