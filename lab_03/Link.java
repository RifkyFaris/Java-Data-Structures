package linkedlist;

public class Link {
	private String name;
	public Link next;
	private double avg;
	public Link(String name, double avg) {
		this.name=name;
		this.avg=avg;
		this.next=null;
	}
	public void displayDetails() {
		System.out.println("Name: "+name+" Average :"+avg);
	}
	public String getName() {
		
		return name;
		
	}
	
}
