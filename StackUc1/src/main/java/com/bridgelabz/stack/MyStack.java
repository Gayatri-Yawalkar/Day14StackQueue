package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;

public class MyStack {
	MyLinkedList myLinkedList;
	public MyStack() {
		myLinkedList=new MyLinkedList();
	}
	public void push(INode node) {
		myLinkedList.addNodeAtFront(node);
	}
	public void printStack() {
		myLinkedList.printMyNodes();
	}
}
