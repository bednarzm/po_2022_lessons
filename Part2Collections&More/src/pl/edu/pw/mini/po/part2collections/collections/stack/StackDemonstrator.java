package pl.edu.pw.mini.po.part2collections.collections.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackDemonstrator {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.add("first");
		stack.add("second");
		stack.add("third");
		
		stack.size();
		
		System.out.println(stack);
		System.out.println(stack.peek() + " " + stack.peek() + " " + stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop() + " " + stack.pop());
		
		System.out.println("4 for");
				
		stack.add("a");
		stack.add("b");
		stack.add("c");
		for(String string : stack) {
			System.out.println("Element: " + string);
		}
		
		Iterator<String> stringIterator = stack.iterator();
		while(stringIterator.hasNext()) {
			String string = stringIterator.next();
			System.out.println("Element iterated: " + string);
		}
		
	}

}
