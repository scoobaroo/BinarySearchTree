package BST;

public class BSTConstructor {
	public Node currentNode;
	
	public void insertRecent(Node currentNode, Node node){
		if(currentNode.value > node.value){
			if(currentNode.left == null){
				currentNode.left = node;
			}
			else
				insertRecent(currentNode.left, node);
		}
		else
			if(currentNode.right == null){
				currentNode.right = node;
			}
			else
				insertRecent(currentNode.right, node);
	}

}
