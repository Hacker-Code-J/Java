package test4;

public class Man extends human{

	public Man() {
		this.type = "성인";
	}

	@Override
	public void military() {
		System.out.println("징병 대상입니다.");
	}
	
}
