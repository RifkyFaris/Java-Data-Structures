package linkedlist;

public class LinkDemo {

	public static void main(String[] args) {
		Link L1=new Link("Nipuna",53.5);
		Link L2=new Link("Aravinda",78.0);
		Link L3=new Link("Prashani",69.5);
		
		L1.next=L2;
		L2.next=L3;
		L3.next=null;
		
		LinkedList ll1=new LinkedList();
		ll1.insertFirst("Prashani", 50);
		ll1.insertFirst("Aravinda", 60);
		ll1.insertFirst("Nipuna", 80);
		
	}

}
