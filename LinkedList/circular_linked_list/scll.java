package circular_linked_list;

public class scll {

	node start ;
	int n;
	public scll()
	{
		start=null;
		n=0;
	}
	public boolean isEmpty()
	{
		if(start==null)
		{
			return true;
		}
		else 
			return false;
	}
	public void insert_beg(int x)
	{
		node nnew = new node(x);
		if(isEmpty())
		{
			start=nnew;
			nnew.link=start;
		}
		else
		{
			node p=start;
			while(p.link!=start)
			{
				p=p.link;
			}
			p.link=nnew;
			nnew.link=start;
			start=nnew;
		}
		n++;
	}
	public void insert_end(int x)
	{
		node nnew = new node(x);
		if(isEmpty())
		{
			start=nnew;
			nnew.link=start;
		}
		else
		{
			node p=start;
			while(p.link!=start)
			{
				p=p.link;
			}
			p.link=nnew;
			nnew.link=start;
		}
		n++;
	}
	public void insert_pos(int x,int loc)
	{	
		node nnew = new node(x);
		if(isEmpty())
		{
		start=nnew;
		}
		else if(loc==1)
		{
			insert_beg(x);
		}
		else if(loc==n+1)
		{
			insert_end(x);
		}
		else if(loc<1 || loc>n+1)
		{
			System.out.println("No insertion");
		}
		else {
		int i=1;
		node p=start;
		while(i<loc-1)
		{
			p=p.link;
			i++;
		}
		nnew.link=p.link;
		p.link=nnew;
		n++;
		}	
	}
	public void reverse()
	{
		
	}
	public void insert_before(int x,int y)
	{	
		node nnew = new node(y);
		node p=start;
		while(p.link.data!=x)
		{
			p=p.link;
		}
		nnew.link=p.link;
		p.link=nnew;
	}
	public void insert_sorted(int x)
	{
		node nnew = new node(x);
		if(isEmpty())
		{
			start=nnew;
		}
		else if(x<start.data)
		{
			insert_beg(x);
		}
		else {
		node p=start;
		while(p.link!=null&&p.data<x)
		{
			p=p.link;
		}
		if(p.data<x)
			insert_end(x);
		else
		insert_before(p.data,x);
	}
	}
	public void traverse()
	{
		node p=start;
		while(p.link!=start)
		{
			p.display();
			p=p.link;
		}
		p.display();
	}
	public void delete_beg()
	{
		start=start.link;
	}
}
