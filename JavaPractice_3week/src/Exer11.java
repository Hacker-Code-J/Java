import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("정수를 하나 입력하시오");
			int num = in.nextInt();
			
			//합계 계산
			int sum = 0x00;
			for(int j=1; j<=num; j++) {
				sum += j;
			}
			
			System.out.printf("sum(1+...+%d) : %d\n", num, sum);
			System.out.println();
		}

	}

}
