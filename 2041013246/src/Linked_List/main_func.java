package Linked_List;
import java.util.*;

public class main_func {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SLL L1 = new SLL();
		System.out.println("Enter 1 for insert in the beginning");
		System.out.println("Enter 2 for insert at the end");
		System.out.println("Enter 3 to choose insert position");
		System.out.println("Enter 4 to do traversal");
		System.out.println("Press 0 for Exit.");
		System.out.println("You should Have a Choice First!! ");
		int ch = -1;
		while(ch != 0) {
			ch = sc.nextInt();
			switch(ch) {
			case 1: 
				int x = sc.nextInt();
				L1.insert_beg(x);
				break;
			case 4:
				L1.traverse();
				break;
			case 5:
				L1.delete_beg();
				break;
			case 6:
				L1.delete_end();
				break;
			case 7:
				int lc = sc.nextInt();
				L1.delete_pos(lc);
				break;
			}
		}
	}
}
