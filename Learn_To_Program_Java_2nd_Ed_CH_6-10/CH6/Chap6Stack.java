
public class Chap6Stack {
	//This program demonstrates data abstraction
	public static void main(String[] args) {
		// In This program , insert 10 numbers
		// and print all numbers pushed into stack
		
		int number = 1;
		while (!Stack.full()) {
			Stack.push(number);
			System.out.println("Number pushed is " + number);
			number++;
		}
		
		System.out.println();
		
		while (!Stack.empty()) {
			number = Stack.pop();
			System.out.println("Number popped is " + number);
		}
	}
	
	class Stack {
		//Data abstraction : Stack
		static int content[] = new int[10];
		static int index = 0;
		
		static boolean empty() {
			//return true if array has no item
            return (index == 0) ? true : false;
        }
		
		static boolean full() {
			// return true if array is filled
			return (index > 9) ? true : false;
		}
		
		static void push(int i) {
			// insert an item i into array
			content[index++] = i;
		}
		
		static int pop() {
			// remove an item i from array
			return content[--index];
		}
	}

}
