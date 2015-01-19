package chap02;

public class del {
	
	public static void delete(Node b)
	{
		if (b == null ||b.next == null)
			return;
		b.data = b.next.data;
		b.next = b.next.next;
			
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		
		Node list = Node.buildList(a);
		Node x = list;
		x = x.next.next;
		Node.printList(list);
		delete(x);
		Node.printList(list);
	}
}
