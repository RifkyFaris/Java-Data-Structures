package Queue;
import java.util.Scanner;
public class MainQueue {
	public static void main(String[] args) {
		Scanner myScanner=new Scanner(System.in);
		
		QueueX mainQueue=new QueueX(5);
		
		QueueX evenQueue=new QueueX(5);
		QueueX oddQueue=new QueueX(5);
		
		for(int i=1;i<6;i++) {
			System.out.print("Enter transaction ID "+i+":");
			int val=myScanner.nextInt();
			mainQueue.insert(val);
			while(!mainQueue.isEmpty()) {
				int removeVal=mainQueue.remove();
				if(removeVal%2==0) {
					evenQueue.insert(removeVal);
				}
				else {
					oddQueue.insert(removeVal);
				}
			}
			
			
			
			
		}
		System.out.println("");
		System.out.println("Even:");
		while(!evenQueue.isEmpty()) {
			int even=evenQueue.remove();
			System.out.println(even);
		}
		System.out.println("");
		System.out.println("Odd:");
		while(!oddQueue.isEmpty()) {
			int odd=oddQueue.remove();
			System.out.println(odd);
		}
		myScanner.close();
		
		
	}

}
