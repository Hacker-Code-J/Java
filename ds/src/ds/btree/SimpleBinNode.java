package ds.btree;

public class SimpleBinNode<E> implements BinNode<E> {

	private E element;
	private BinNode<E> left;
	private BinNode<E> right;
	
	public SimpleBinNode(E element, BinNode<E> left, BinNode<E> right) {
		this.element = element;
		this.left = left;
		this.right = right;
	}
	
	@Override
	public E element() {
		return element;
	}
	@Override
	public E setElement(E element) {
		return this.element = element;
	}
	@Override
	public BinNode<E> left() {
		return left;
	}
	@Override
	public BinNode<E> right() {
		return right;
	}
	@Override
	public boolean isLeaf() {
		return left == null && right ==null;
	}
	
}
