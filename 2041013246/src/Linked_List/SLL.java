package Linked_List;

public class SLL {
	Node start;
	int n;
	public SLL() {
		start = null;
		n=0;
	}
	public boolean isEmpty() {
		if(start == null) {
			return true;
		}else
			return false;
	}
	public void insert_beg(int x) {
		Node NewN = new Node(x);
		if(isEmpty()) {
			start = NewN;
		}
		else {
			NewN.link = start;
			start = NewN;
		}
		n++;
	}
	public void insert_end(int x) {
		Node NewN = new Node(x);
		if(isEmpty()) {
			start = NewN;
		}else {
			Node p = start;
			while(p.link != null) {
				p = p.link;
			}
			p.link = NewN;
		}
		n++;
	}
	public void insert_pos(int x, int loc) {
		Node NewN = new Node(x);
		if(isEmpty()) {
			start = NewN;
		}else if(loc == 1) {
			insert_beg(x);
		}else if(loc == n+1) {
			insert_end(x);
		}else if(loc < 1 || loc > n+1) {
			System.out.println("No insertion");
		}else {
			int i=1;
			Node p = start;
			while(i < loc) {
				p = p.link;
				i++;
			}
			NewN.link = p.link;
			p.link = NewN;
		}
	}
	public void addBefore(Node given_ptr, int d) {
		if (start ==given_ptr) {
			
		}
	}
	public void traverse() {
		Node  p =start;
		while(p != null) {
			p.display();
			p = p.link;
		}
	}
}
