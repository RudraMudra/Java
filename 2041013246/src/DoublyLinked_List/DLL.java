package DoublyLinked_List;

public class DLL {
	DNode start;
	int n;
	public DLL() {
		start = null;
		n=0;
	}
	public void insert_beg(int x) {
		DNode  NewN = new DNode(x);
		if(start == null)
			start = NewN;
			else {
				NewN.flink = start;
				start.blink = NewN;
				start = NewN;
			}
		n++;
	}
	public void insert_end(int x) {
		DNode NewN = new DNode(x);
	}
}
