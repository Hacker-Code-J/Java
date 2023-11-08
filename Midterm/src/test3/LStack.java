package test3;

public class LStack<E> implements Stack<E> {

	private Link<E> top;
	private int size;
	
	public LStack() { top = null; size = 0; }
	public LStack(int size) { top = null; size = 0; }
	@Override
	public void clear() {
		top = null;
	}
	@Override
	public void push(E item) {
		top = new Link<E>(item, top);
	}
	@Override
	public E pop() {
		assert top != null : "Stack is empty!";
		E item = top.item();
		top = top.next();
		size--;
		return item;
	}
	@Override
	public E topValue() {
		assert top != null : "Stack is empty!";
		return top.item();
	}
	@Override
	public int length() {
		return size;
	}
	
}
