package io.chiba.maven.Main;

import io.chiba.maven.domain.CustomLinkedList;
import io.chiba.maven.domain.SingleNode;

public class AppLinkedList {

	public static void main(String[] args) {
	
		CustomLinkedList list = new CustomLinkedList();
		list.InsertFirst(1);
		list.InsertFirst(2);
		list.InsertFirst(3);
		
		
		list.insert(5);
		list.displayList();
		list.deletedFirst();
		list.displayList();
		list.deletedFirst();
		list.displayList();
		list.deletedFirst();
		list.displayList();
		list.deletedFirst();
		list.displayList();
		
		list.insert(4);
		list.displayList();
		list.insert(5);
		list.displayList();
		list.InsertFirst(6);
		list.insert(8);
		list.displayList();
		
		list.setHead(list.reverseList());
		System.out.println("revesed list");
		list.displayList();
	}
}