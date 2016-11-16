package BST;

public class Node<T> {
	public Node left, right;
	public int value;
	
	public Node(int val){
		this.value=val;
		left = null;
		right = null;
	}
}