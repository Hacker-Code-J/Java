package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field = "data1";
		parent.method1();
		parent.method2();
		
		//상속받은 Child객체의 필드와 메서드이기 때문에 아래와 같은 접근은 불가능하다.
		//parent.field2 = "data2";
		//parent.method3();
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
		
	}
}
