package pratik;

public class circular_queue {
	int a[];
	int r;
	int f;
	int max;
	public circular_queue(int m) {
		r=-1;
		f=-1;
		max=m;
		a=new int[max];
	}
	boolean isEmpty() {
		if(r==-1)
			return true;
		else
			return false;
	}
	void insert(int x)
	{
		if(f==(r+1)%max) {
			System.out.println("cannot insert as it exceeds the current size");
			return;
		}
		if(isEmpty()) {
			r=(r+1)%max;
			f=(f+1)%max;
			a[r]=x;
		}
		else
		{
			r=(r+1)%max;
			a[r]=x;
		}
	}
	void delete() {
		if(isEmpty()) {
			System.out.println("cannot be deleted as the queue is currently empty");
			return;
		}
		if(f==r) {
			r=-1;
			f=-1;
			return;
		}
		f=(f+1)%max;
		
	}
	void traverse() {
		if(isEmpty()) {
			System.out.println("the queue is currently empty");
			return;
		}
		if(r>f) {
			for(int i=f;i<=r;i++) {
				System.out.print(a[i]+" ");
			}
		}
		else {
			for(int i=f;i<=max-1;i++) {
				System.out.print(a[i]+" ");
			}
			for(int i=0;i<=r;i++) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
	}

}
