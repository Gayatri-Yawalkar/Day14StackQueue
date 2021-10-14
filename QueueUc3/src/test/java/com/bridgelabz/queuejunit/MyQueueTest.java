package com.bridgelabz.queuejunit;
//Uc3
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;
import com.bridgelabz.queue.MyQueue;
public class MyQueueTest {
	@Test
	public void given3Numbers_whenEnqueue_ShouldBeAddedToLast() {
		MyNode<Integer> firstNode=new MyNode<>(56);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(70);
		MyQueue queue=new MyQueue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.printQueue();
		boolean result=queue.getRear().equals(thirdNode);
		assertTrue(result);
	}
	@Test
	public void given3Numbers_whenDequeue_ShouldReturnDequeuedNum() {
		MyNode<Integer> firstNode=new MyNode<>(56);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(70);
		MyQueue queue=new MyQueue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.printQueue();
		INode poppedNode=queue.dequeue();
		queue.printQueue();
		boolean result=poppedNode.equals(firstNode);
		assertTrue(result);
	}
}
