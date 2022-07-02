package circular_linked_list;
import java.util.*;
public class circular_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		scll l1 =new scll();
		System.out.println("Enter 1 for insert beg");
		System.out.println("Enter 2 for insert end");
		System.out.println("Enter 4 for traversal");
		System.out.println("Enter 3 for insert before");
		System.out.println("Enter 5 for insert sorted");
		System.out.println("Enter 6 for reverse");
		System.out.println("Enter 0 for exit");
		System.out.println("Enter your choice");
		int ch = -1;
		int x;
		while(ch!=0)
		{	
			ch=sc.nextInt();
			switch(ch)
			{
		case 1:
			x=sc.nextInt();
			l1.insert_beg(x);
			break;
		case 2:
			x=sc.nextInt();
			l1.insert_end(x);
			break;
		case 3:
			x=sc.nextInt();
			int y=sc.nextInt();
			l1.insert_before(x, y);
			break;
		case 4:
			l1.traverse();
			break;
		case 5:
			x=sc.nextInt();
			l1.insert_sorted(x);
			break;
		case 6:
			l1.delete_beg();
		}
	}
	}
}
