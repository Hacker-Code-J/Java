import java.util.Scanner;

public class toUpperExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입려하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");
        
        Scanner in = new Scanner(System.in);
        String inputString = "";
        
        do {
            System.out.print(">");
            inputString = in.nextLine();
            System.out.println(inputString.toUpperCase());
        }while(!inputString.equals("q"));
        
        System.out.println();
        System.out.println("프로그램 종료");

	}

}
