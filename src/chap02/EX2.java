package chap02;
import java.util.*;
public class EX2 {
	class Node
	{
		Node next = null;
		int data;
	}
	public static Node kthElem(Node n, int k)
	{
		Stack<Node> st = new Stack<Node>();
		while (n != null)
		{
			st.push(n);
			n = n.next;
		}
		
		int count = 0;
		while (count < k)
		{
			st.pop();
			count++;
		}
		Node result = st.pop();
		return result;
	}
	
}
