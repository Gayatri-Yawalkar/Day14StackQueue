package com.bridgelabz.queue;
//Uc4
import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;
public class MyQueue {
	MyLinkedList myLinkedList;
	public MyQueue() {
		myLinkedList=new MyLinkedList();
	}
	public void enqueue(INode node) {
		myLinkedList.appendNode(node);
	}
	public INode dequeue() {
		INode temp=myLinkedList.popFirstNode();
		return temp;
	}
	public void printQueue() {
		myLinkedList.printMyNodes();
	}
	public INode getRear() {
		return myLinkedList.tail;
	}
}
