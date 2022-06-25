package BST;

public class BNode {
	int data;
	BNode left, right;
	
	BNode(int d){
		data = d;
		left = right = null;
	}
}
class BinaryTree{
	BNode root;
	
	boolean isBalanced(BNode node) {
		int lh;
		int rh;
		
		if(node == null)
		return true;
		
		lh = height(node.left);
		rh = height(node.right);
		
		if(Math.abs(lh-rh) <=1  && isBalanced (node.left) && isBalanced(node.right))
			return true;

	return false;
	}
	int height(BNode node) {
		if(node == null)
		return -1;
		
		return Math.max(height(node.left), height(node.right)) + 1;
	}
	public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new BNode(20);
        tree.root.left = new BNode(9);
        tree.root.right = new BNode(11);
        tree.root.left.left = new BNode(18);
        tree.root.left.right = new BNode(33);
        tree.root.left.left.left = new BNode(45);

        if (tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}
