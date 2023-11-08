package LIST;

public class TestArrayList {

	public static void main(String[] args) {
		List<Integer> mfl = new ArrayList();
		
		mfl.append(1); // <1>
		mfl.append(10); // <1, 10>
		mfl.append(20); // <1, 10, 20>
		mfl.insert(1, 22); // <1, 22, 10, 20>
		mfl.remove(2); // <1, 222222222222222, 20>
		
		System.out.println(mfl.length());
	}

}
