package week3.day1;

import week1.day2.Numbers;

public class FeaturePhone  extends Numbers{

	public void makeCall() {
		System.out.println("Make call to ................");
	}
	
	public void sendMsg() {
		System.out.println("Send a message to ...................");
	}
	
	
	public void playMusic() {
		System.out.println("Play my fav playlist");
	}
	
	 
	public static void main(String[] args) {
		FeaturePhone basicPhone = new FeaturePhone();
		basicPhone.makeCall();
		basicPhone.sendMsg();
		basicPhone.playMusic();
		
	}
	
	
}
