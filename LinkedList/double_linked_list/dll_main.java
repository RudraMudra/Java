package double_linked_list;
import java.util.*;
public class dll_main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Dll l1 =new Dll();
	System.out.println("Enter 1 for insert beg");
	System.out.println("Enter 4 for traversal forward");
	System.out.println("Enter 5 for traversal backward");
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
	case 3:
		x=sc.nextInt();
		int y=sc.nextInt();
		l1.insert_before(x, y);
		break;
	case 4:
		l1.traverse_forward();
		break;
	case 5:
		l1.traverse_backward();
		break;
	case 6:
		l1.reverse();
	}
}
}
}
