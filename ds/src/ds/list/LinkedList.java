package ds.list;

public class LinkedList<E> implements List<E> {

	private Link<E> head, tail;
	int size;
	
	public LinkedList() {
		head = tail = new Link<>(null, null);
		size = 0;
	}
	
	@Override
	public void clear() {
		head.setNext(null);
		size = 0;
	}

	@Override
	public void insert(int pos, E item) {
		Link<E> curr = head;
		for(int i=0; i<pos; i++) curr = curr.next();
		curr.setItem(item);
	}

	@Override
	public void append(E item) {
		tail = tail.setNext(new Link<> (item, null));
		size++;
	}

	@Override
	public void update(int pos, E item) {
		Link<E> curr = head;
		for(int i=0; i<pos; i++)
			curr = curr.next();
	
		curr.setItem(item);
	}

	@Override
	public E getValue(int pos) {
		Link<E> curr = head;
		for(int i=0; i<pos; i++)
			curr = curr.next();
	
		return curr.item();
	}

	@Override
	public E remove(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int length() {
		return size;
	}

}
