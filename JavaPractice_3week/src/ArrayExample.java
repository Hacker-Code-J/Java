
public class ArrayExample {
	
	public static int add(int[] scores) {
		int sum = 0x00;
		
		for(int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] scores1 = { 83, 90, 87, 100 };
		int scores2[] = new int[] {90, 97, 94, 107};
		
		int sum1 = 0x00, sum2 = 0x00;
		double avg1 = 0.0f, avg2 = 0.0f;
	
		for(int i=0; i < scores1.length; i++) {
			System.out.printf("scores[%d] : %d\n", i, scores1[i]);
			sum1 += scores1[i];
		}
		System.out.println(" 총합 1 : " + sum1);
		avg1 = (double) sum1/ 4;
		System.out.println(" 평균 1 : " + avg1);
			
		sum2 = add(scores2);
		System.out.println(" 총합 2 : " + sum2);
		avg2 = (double) sum2/ 4;
		System.out.println(" 평균 2 : " + avg2);
	}
}
