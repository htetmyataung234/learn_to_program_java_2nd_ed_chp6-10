
public class Chap6InsertRemove {
	static int content[] = new int[10];
	static int index = 0;
	
	static boolean empty() {
	return (index == 0 ) ?true:false;
	}
	
	static boolean full() {
		//returns true if array is filled
		return (index > 9) ?true:false;
	}
	static void push(int i) {
		//insert an item i into array
		content[index++] = i;
	}

	static int pop() {
		// remove an item i from array
		return content[--index];
	}
	
	public static void main (String argv[]) {
		//In this program, insert 10 numbers
		// and print all numbers pushed into content
		int number = 1;
		while (!full()) {
			push(number);
			System.out.println("Number pushed is " + number);
			number++;
		}
		System.out.println();
		
		while(!empty()) {
			number = pop();
			System.out.println("Number popped is " + number);
			
		}
	}
}