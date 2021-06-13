package com;

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
