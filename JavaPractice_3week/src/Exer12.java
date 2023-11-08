import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("시작단과 끝단을 입력하라");
		int start = in.nextInt();
		int end = in.nextInt();
		
		for(int i=start; i<=end; i++) {
			for(int j=1; j<10; j++) {
				int mul = i*j;
				System.out.printf("%d x %d = %d\n", i, j, mul);
			}
			System.out.println();
		}
	
	}

}
