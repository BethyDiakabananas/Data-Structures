package diakabana.datastructures.practice;
/**
 * Class <tt>Node</tt> represents a node in a linked data structure
 * @author Bethy Diakabana
 * @since 11/27/2015
 *
 */
class Node<T> {
	private T data;
	private Node<T> next;
	
	Node(T data) {
		this(data, null);
	} // end constructor
	
	private Node(T data, Node<T> next) {
		this.setData(data);
		this.setNext(next);
	} // end constructor

	public T getData() {
		return data;
	} // end method getData

	public void setData(T data) {
		this.data = data;
	} // end method setData

	public Node<T> getNext() {
		return next;
	} // end method getNext

	public void setNext(Node<T> next) {
		this.next = next;
	} // end method setNext
} // end class Node