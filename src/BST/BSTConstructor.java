package BST;

public class BSTConstructor {
	public Node root;
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
	
	public Node search(Node root, int target){
		if( root.value != target) {
			if(target < root.value){
				root = root.left;
				search(root, target);
			}
			else {
				root = root.right;
				search(root, target);
			}
		}
		else if(root.value == target){
			System.out.println("Found" + root.value);
			return root;
		}
		return null;
	}


}
