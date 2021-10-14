package com.bridgelabz.stackjunit;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;
import com.bridgelabz.stack.MyStack;
public class MyStackTest {
	@Test
	public void given3Numbers_whenPeakFromStack_ShouldBeLastAddedNum() {
		MyNode<Integer> firstNode=new MyNode<>(70);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(56);
		MyStack stack=new MyStack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
		boolean result=stack.peak().equals(thirdNode);
		assertTrue(result);
	}
	@Test
	public void given3Numbers_whenPopped_ShouldReturnPoppedNum() {
		MyNode<Integer> firstNode=new MyNode<>(70);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(56);
		MyStack stack=new MyStack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		INode poppedNode=stack.pop();
		stack.printStack();
		boolean result=poppedNode.equals(thirdNode);
		assertTrue(result);
	}
}
