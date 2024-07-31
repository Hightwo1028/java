package tw.hightwo.js;

public class Bike {
	//public > protected(子類別+相同package > 沒寫(相同package) > pravite
	protected double speed;
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.4;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.7;

	}
	
	public double getspeed() {
		return speed;
	}
}
