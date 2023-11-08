package LIST;

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
	}

	@Override
	public void insert(int pos, E item) {
		Link<E> curr = head;
		for(int i=0; i<pos; i++)
			curr = curr.next();
		
		curr.setNext(new Link<>(item, curr.next()));
		
		if(curr == tail)
			tail = curr.next();
		
		size++;
	}

	@Override
	public void append(E item) {
		tail = tail.setNext(new Link<>(item, null));
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
	public E getvalue(int pos) {
		Link<E> curr = head;
		for(int i=0; i<pos; i++)
			curr = curr.next();
		return curr.item();
	}

	@Override
	public E remove(int pos) {
		Link<E> curr = head;
		for(int i=0; i<pos; i++)
			curr = curr.next();
		
		E ret = curr.next().item();
		
		if(curr.next() == tail)
			tail = curr;
		
		Link<E> tmp = curr.next();
		curr.setNext(curr.next().next());
		tmp.release();
		
		size--;
		
		return ret;
	}

	@Override
	public int length() {
		return size;
	}

	@Override
	public ListIterator<E> listIterator() {
		return new ListIterator<E>() {
			Link<E> curr = head;
			public boolean hasNext() { return curr != tail; }
			public E next() {
				curr = curr.next();
				return curr.item();
			}
			public boolean hasPrevious() { return curr != head; }
			public E previous() {
				Link<E> prev = head;
				while(prev.next() != curr)
					prev = prev.next();
				curr = prev;
				return curr.next().item();
			}
		};
	}

}
