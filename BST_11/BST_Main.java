package BST_11;

public class BST_Main {
	public static void main(String[] args) {
		BST bs =new BST();
		bs.insert(8);
		bs.insert(3);
		bs.insert(10);
		bs.insert(1);
		bs.insert(6);
		bs.insert(14);
		bs.insert(4);
		bs.insert(7);
		bs.insert(13);
	
		bs.delete(3);
		bs.inorder(bs.root);
	}
}