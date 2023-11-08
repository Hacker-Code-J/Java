import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String grade = "";
		int score = 0x00;
		
		for(int i=0; i<5; i++) { //5개의 성적 압출력
			System.out.println("성적을 입력하시오:");
			score = in.nextInt();
			
			if (score > 95) {
				grade = "A+";
			} else if (score >= 90) {
				grade = "A";
			} else if (score >= 85) {
				grade = "B+";
			} else if (score >= 80) {
				grade = "B";
			} else {
				grade = "C";
			}
			System.out.println(grade);
			System.out.println();
		}
	}

}
