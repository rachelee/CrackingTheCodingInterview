package chap02;

public class Node {
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
	
	public static Node buildList(int []a)
	{
		Node cur = new Node(a[0]);
		Node head = cur;
		for (int i = 1; i < a.length; i++)
		{
			cur.next = new Node(a[i]);
			cur = cur.next;
		}
		return head;
	}
	
	public static void printList(Node n)
	{
		while(n != null)
		{
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.println();
	}
	
}
