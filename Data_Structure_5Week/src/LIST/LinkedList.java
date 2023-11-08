package LIST;

public class LinkedList<E> implements List<E> {

	private Link<E> head, tail;
	int size;
	
	public LinkedList() {
		//head = tail = new Link<>(null, null);
		head = tail = Link.get(null, null);
		
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
		for(int i=0; i<pos; i++)
			curr = curr.next();
		
		// curr.setNext(new Link<>(item, curr.next()));
		curr.setNext(Link.get(item, curr.next()));
		
		if(curr == tail)
			tail = curr.next();
		
		size++;
	}

	@Override
	public void append(E item) {
		// tail = tail.setNext(new Link<>(item, null));
		tail = tail.setNext(Link.get(item, null));
		
		
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
		Link<E> curr = head;
		for(int i=0; i<pos; i++) 
			curr = curr.next();
		
		E ret = curr.next().item();
		
		if(curr.next() == tail)
			tail = curr;
		
		Link<E> tmp = curr.next(); //backup
		
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

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean hasPrevious() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public E previous() {
				// TODO Auto-generated method stub
				return null;
			}
						
		};
	}

}
