package pl.edu.pw.mini.po.part2collections.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueDemonstrator {

	public static void main(String[] args) {
		/*
		Queue<String> queue = new ArrayDeque<String>();
		queue.add("first");
		queue.add("second");
		queue.add("third");
		
		System.out.println(queue);
		
		System.out.println(queue.peek() + " " + queue.peek() + " " + queue.peek());
		System.out.println(queue.poll() + " " + queue.poll() + " " + queue.poll());
		
		System.out.println(queue);
		*/
		System.out.println();
		System.out.println("Dequeue");
		
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("first");
		deque.add("second");
		deque.add("third");
		
		System.out.println(deque);
		
		System.out.println(deque.peek() + " " + deque.peek() + " " + deque.peek());
		System.out.println(deque.poll() + " " + deque.poll() + " " + deque.poll());
		
		deque.add("first");
		deque.add("second");
		deque.add("third");
		
		System.out.println("First");
		System.out.println(deque.peekFirst() + " " + deque.peekFirst() + " " + deque.peekFirst());
		System.out.println(deque.pollFirst() + " " + deque.pollFirst() + " " + deque.pollFirst());
		
		
		deque.add("first");
		deque.add("second");
		deque.add("third");

		System.out.println("Last");
		System.out.println(deque.peekLast() + " " + deque.peekLast() + " " + deque.peekLast());
		System.out.println(deque.pollLast() + " " + deque.pollLast() + " " + deque.pollLast() + " " + deque.pollLast());
		
	}

}
