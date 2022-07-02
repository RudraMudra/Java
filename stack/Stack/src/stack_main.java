public class stack_main {
public static void main(String[] args) {
Stack st= new Stack();
System.out.println("Stack");
st.push(12);
st.push(13);
st.push(15);
st.push(10);
int i=4;

while(i!=0)
{
	System.out.println(st.pop());
	i--;
}
}
}
