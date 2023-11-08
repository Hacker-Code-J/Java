package LIST;

public class DLinkedList<E> implements List<E> {

	DLink<E> head, tail;
	int size;
	
	public DLinkedList() {
		head = new DLink<E>(null, null, null);
		tail = new DLink<E>(null, head, null);
		head.setNext(tail);
		size = 0;
	}
	
	@Override
	public void clear() {
		head.setNext(tail);
		tail.setNext(head);
		size = 0;
	}
	@Override
	public void insert(int pos, E item) {
		DLink<E> curr = head;
		for(int i=0; i<pos; i++) {
			curr = curr.next();
			
		curr.setNext(new DLink<E>(item, curr, curr.next()));
		curr.next().next().setPrev(curr.next());
		size++;
		}
	}

	@Override
	public void append(E item) {
		new DLink<E>(item, tail.prev(), tail);
		tail.prev().prev().setNext(tail.prev());
		size++;
	}

	@Override
	public void update(int pos, E item) {
		DLink<E> curr = head;
		for(int i=0; i<pos; i++)
			curr = curr.next();
		
		curr.next().setItem(item);
	}

	@Override
	public E getvalue(int pos) {
		DLink<E> curr = head;
		for(int i=0; i<pos; i++)
			curr = curr.next();
		
		return curr.next().item();
	}

	@Override
	public E remove(int pos) {
		DLink<E> curr = head;
		for(int i=0; i<pos; i++)
			curr = curr.next();
		
		E ret = curr.next().item();
		curr.next().next().setPrev(curr);
		curr.setNext(curr.next().next());
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

			DLink<E> curr = head;
			
			@Override
			public boolean hasNext() {
				return curr.next() != tail;
			}

			@Override
			public E next() {
				curr = curr.next();
				return curr.item();
			}

			@Override
			public boolean hasPrevious() {
				return curr != head;
			}

			@Override
			public E previous() {
				curr = curr.prev();
				return curr.next().item();
			}
		};
	}
	
}
