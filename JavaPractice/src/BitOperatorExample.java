
public class BitOperatorExample {
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
			}
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println(toBinaryString(45) + " & ");
		System.out.println(toBinaryString(25) + " = ");
		System.out.println(toBinaryString(45&25));
		System.out.println("1 << 3 = " + (1<<3));
		System.out.println("-8 >> 3 = " + (-8>>3));
		System.out.println("-8 >>> 3 = " + (-8>>>3));
		System.out.println(toBinaryString(1) + " << 3 = " + toBinaryString(1<<3));
		System.out.println(toBinaryString(-8) + " >> 3 = " + toBinaryString(-8 >> 3));
		System.out.println(toBinaryString(-8) + " >>> 3 = " + toBinaryString(-8 >>> 3));

	}

}
