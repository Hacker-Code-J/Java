package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class D extends A{
	public D() {
		//protected로 되어 있어서 패키지가 다르지만 상속을 받았기 때문에 부모객체에 접근이 가능하다.
		super();
		this.field = "value";
		this.method();
	}
}
