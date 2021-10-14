package com.bridgelabz.linkedlist;

public class MyLinkedList {
	public INode head;
	public INode tail;
	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}
	public void addNodeAtFront(INode node) {
		if(this.head==null) {
			this.head=node;
		} else {
			INode tempNode=this.head;
			this.head=node;
			node.setNext(tempNode);
		}
		if(this.tail==null) {
			this.tail=node;
		} 
	}
	public void appendNode(INode node) {
		if(this.head==null) {
			this.head=node;
		}
		if(this.tail==null) {
			this.tail=node;
		} else {
			this.tail.setNext(node);
			this.tail=node;
		}
	}
	public void insertNodeBetweenTwoNode(INode existingNode,INode newNode){
		INode tempNode=existingNode.getNext();
		existingNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	public INode popFirstNode() {
		INode tempNode=this.head;
		this.head=this.head.getNext();
		return tempNode;
	}
	public void popLastNode() {
		INode tempNode=head;
		while(tempNode.getNext()!=null) {
			if(tempNode.getNext().equals(tail)) {
				this.tail=tempNode;
				break;
			}
			tempNode=tempNode.getNext();
		}
	}
	public void printMyNodes() {
		StringBuffer myNodes=new StringBuffer("My Nodes: ");
		INode tempNode=head;
		while(tempNode.getNext()!=null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) {
				myNodes.append("-->");
			}
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	public void printNode(INode node) {
		StringBuffer sb=new StringBuffer("Popped Node: ");
		sb.append(node.getKey());
		System.out.println(sb);
	}
	public void printNodes() {
		StringBuffer myNodes=new StringBuffer("My Nodes: ");
		INode tempNode=head;
		while(tempNode!=tail) {
			myNodes.append(tempNode.getKey());
			myNodes.append("-->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
