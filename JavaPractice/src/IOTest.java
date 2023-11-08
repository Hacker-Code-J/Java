import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {
		String name;
		int age;
		double height;
		String intro, buffer;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input name: ");
		name = in.next();
		System.out.println("Input age: ");
		age = in.nextInt();
		System.out.println("Input height: ");
		height = in.nextDouble();
		System.out.println("Input introduction: ");
		buffer = in.nextLine();
		intro = in.nextLine();
		
		System.out.println("name: " + name + ", age: " + age + ", height: " + height);
		System.out.println(intro);
		in.close();
	}

}
