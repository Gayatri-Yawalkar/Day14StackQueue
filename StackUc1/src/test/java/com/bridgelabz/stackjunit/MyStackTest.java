package com.bridgelabz.stackjunit;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;
import com.bridgelabz.stack.MyStack;
public class MyStackTest {
	@Test
	public void given3Numbers_whenAddedToStack_ShouldBeAddedToTop() {
		MyNode<Integer> firstNode=new MyNode<>(70);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(56);
		MyStack stack=new MyStack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
		boolean result=stack.myLinkedList.head.equals(thirdNode);
		assertTrue(result);
	}
}
