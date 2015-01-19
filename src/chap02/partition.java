package chap02;

public class partition {
	class Node
	{
		Node next = null;
		int data;
		public Node()
		{
			data = 0;
		}
		public Node(int d)
		{
			data = d;
		}
		
	}
	public Node par(Node head, int x)
	{
		Node first = new Node();
		first.next = head;
		Node current = head;
		Node lastSmall = first;
		
		while(current != null)
		{
			if (current.next.data <= x)
			{
				current.next = current.next.next;
				Node temp = current;
				current = current.next;
				temp.next = lastSmall.next;
				lastSmall.next = temp;
			}
			else
				current = current.next;
				
		}
		head = first.next;
		return head;	
	}
	
}
