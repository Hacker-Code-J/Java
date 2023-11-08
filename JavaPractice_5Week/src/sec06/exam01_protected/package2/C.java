package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class C {
	public void method() {
		//protected로 되어 있으며 상속을 받지 않아서 접근이 불가능 하다.
		A a = new A();
		a.field = "value";
		a.method();
	}
}
