package com;

/**
 * LinkedList is a class of public type
 * @author rekha
 *
 */

public class LinkedList {

 //head -> null
 // head -> node -> null
 // head -> node -> node -> node -> node -> null
	
	Node head;
	
	/**
	 * creating void insert method
	 * @param data
	 * it add nodes still end reaches to null
	 */
	
	
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n =head;
			while(n.next!=null)
			{
				n = n.next;
				
			}
			
			n.next = node;
			
		}	
			}
	
	
	
	/**
	 * method add is used to add the node at index
	 * @param index
	 * @param data
	 */
	public void add(int index,int data) {
		Node newNode = new Node();
		newNode.data=data;
		newNode.next=null;
		
		if(index == 0) {
			newNode.next=head;
			head=newNode;
		}else {
			Node temp = head;
			for(int i=0;i<(index-1);i++) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
		
		
	}
	
	public void deleteFirst() {
		head=head.next;
		
	}
	
	/**
	 * deletelast is a method 
	 * @author rekha
	 * it will delet the last node in a sequence
	 *
	 */
	
	public void deleteLast() {
		Node temp = head;
		while(temp.next.next !=null) {
			temp=temp.next;
		}
		temp.next=null;
		
	}
	

/**
 *  Search method with a void type
 *  Check weather element is present or not
 *  if element is present it will print it index number 
 *
 */
	
	public void Search(int element) {
		Node temp = head;
		boolean check = true;
		int i = 0;
		while (temp.next != null) {
			if (temp.data == element) {
				System.out.println("Found " + element + " at index " + i);
				check = false;
				break;
			} else {
				i++;
			}
			temp = temp.next;
		}
		while (check) {
			i++;
			if (temp.data == element) {
				System.out.println("Found " + element + " at index " + i);
			} else {
				System.out.println("Not found");
			}
			check=false;
		}
	}
	
	/**
	 * void show method
	 * prints the node
	 */
	
	public void show()
	{
		Node node = head;
		
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}	
		System.out.println(node.data);
	}
}
