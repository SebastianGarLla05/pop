package pop;

public class MyStack {

	int top;
	public char[] stack;
	int MAX;
	
	public MyStack (int stackSize) {
		this.stack = new char[stackSize];
		MAX = this.stack.length;
		top = 0;
	}
	
	public void pop(char data)
	{
		if(top == MAX)
		System.out.println("Stack is full");
		else {
		stack[top] = data;
		top--;
		return;
		}
	}
}
