package DoublyLinked_List;

public class DNode {
	int data;
	DNode flink;
	DNode blink;
	
	public DNode(int d) {
		this.data = d;
		flink = blink = null;
	}
	public void display() {
		System.out.println(data + " ");
	}
}
