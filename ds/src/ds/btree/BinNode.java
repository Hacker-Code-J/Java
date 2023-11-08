package ds.btree;

public interface BinNode<E> {

	public E element();
	public E setElement(E element);
	public BinNode<E> left();
	public BinNode<E> right();
	public boolean isLeaf();
}
