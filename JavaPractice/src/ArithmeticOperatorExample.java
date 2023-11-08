import java.util.Scanner;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v1, v2;
		System.out.println("Input two integers: ");
		v1 = in.nextInt();
		v2 = in.nextInt();
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		int result2 = v1 * v2;
		System.out.println("result2=" + result2);
		int result3 = v1 / v2;
		System.out.println("result3=" + result3);
		int result4 = v1 % v2;
		System.out.println("result4=" + result4);
		double result5 = (double) v1 / v2;
		System.out.println("result5=" + result5);
		in.close();
	}

}
