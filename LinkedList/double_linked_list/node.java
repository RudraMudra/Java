package double_linked_list;

public class node {
int data;
node flink;
node blink;
public node(int data)
{
	this.data=data;
	flink=blink=null;
}
public void display()
{
	System.out.print(data+" ");
}
}
