package ds.list;

public class Link<E> {
	private E item;
	private Link<E> next;
	
	public Link(E item, Link<E> nextx) {
		this.item = item;
		this.next = next;
	}
	
	Link<E> next() {return next;}
	Link<E> setNext(Link<E> next) {return this.next =next;}
	
	
	
}
