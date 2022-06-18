package CircularLinked_List;

public class CNode {
	Node start;
	int n = 0;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void insert_beg(int x) {
		
		Node NewN = new Node(x);
		
		if (n==0) {
			start = NewN;
			NewN.next = NewN;
		} 
		else {
			NewN.next = start.next;
			start.next = NewN;
		}
		n++;
	}
	
	public void insert_end(int x) {
		
		Node NewN = new Node(x);
		
		if (n==0) {
			start = NewN;
			NewN.next = NewN;
		} 
		else {
			NewN.next = start.next;
			start.next = NewN;
			start = NewN;
		}
		n++;
	}
	
	public boolean searchList(int x) {
		Node NewN = start;
		
		for (int i = 0; i < n; i++) {
			if (NewN.data == x)
			return true;
			NewN = NewN.next;
		}
		
		return false;
	}
	
	public void display() {
		if (n==0) 
			return;
		
		Node NewN = start.next;
		
		while (NewN != start) {
			System.out.print(NewN.data + " ");
			NewN = NewN.next;
		}
		System.out.print(NewN.data);
	}
	
//	public int delete_beg() throws IllegalStateException {
//		if (n==0) {
//			throw new IllegalStateException("EmptyListException");
//		}
//			
//		int value = start.next.data;
//		if (start == start.next)
//			start = null;
//		else
//			start.next = start.next.next;
//		n--;
//		return value;
//	}

public static void main(String[] args) {
	
	CNode cll=new CNode();
	
	cll.insert_beg(1);
	cll.insert_beg(2);
	cll.insert_beg(3);
	cll.display();
	System.out.println();
	
	cll.insert_end(5);
	cll.insert_end(6);
	
	System.out.println();
	System.out.println(cll.searchList(5));
	cll.display();
	
	System.out.println();
//    cll.delete_beg();
    }

}