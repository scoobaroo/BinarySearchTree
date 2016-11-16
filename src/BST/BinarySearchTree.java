package BST;

public class BinarySearchTree {
	public Node root;
	public Node currentNode;
	
	public void insert(int value){
		Node newNode = new Node(value);
		if(root==null){
			root = newNode;
			return;
		}
		Node currentNode = root;
		Node parent = null;
		while(true){
			parent = currentNode;
			if(value<currentNode.value){				
				currentNode = currentNode.left;
				if(currentNode==null){
					parent.left = newNode;
					return;
				}
			}else{
				currentNode = currentNode.right;
				if(currentNode==null){
					parent.right = newNode;
					return;
				}
			}
		}
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
			System.out.println("Found " + root.value);
			return root;
		}
		return null;
	}

	public void printInOrderTraversal(){
		inOrderTraversal(root);
	}
	
	public void inOrderTraversal(Node currentRoot){
		if (currentRoot == null){
			return;
		}
		inOrderTraversal(currentRoot.left);
		System.out.print(currentRoot.value + ", ");
		inOrderTraversal(currentRoot.right);
	}
	
	public void printPostOrderTraversal(){
		postOrderTraversal(root);
	}
	
	public void postOrderTraversal(Node currentRoot){
		if (currentRoot == null){
			return;
		}
		postOrderTraversal(currentRoot.left);
		postOrderTraversal(currentRoot.right);
		System.out.print(currentRoot.value + ", ");
	}
	
	public void printPreOrderTraversal(){
		preOrderTraversal(root);
	}
	
	public void preOrderTraversal(Node currentRoot){
		if (currentRoot == null){
			return;
		}
		System.out.print(currentRoot.value + ", ");
		preOrderTraversal(currentRoot.left);
		preOrderTraversal(currentRoot.right);
	}
}
