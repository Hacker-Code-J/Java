package ds.list;

public class LinkTest {

	public static void main(String[] args) {
		Link<Integer> l15 = new Link<>(15, null);
		Link<Integer> l12 = new Link<>(12, l15);
		Link<Integer> l23 = new Link<>(23, l12);
		Link<Integer> l20 = new Link<>(20, l23);
		Link<Integer> head = l20;
		Link<Integer> tail = l15;
	}

}
