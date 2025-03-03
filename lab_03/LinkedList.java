package linkedlist;

public class LinkedList {
	private Link first;
	public LinkedList() {
		first=null;
	}
	public boolean isEmpty() {
		if(first==null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public void displayList() {
		Link current=first;
		while(current!=null) {
			current.displayDetails();
			current=current.next;
		}
	}
	public void insertFirst(String name, double avg) {
		Link newLink=new Link(name,avg);
		newLink.next=first;
		first=newLink;
	}
	public void deleteFirst() {
		if(!isEmpty()) {
			Link temp = first;
            first = first.next;
           System.out.println(temp);

		}else {
			System.out.println("List is empty.");
		}
	}
	
	public Link deleteLink(String name) {
		Link current =first;
		Link previous=first;
		
		if(isEmpty()) {
			return null;
		}
		if(current.getName().equals(name)) {
			first=first.next;
			return current;
		}
		while(current!=null && !current.getName().equals(name)) {
			previous=current;
			current=current.next;
		}
		if(current==null) {
			return null;
		}
		previous.next=current.next;
		return current;
	}
	
}
