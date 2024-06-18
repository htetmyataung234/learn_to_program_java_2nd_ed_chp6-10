
public class Chap6StackObject {
	//This program demonstrates object instantiation
	//by revisiting the Stack example
	public static void main(String[] argv) {
		//In this program, insert 10 numbers
		//and print all numbers pushed into stack
		
		int number = 1;
		Stack s = new Stack();
		while (!s.full()) {
			s.push(number);
			System.out.println("Number pushed is " + number);
			number++;
		}
		System.out.println();
		while (!s.empty()) {
			number = s.pop();
			System.out.println("Number popped is " + number);
		}

	}
	
	static class Stack {
		// Data abstraction : Stack
		int content[] = new int[10];
		int index = 0;

		boolean empty() {
			// return true if array has no item
			return (index == 0) ? true : false;
		}

		boolean full() {
			// return true if array is filled
			return (index > 9) ? true : false;
		}

		void push(int i) {
			// insert an item i into array
			content[index++] = i;
		}

		int pop() {
			// remove an item i off the array
			return content[--index];
		}
	}

}
