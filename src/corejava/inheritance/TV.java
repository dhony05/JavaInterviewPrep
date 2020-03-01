package corejava.inheritance;

public interface TV {
	
	/***
	 * This abstract method will be overridden to switch the channel 
	 * @param channel
	 * 
	 */
	abstract void switchChannel(int channel);
	
	/***
	 * implementing turning on the TV
	 */
	abstract void turningTVOn();
	
	/***
	 * Implementing turning off the TV
	 */
	
	abstract void turningTVOff();

}
