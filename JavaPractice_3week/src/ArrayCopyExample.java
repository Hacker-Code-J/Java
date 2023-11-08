import java.util.Scanner;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		int numElement;
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("생성할 배열의 크기를 입력하시오.");
			numElement = in.nextInt();
			
			if(numElement < oldStrArray.length) {
				System.out.println("배열의 크기가 너무 작습니다.");
			} else {
				break;
			}
		}
		String[] newStrArray = new String[numElement];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+", ");
		}
		
		
		
	}

}
