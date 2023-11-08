package test2;

import java.util.Scanner;

public class Test2 {

	public static void matAdd(int[][] mat1, int[][] mat2, int[][] result) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				result[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
	}
	
	public static void matMul(int[][] mat1, int[][] mat2, int[][] result) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				int tmp = 0;
				for(int k=0; k<4; k++) {
					tmp += mat1[i][k]*mat2[k][j];
				}
				result[i][j] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] mat1 = new int[4][4];
		int[][] mat2 = new int[4][4];
		int[][] sum = new int[4][4];
		int[][] mul = new int[4][4];
		
		
		System.out.println("Input 0-th (4x4) matrix");
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("Input " + j + "-th column of " + i + "-th row: ");
				mat1[i][j] = in.nextInt();
			}
		}
		System.out.println();
		System.out.println("Input 1-th (4x4) matrix");
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("Input " + j + "-th column of " + i + "-th row: ");
				mat2[i][j] = in.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("[Matrix infromation]");
		System.out.println();
		
		System.out.println("0-th (4x4) matrix");
		System.out.println();
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%d\t", mat1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("1-th (4x4) matrix");
		System.out.println();
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%d\t", mat2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		matAdd(mat1, mat2, sum);
		System.out.println("[Matrix addition]");
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%d\t", sum[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		matMul(mat1, mat2, mul);
		System.out.println("[Matrix multiplication]");
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%d\t", mul[i][j]);
			}
			System.out.println();
		}
		
	}
}
