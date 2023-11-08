
public class CarExample {

	public static void main(String[] args) {
	
		Car myCar = new Car();
		
		myCar.year = 2020;
		
		myCar.setSpeed(-50, 1234);
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		myCar.setSpeed(60, 1234);
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}
	

