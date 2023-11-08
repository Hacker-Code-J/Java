package inheritance2;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = tv;
		searchable.search("Kindom2");
		
	}
}
