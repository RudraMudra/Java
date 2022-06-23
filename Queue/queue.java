package Queue;

public class queue {
	int a[];
	int r;
	int f;
	int max;
	public queue(int m) {
		r = -1;
		f = -1;
		max = m;
		a = new int[max];
	}
	boolean isEmpty() {
		if(r == -1)
			return true;
		else
			return false;
	}
	void insert(int x) {
		if(r == (max-1)) {
			System.out.println("can't insert as it exceeds max size. ");
			return;
		}
		if(isEmpty()) {
			r++;
			f++;
			a[r] = x;
		}
		else{
			r++;
			a[r] = x;
		}
	}
	void delete() {
		if(isEmpty()) {
			System.out.println("can't delete as the  queue is empty. ");
			return;
		}
		if(f==r) {
			r=-1;
			f=-1;
		}
		
		int d = a[f];
		f++;
	}
	void traverse() {
		if(isEmpty()) {
			System.out.println("The queue is now empty. ");
			return;
		}
		for(int i=f; i<=r; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}
}
