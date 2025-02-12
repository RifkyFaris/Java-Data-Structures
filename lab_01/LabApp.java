package lab_01;

public class LabApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab1 l=new Lab1(3);
		l.push(10);
		l.push(20);
		l.push(30);
		l.push(40);
		System.out.println("Peek:"+l.peek());

		System.out.println("Stack:");
		while (!l.isEmpty()) {
			System.out.println(l.pop());
		}
		
	}

}
