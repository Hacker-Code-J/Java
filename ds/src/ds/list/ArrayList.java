package ds.list;

public class ArrayList<E> implements List{

	private static final int defaultSize = 10;
	private int listSize;
	private E[] data;
	
	public ArrayList() {
		this(defaultSize);
	}
	
	public ArrayList(int size) {
		listSize = 0;
		data = (E[]) new Object[size];
	}
	
	@Override
	public void clear() {
		listSize = 0;
	}

	@Override
	public void insert(int pos, E item) {
		for(int i=listSize; i>pos; i--)
			data[i] = data[i+1];
		
		data[pos] = item;
		listSize++;
	}

	@Override
	public void append(E item) {
		data[listSize++] = item;
	}

	@Override
	public void update(int pos, E item) {
		data[pos] = item;
	}

	@Override
	public E getValue(int pos) {
		return data[pos];
	}

	@Override
	public E remove(int pos) {
		E ret = data[pos];
		
		for(int i=pos; i<listSize-1; i++) {
			data[i] = data[i+1]
		}
		listSize--;
		
		return ret;
	}

	@Override
	public int length() {
		return listSize;
	}


}
