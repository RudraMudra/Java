public class Stack {
SLL l;
public Stack()
{
	l=new SLL();
}
public boolean isEmpty()
{
	if(l.start==null)
	{
		return true;
	}
	else
		return false;
}
public void push(int x)
{
	l.insert_beg(x);
}
public int pop()
{	int k=l.start.data;
	l.delete_beg();
	return k;
}
public int peek()
{
	int k=l.start.data;
	return k;
}
}
