import java.util.Scanner;

public class CompareOperatorExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input two numbers: ");
		int num1, num2;
		num1 = in.nextInt();
		num2 = in.nextInt();
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		System.out.println("Input two characters: ");
		char char1, char2;
		char1 = in.next().charAt(0);
		char2 = in.next().charAt(0);
		boolean result4 = (char1 < char2);
		System.out.println("result4=" + result4);
		in.close();
	}

}
