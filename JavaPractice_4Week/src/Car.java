
public class Car {
	
	private int speed;
	private boolean stop;
	public int year;
	private int pw = 1234;
	
	public int getSpeed() {
		return speed;
	}
	
	private void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	public void setSpeed(int speed, int pw) {
		if(this.pw == pw) {
			setSpeed(speed);
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}