import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str="";
		
		for(int i = 0; i < 3; i++) {
			System.out.println("문자를 하나 입력하시오(소문자, 대문자, 숫자):");
			char ch = in.next().charAt(0);
			if (ch >= 'a' && ch <= 'z') {
				str="소문자입니다.";
			}
			else if (ch >= 'A' && ch <= 'Z') {
				str="대문자입니다.";
			}
			else if (ch >= '0' && ch <= '9') {
				str="숫자입니다.";
			}
			else {
				str="다시 입력하세요.";
			}
			System.out.println(str);
			System.out.println();
		
		}
		
	}

}
