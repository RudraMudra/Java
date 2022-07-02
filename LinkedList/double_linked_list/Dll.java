package double_linked_list;

public class Dll {
node start ;
int n;
public Dll()
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
	}
	else
	{
		nnew.flink=start;
		start=nnew;
		nnew.blink=null;
	}
	n++;
}
public void insert_end(int x)
{
	node nnew = new node(x);
	if(isEmpty())
	{
		start=nnew;
	}
	else
	{
		node p=start;
		while(p.flink!=null)
		{
			p=p.flink;
		}
		nnew.blink=p;
		p.flink=nnew;
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
		p=p.flink;
		i++;
	}
	nnew.flink=p.flink;
	p.flink.blink=nnew;
	nnew.blink=p;
	p.flink=nnew;
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
	while(p.flink.data!=x)
	{
		p=p.flink;
	}
	nnew.flink=p.flink;
	p.flink.blink=nnew;
	nnew.blink=p;
	p.flink=nnew;
	n++;
}
/*public void insert_sorted(int x)
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
}*/
public void traverse_forward()
{
	node p=start;
	while(p!=null)
	{
		p.display();
		p=p.flink;
	}
}
public void traverse_backward()
{
	node p=start;
	while(p.flink!=null)
	{
		p=p.flink;
	}
	while(p.blink!=null)
	{	System.out.println(p.data);
		p.display();
		p=p.blink;
	}
}

}