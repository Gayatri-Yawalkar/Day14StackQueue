package com.bridgelabz.queue;
//Uc3
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
	public void printQueue() {
		myLinkedList.printMyNodes();
	}
	public INode getRear() {
		return myLinkedList.tail;
	}
}
