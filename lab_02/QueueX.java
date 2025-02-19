package Queue;

public class QueueX {
	private int[] queueArr;
	private int maxSize;
	private int rear; 
	private int front;
	private int noItems;
	public QueueX(int s) {
		maxSize=s;
		rear=-1;
		front=0;
		noItems=0;
		queueArr=new int[maxSize];
		
	}
	public void insert(int j) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			queueArr[++rear]=j;
			noItems++;
		}
		
	}
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			int val=queueArr[front++];
			noItems--;
			return val;
		}
	}
	
	public boolean isEmpty() {
		if(noItems==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public boolean isFull() {
		if(noItems==maxSize) {
			return true;
		}
		else {
			return false;
		} 
	}
}
