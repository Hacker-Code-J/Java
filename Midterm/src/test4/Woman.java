package test4;

public class Woman extends human {

	public Woman() {
		this.type = "성인";
	}

	@Override
	public void military() {
		System.out.println("징병 대상이 아닙니다.");
	}
	
}
