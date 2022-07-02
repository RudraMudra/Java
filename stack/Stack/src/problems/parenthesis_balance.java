package problems;
import java.util.*;
public class parenthesis_balance {
public static void main(String[] args) {
	Stack<Character>st=new Stack<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.next();
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='('||ch=='['||ch=='{')
		{
			st.push(ch);
		}
		else if(ch==')'||ch==']'||ch=='}')
		{	
			if(!st.isEmpty())
		{
			char temp=st.pop();
			
			if(ch==')' && (temp!='('))
			{
				System.out.println("Mismatch at "+i);
			}
			else if(ch=='}' && (temp!='{'))
			{
				System.out.println("Mismatch at "+i);
			}
			else if(ch==']' && (temp!='['))
			{
				System.out.println("Mismatch at "+i);
			}
		}
			else if(st.isEmpty() && (ch==')'||ch=='}'||ch==']'))
			{
				System.out.println("Left missing");
			}
		}
	
	}
	if(!st.isEmpty())
	{
		System.out.println("Right missing");
	}
}
}
