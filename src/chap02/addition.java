package chap02;


public class addition {
	public static Node add(Node a, Node b)
	{
		Node cur = new Node(0);
		Node head = cur;
		int buffer = 0;
		while(a != null || b != null || buffer != 0)
		{
			int sum, value;
			int val1 = 0;
			int val2 = 0;
			if (a != null)
			{
				val1 = a.data;
				a = a.next;
			}
			if (b != null)
			{
				val2 = b.data;
				b = b.next;
			}
			
			sum = val1 + val2 + buffer;
			value = sum % 10;
			buffer = sum / 10;
			
			cur.next = new Node(value);
			cur = cur.next;
		}
		return head.next;
	}
	
	public static Node recAdd(Node a, Node b, int buffer)
	{
		Node result = new Node();
		int value = buffer;
		
		if(a != null)
			value += a.data;
		if(b != null)
			value += b.data;
		
		result.data = value % 10;
		result.next = null;
		if(a != null || b != null)
		{
				Node more = recAdd(a == null ? null : a.next,
		                 b == null ? null : b.next,
		               	 value >= 10 ? 1 : 0);
				result.next = more;
		}
		return result;
				
	}
	
	
	public static void main(String[] args) {
		int[] a = {7,1,6};
		int[] b = {5,9,2};
		
		Node list1 = Node.buildList(a);
		Node list2 = Node.buildList(b);
		Node result = recAdd(list1, list2, 0);
		Node.printList(result);
	}
}
