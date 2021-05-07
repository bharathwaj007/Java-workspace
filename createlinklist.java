
public class createlinklist {

	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
		
	}
	public void linklist()
	{
		Node k=head;
		while(k!=null)
		{
			System.out.print(k.data+" ");
			k=k.next;
		}
		
	}
	public void reverse(createlinklist l)
	{
		Node curr=head;
		Node pre=null;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=pre;
			pre=curr;
			curr=next;
		}
		head=pre;
		
	}
	public static void main(String[] args) {
		createlinklist a=new  createlinklist();
		Node one=a.new Node(10);
		a.head=one;
		Node sec=a.new Node(20);
		one.next=sec;
		Node third=a.new Node(30);
		sec.next=third;
		Node four=a.new Node(40);
		one.next=four;
		four.next=sec;
		a.linklist();
		a.reverse(a);
		System.out.println();
		a.linklist();
		

	}

}
