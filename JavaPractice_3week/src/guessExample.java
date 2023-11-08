import java.util.Scanner;
import java.util.Random;

public class guessExample {

	public static void main(String[] args) {
		
		Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int value = rand.nextInt(256);
        int guessValue;
        
        System.out.println("숫자를 출력해보세요");
        
        while(true) {
        	guessValue = in.nextInt();
            if(guessValue == value) {
                System.out.println("정답입니다. 초기에 생성된 값은 " + value + " 입니다.");
                break;
            } else if (guessValue > value) {
                System.out.println("추측한 숫자가 더 큽니다.");
            } else if (guessValue < value) {
                System.out.println("추측한 숫자가 더 작습니다.");
            }
        } in.close();
        
	}

}
