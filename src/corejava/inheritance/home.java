package corejava.inheritance;

public class home extends Actions {

	int channel = 0;
//	static String person1 = "Alex";
	static person realPerson = new person("Donelys", 'M',26);
	public static void main(String[] args) {
	
//		Actions.sleep(person1);
		Actions.sleep(realPerson);
		realPerson.turningTVOn();
		realPerson.switchChannel(6);
		

	}

	
}
