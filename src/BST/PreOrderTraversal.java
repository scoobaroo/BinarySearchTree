package BST;

public class PreOrderTraversal implements Traversal {
	Node root;
	Node currentNode;
	
	public void PrintTraversal(Node root){
		currentNode = root;
		while(currentNode.left != null){
			currentNode = currentNode.left;
		}
		System.out.println(currentNode.left.value + " " + currentNode.value + " " + currentNode.right.value);
		currentNode = currentNode.root.right;
		System.out.println(currentNode.left.value + " " + currentNode.value + " " + currentNode.right.value);
		while(currentNode.right != null){
			currentNode = currentNode.right;
		}
		System.out.println(currentNode.left.value + " " + currentNode.value + " " + currentNode.right.value);
		currentNode = currentNode.root.right;
		System.out.println(currentNode.left.value + " " + currentNode.value + " " + currentNode.right.value);
	}
}
