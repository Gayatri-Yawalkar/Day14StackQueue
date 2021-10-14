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
	public INode pop() {
		INode temp=myLinkedList.popFirstNode();
		return temp;
	}
	public INode peak() {
		return myLinkedList.head;
	}
	public void printStack() {
		myLinkedList.printMyNodes();
	}
}
