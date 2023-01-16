package io.chiba.maven.domain;

import java.util.LinkedList;

public class CustomLinkedList {
	private SingleNode head = null;
	
	public CustomLinkedList() { }
	
	public void setHead(SingleNode node) {
		this.head = node;
	}
	//#impl-1
	public boolean isEmpty() {
		return (head == null);
	}
	//#impl=2
	public void InsertFirst( int data ) {
		SingleNode tmp = new SingleNode();
		tmp.data = data;
		tmp.next = head;
		head = tmp;
	}
	
	public void displayList() {
		System.out.println("List (first--> last)");
		System.out.print(" {");
		SingleNode current = head;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.print(" } \n");
	}
	
	public SingleNode deletedFirst() {
		SingleNode deletedNode = head;
		head = head.next;
		return deletedNode;
	}
	public void insert(int data) {
		if(isEmpty()) {
			InsertFirst(data);
		}else {
			SingleNode tmp = this.head;
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			SingleNode newNode = new SingleNode();
			newNode.data = data;
			tmp.next = newNode;
			newNode.next = null;
		}
	}
	
	public SingleNode reverseList() {
		
		SingleNode newHead = null;
		
		while(head.next != null) {
			SingleNode tmp = head.next;
			head.next = newHead;
			newHead = head;
			head = tmp;
		}
		head.next = newHead;
		newHead = head;
		
		return newHead;
	}
	
}


