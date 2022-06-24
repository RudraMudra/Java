package pratik;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*stack s=new stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.pop();
		s.pop();
		s.display();
		String str="hello";
		for(int i=0;i<str.length();i++) {
			s.push(str.charAt(i));
		}
		s.display();*/
		
		
		/*queue q=new queue(5);
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.traverse();
		q.delete();
		q.delete();
		q.traverse();
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.insert(6);
		q.insert(7);
		q.traverse();*/
		
		circular_queue c=new circular_queue(5);
		c.insert(1);
		c.insert(2);
		c.insert(3);
		c.insert(4);
		c.insert(5);
		c.traverse();
		c.delete();
		c.delete();
		c.delete();
		c.traverse();
		c.insert(6);
		c.insert(7);
		c.traverse();
		
	}

}
