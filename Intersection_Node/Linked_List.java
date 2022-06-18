package Intersection_Node;

public class Linked_List {
	static Node point1, point2;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			next = null;
		}
	}
	int getNode() {
		int p1 = getPoint(point1);
		int p2 = getPoint(point2);
		int d;
		
		if(p1 > p2) {
			d = p1 - p2;
			return getIntersection(d, point1, point2);
		}
		else {
			d = p2 - p1;
			return getIntersection(d, point2, point1);
		}
	}
	int getPoint(Node point12) {
		// TODO Auto-generated method stub
		return 0;
	}
	int getIntersection(int d, Node node1, Node node2) {
		int i;
		return 0;
	}
	
}
