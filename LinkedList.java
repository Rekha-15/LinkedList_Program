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
