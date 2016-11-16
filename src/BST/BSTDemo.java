package BST;

public class BSTDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree binarysearchtree = new BinarySearchTree();
		binarysearchtree.insert(12);
		binarysearchtree.insert(24);
		binarysearchtree.insert(35);
		binarysearchtree.insert(8);
		binarysearchtree.insert(11);
		binarysearchtree.insert(29);
		binarysearchtree.insert(18);
		binarysearchtree.insert(19);
		binarysearchtree.insert(50);
		binarysearchtree.insert(9);
		binarysearchtree.insert(2);
		System.out.println("PreOrder Traversal");
		binarysearchtree.printPreOrderTraversal();
		System.out.println("\nPostOrder Traversal");
		binarysearchtree.printPostOrderTraversal();
		System.out.println("\nInOrder Traversal");
		binarysearchtree.printInOrderTraversal();
	}
}
