
public class ArrayInArrayExample {
	
	public static void main(String[] args) {
		int[][] cplusScores = new int[2][3];
		for(int i=0; i<cplusScores.length; i++) {
			for(int j=0; j<cplusScores[i].length; j++) {
				System.out.println("cplusscores[" + i + "][" + j + "]=" + cplusScores[i][j]);
			}
		}
		System.out.println();	
			
		int[][] mathScores = new int[][] {
			{10,20,30}, {40,50,60}
		};
		for(int i=0; i<mathScores.length; i++) {
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "]=" + mathScores[i][j]);
			}	
		}
		System.out.println();

		int[][] englishScores = new int[2][];
		englishScores[0] = new int[] {80,90};
		englishScores[1] = new int[3];
		englishScores[1][0] = 70;
		englishScores[1][1] = 80;
		englishScores[1][2] = 90;
		for(int i=0; i<englishScores.length; i++) {
			for(int j=0; j<englishScores[i].length; j++) {
				System.out.println("englishScores[" + i + "][" + j + "]=" + englishScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {
			{90,80}, {92,96,80}
		};
		for(int i=0; i<javaScores.length; i++) {
			for(int j=0; j<javaScores[i].length; j++) {
				System.out.println("javaScores[" + i + "][" + j + "]=" + javaScores[i][j]);
			}
		}
		System.out.println();
	}

}
