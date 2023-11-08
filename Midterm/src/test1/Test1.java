package test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		
		int[] cnt = new int[lower.length()]; 
		
		System.out.println("Input a string:");
		String input;
		for(;;) {
			input = in.nextLine();
			if(input.length()>1024) {
				System.out.println("다시 입력하세요");
				continue;
			} else {
				break;
			}
		}
		
		System.out.println();
		System.out.println("[Alphabet frequency]");
		for(int i=0; i<lower.length(); i++) {
			for(int j=0; j<input.length(); j++) {
				if(upper.charAt(i) == input.charAt(j))
					cnt[i]++;
				if(lower.charAt(i) == input.charAt(j))
					cnt[i]++;
			}
		}
		
		for(int i=0; i<lower.length(); i++) {
			System.out.println(lower.charAt(i) + ": " + cnt[i]);
		}
		
		
	}
}
