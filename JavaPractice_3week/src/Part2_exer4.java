import java.util.Scanner;

public class Part2_exer4 {
	
	public static int Sum(int[] arr) {
		int sum = 0x00;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] data = new int[5];
		int sum = 0x00;
		double avg = 0.0f;
		
		System.out.println("정수 5개를 입력하시오.");
		for(int i=0; i<5; i++) {
			data[i] = in.nextInt();
		}
		
		sum = Sum(data);
		avg = (double)sum/5;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		
		in.close();
	}

}
