package tw.hightwo.js;
//建構式是在物件初始化，不是創建物件實體
public class Scooter extends Bike {
	private int gear;
	private String color;
	
	public Scooter() {
		color = "Yellow";  //在這初始化
	}
	
	public void changeGear(int gear) {
		if(gear >= 0 && gear <= 4) {
			this.gear = gear;
		}
	}
	
	public void upSpeed() {
		if(gear > 0) {
			speed = speed < 1 ? 1 : speed * 1.8 * gear;
		}
	}
	
	public String getColor() {
		return color;
	}
}