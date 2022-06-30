package BST_11;

public class BST {
	Node root;

	public BST() {
		root = null;
	}
	public void insert(int x) {
		Node nnew = new Node(x);
		if (root == null) {
			root = nnew;
		} else {
			Node p = root;
			Node pp = p;

			while (p != null) {
				if (x < p.data) {
					pp = p;
					p = p.left;
				} else {
					pp = p;
					p = p.right;
				}
			}
			if (x > pp.data) {
				pp.right = nnew;
			} else {
				pp.left = nnew;
			}
		}
	}
	public void delete(int x)
	{
		Node p=root;
		Node pp=root;
		
		while(p!=null)
		{
			if(p.data==x)
				break;
			if(p.data>x)
			{
				pp=p;
				p=p.left;
			}
			else 
			{
				pp=p;
				p=p.right;
			}
		}
			if(p==null)
			{
				return;
			}
			else 
			{
				if(p.left==null && p.right==null)
				{
					if(pp.data>x)
					{
						pp.left=null;
					}
					else 
					{
						pp.right=null;
					}
				}
				else if(p.left==null && p.right!=null)
				{
					if(pp.data<x)
					{
						pp.right=p.right;
						p.right=null;
					}
					else 
					{
						pp.left=p.right;
						p.right=null;
					}
				}
				else if(p.left!=null && p.right==null)
				{
					if(pp.data<x)
					{
						pp.right=p.left;
						p.left=null;
					}
					else 
					{
						pp.left=p.left;
						p.left=null;
					}
				}
				else if(p.left!=null && p.right!=null)
				{
					Node s=p.right;
					Node ps=s;
					while(s.left!=null)
					{
						ps=s;
						s=s.left;
					}
					ps.left=s.right;
					s.right=p.right;
					s.left=p.left;
					if(pp.data>x)
					{
						pp.left=s;
					}
					else 
					{
						pp.right=s;
					}
				}
			}
		}
	public void inorder(Node p) {
		if (p == null) {
			return;
		}
		inorder(p.left);
		System.out.println(p.data);
		inorder(p.right);
	}
}