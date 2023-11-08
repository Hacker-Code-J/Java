import java.util.Scanner;

public class Part2_exer6 {

	public static void matrixSum(int[][] sum, int[][] arrA, int[][] arrB) {
		for(int i=0; i<sum.length; i++) {
			for(int j=0; j<sum[i].length; j++) {
				sum[i][j] = arrA[i][j] + arrB[i][j];
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] matrix1 = new int[2][2];
		int[][] matrix2 = new int[2][2];
		int[][] Sum = new int[2][2];
		
		System.out.println("Matrix 1 입력");
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1[i].length; j++) {
				System.out.printf("(%d행, %d열) 입력:\n", i, j);
				matrix1[i][j] = in.nextInt();
			}
		}
		System.out.println();
		
		System.out.println("Matrix 2 입력");
		for(int i=0; i<matrix2.length; i++) {
			for(int j=0; j<matrix2[i].length; j++) {
				System.out.printf("(%d행, %d열) 입력:\n", i, j);
				matrix2[i][j] = in.nextInt();
			}
		}
		System.out.println();
		
		matrixSum(Sum, matrix1, matrix2);
		System.out.println("Matrix 합:");
		for(int i=0; i<Sum.length; i++) {
			for(int j=0; j<Sum[i].length; j++) {
				System.out.println("("+i+"행, "+j+"열): " + Sum[i][j]);
			}
		}
	}
}