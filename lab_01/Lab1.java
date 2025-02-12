package lab_01;

public class Lab1 {
	private int top;
	private int maxSize;
	private double[] stack;
	public Lab1(int s) {
		maxSize=s;
		top=-1;
		stack=new double[maxSize];
	}
	public void push(int p) {
		if(isFull()) {
			System.out.println("Stack is full.");
		}
		else {
			stack[++top]=p;
		}
	}
	public double pop() {
		
			return stack[top--];
		
	}
	public double peek() {
		return stack[top];
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(top==maxSize-1) {
			return true;
		}
		else {
			return false;
		}
	}
}
