package com;

public class Runner {
	
	   /**
	   * main method
	   * Linked list is class creating an numberList object 
	   * @param args
	   * calling all functions 
	   */
	
public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(56);
		list.insert(30);
		list.insert(70);
	    list.insertAt(2, 40);
		list.Search(30);
		list.deleteAt(2);
		list.sortList();
		list.show();
	}

}