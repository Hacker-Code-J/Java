package inheritance2;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		rc = new RemoteControl() {
			public void turnOn() {System.out.println("리모콘을 켭니다.");};
			public void turnOff() {System.out.println("리모콘을 끕니다.");};
			public void setVolume(int volume) {System.out.println("현재 리모콘 볼륨: " + volume);};
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
	}
}
